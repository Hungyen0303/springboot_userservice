FROM openjdk:21
WORKDIR /app
COPY user-service.jar user-service.jar
CMD ["java", "-jar", "user-service.jar"]
