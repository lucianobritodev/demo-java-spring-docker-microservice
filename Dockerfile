FROM openjdk
RUN mkdir /app
COPY ./target/demo-app-docker-0.0.1-SNAPSHOT.jar /app
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "/app/demo-app-docker-0.0.1-SNAPSHOT.jar" ]