FROM adoptopenjdk/openjdk11-openj9
WORKDIR /app
COPY build/libs/demometrics-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]