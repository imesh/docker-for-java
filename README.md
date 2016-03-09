# Docker for Java Developers

This repository contains following Java applications:
- MSF4J Hello World Microservice
- Docker Client

## How to run MSF4J Hello World Microservice
````
cd msf4j/helloworld
# Set JAVA_HOME pointing to JDK 1.8 home directory
mvn clean install
# Run self contained JAR
java -jar target/helloworld-*.jar
curl http://localhost:8080/hello/java-colombo
````

## How to run Docker Client

