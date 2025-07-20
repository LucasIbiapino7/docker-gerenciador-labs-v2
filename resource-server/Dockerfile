# 1) Build
FROM maven:3.9.7-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# 2) Runtime
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Variáveis de ambiente
ENV SPRING_PROFILES_ACTIVE=dev \
    SERVER_PORT=8080

# Copia o jar gerado
COPY --from=builder /app/target/*.jar app.jar

# Expõe a porta do resource server
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
