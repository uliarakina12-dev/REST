FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Безопасность: не root
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# Копируем именно ваш jar
COPY target/authorization-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]