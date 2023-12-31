FROM openjdk:17-jdk-alpine

EXPOSE 8080

WORKDIR /app

ADD target/DockerFile-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]