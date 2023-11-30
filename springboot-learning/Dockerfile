FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/demo.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar", "&"]
