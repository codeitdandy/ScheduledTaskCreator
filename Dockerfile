FROM openjdk:8-jdk-alpine
ADD . /opt/app
COPY ./taskScheduler-0.0.1-SNAPSHOT.jar /opt/app
WORKDIR /opt/app
CMD ["java" ,"-jar", "taskScheduler-0.0.1-SNAPSHOT.jar"]




