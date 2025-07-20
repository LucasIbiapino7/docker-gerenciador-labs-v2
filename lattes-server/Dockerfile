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
ENV SERVER_PORT=${LATTES_SERVER_PORT:-8000}

COPY --from=builder /app/target/*.jar app.jar

# Expõe a porta configurada para o Lattes service
EXPOSE ${LATTES_SERVER_PORT:-8000}

ENTRYPOINT ["java","-jar","/app/app.jar"]
