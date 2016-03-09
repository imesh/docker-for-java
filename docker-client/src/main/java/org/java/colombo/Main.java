/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.java.colombo;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;

import java.util.Date;
import java.util.List;

/**
 * Docker client sample.
 */
public class Main {

    public static void main(String[] args) {

        DockerClientConfig config = DockerClientConfig.createDefaultConfigBuilder()
                .withDockerHost("tcp://192.168.99.100:2376").build();
        DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();

        ListImagesCmd cmd = dockerClient.listImagesCmd();
        System.out.println("Executing docker images command...");
        List<Image> images = cmd.exec();
        for(Image image : images) {
            System.out.println(new Date(image.getCreated() * 1000) + " - "
                    + image.getId() + " - "
                    + image.getRepoTags()[0] + " - "
                    + image.getVirtualSize());
        }
    }
}
