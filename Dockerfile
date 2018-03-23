FROM openjdk:8-jdk-alpine
FROM maven:3.5-jdk-8-alpine

VOLUME /tmp

ADD target/user-management-1.0.jar user-management.jar

ENV JAVA_OPTS=""

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /user-management.jar