#FROM alpine:3.14
#RUN apk update && apk add openjdk11
#RUN mkdir /aplicacao/
#WORKDIR /aplicacao/
#COPY build/libs/com.example.add-0.0.1.jar .
#CMD ["java", "-jar", "com.example.add-0.0.1.jar"]


#FROM ubuntu:latest
#RUN apt-get update && apt-get install -y openjdk-17-jdk
#RUN mkdir /aplicacao/
#WORKDIR /aplicacao/
#COPY build/libs/com.example.add-0.0.1.jar .
#CMD ["java", "-jar", "com.example.add-0.0.1.jar"]


# Use the official gradle image to create a build artifact.
FROM gradle:6.7 as builder

# Copy local code to the container image.
COPY build.gradle.kts .
COPY gradle.properties .
COPY src ./src

# Build a release artifact.
RUN gradle installDist

FROM openjdk:17-jdk
EXPOSE 8080:8080
RUN mkdir /app
COPY . .
WORKDIR /app/bin
CMD ["java", "-jar", "com.example.add-0.0.1.jar"]