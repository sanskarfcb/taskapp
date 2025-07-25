FROM openjdk:21-slim
WORKDIR /app
COPY target/Task-App-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]