# Kubernetes Artifacts for Tomcat 8.0

This folder contains artifacts for deploying Tomcat 8.0 in Kubernetes.

## How to deploy

    kubectl create -f *.yaml
    kubectl get pods
    kubectl get services

## Accessing Tomcat UI

    http://<kubernetes-node>:32001

## How to manually scale

    kubectl scale --replicas=2 rc tomcat
