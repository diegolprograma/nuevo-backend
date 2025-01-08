FROM amazoncorretto:13-alpine

COPY target/diego-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java" , "-jar" , "/app.jar"] 
