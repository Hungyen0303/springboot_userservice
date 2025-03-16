FROM openjdk:17
WORKDIR /app
COPY target/user-service.jar user-service.jar
CMD ["java", "-jar", "user-service.jar"]
