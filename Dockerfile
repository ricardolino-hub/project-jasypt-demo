FROM maven:3.9.9-eclipse-temurin-23 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:23-jre
WORKDIR /app
COPY --from=build /app/jasypt-web/target/*.war app.war

# Secret B:
ENV INTERNAL_APP_KEY=ENC(if//dD5GiUSIPPG13XG+ghfpk3CiqMI3pq01XjXzQQdDIPxzFzah/u/x32/l6NI+)
#ENV INTERNAL_APP_KEY=123456-internal

ENTRYPOINT ["java", "-Djasypt.encryptor.password=${JASYPT_ENCRYPTOR_PASSWORD}", "-jar", "app.war"]