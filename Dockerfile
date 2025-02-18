FROM amazoncorretto:17-alpine-jdk
COPY target/diego-0.0.1-SNAPSHOT.jar /diego-app.jar
ENTRYPOINT ["java", "-jar", "/diego-app.jar"]
