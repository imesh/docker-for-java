# Docker for Java Developers

This repository contains MSF4J Hello World Microservice and a sample Docker client.

## How to run MSF4J Hello World Microservice

    cd msf4j/helloworld
    # Set JAVA_HOME pointing to JDK 1.8 home directory
    mvn clean install
    # Run self contained JAR
    java -jar target/helloworld-*.jar
    curl http://localhost:8080/hello/java-colombo


## How to run Docker Client

    cd docker-client
    mvn clean install
    cd target 
    unzip docker-client-1.0.0-SNAPSHOT.zip
    cd docker-client-1.0.0-SNAPSHOT/bin
    ./run.sh

