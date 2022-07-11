FROM openjdk:11
EXPOSE 3000
ADD target/jenkin-docker-integration-sample.jar jenkin-docker-integration-sample.jar
ENTRYPOINT ["java","-jar","/jenkin-docker-integration-sample.jar"]