# Usando a imagem oficial do Maven para construção da aplicação
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Usando a imagem oficial do OpenJDK para rodar a aplicação
FROM openjdk:17-jdk-slim
COPY --from=build /app/target/hotel-reservation-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
