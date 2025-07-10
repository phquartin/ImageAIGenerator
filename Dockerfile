FROM eclipse-temurin:21
WORKDIR /app
COPY target/minha-aplicacao-spring.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
