FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -DskipTests

FROM eclipse-temurin:21-jre
LABEL maintainer="phquartin.dev@gmail.com"
WORKDIR /app
COPY --from=build /app/target/*.jar /app/docker-file.jar
ENTRYPOINT ["java", "-jar", "docker-file.jar"]
EXPOSE 8080