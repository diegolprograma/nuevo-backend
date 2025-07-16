FROM amazoncorretto:17-alpine-jdk
WORKDIR /app
COPY --from=build /app/target/diego-0.0.1-SNAPSHOT.jar diego-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dserver.port=${PORT}", "-jar", "diego-app.jar"]




