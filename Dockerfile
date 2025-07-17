FROM eclipse-temurin:21
LABEL maintainer="phquartin.dev@gmail.com"
WORKDIR /app
COPY target/SpringDockerFile-0.0.1-SNAPSHOT.jar /app/docker-file.jar
ENTRYPOINT ["java", "-jar", "docker-file.jar"]
EXPOSE 8080
