FROM openjdk:21
WORKDIR /app

ENV DB_HOST=dpg-cvas4b2j1k6c7390qrl0-a.singapore-postgres.render.com
ENV DB_PORT=5432
ENV DB_NAME=users_fbeh
ENV DB_USER=yen
ENV DB_PASSWORD=fmqQFPZCKyhZfOmB52nAvI4srpnqHemo

COPY user-service.jar user-service.jar
CMD ["java", "-jar", "user-service.jar"]
