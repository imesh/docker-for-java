# Kubernetes Artifacts for Tomcat 8.0

This folder contains artifacts for deploying Tomcat 8.0 in Kubernetes.

## How to deploy

    # Setup a Kubernetes cluster
    # https://github.com/imesh/kubernetes-vagrant-setup
    
    # Deploy replication controller and service
    kubectl create -f *.yaml
    
    # Wait until pod status change to Running
    kubectl get pods
    
    # Check the deployed services
    kubectl get services

## Accessing Tomcat UI

    http://<kubernetes-node>:32001

## How to manually scale

    kubectl scale --replicas=2 rc tomcat
    kubectl get pods
