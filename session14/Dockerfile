FROM openjdk:17-alpine
EXPOSE 8080
ADD target/hi-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]