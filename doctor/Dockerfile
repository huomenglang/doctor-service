FROM openjdk:21 AS build

WORKDIR /app

COPY build/libs/doctor-0.0.1-SNAPSHOT.jar doctor-0.0.1-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "doctor-0.0.1-SNAPSHOT.jar"]