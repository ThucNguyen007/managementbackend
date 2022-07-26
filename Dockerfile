FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
EXPOSE 5050
ARG JAR FILE
COPY target/ProductDevelopment-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [“java","-jar","/app.jar"]