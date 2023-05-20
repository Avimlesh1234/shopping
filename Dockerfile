FROM openjdk:1.8
EXPOSE 8081
ADD target/*.jar cps-docker.jar
ENTRYPOINT ["java","-jar","/cps-docker.jar"]