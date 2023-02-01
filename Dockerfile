FROM openjdk:21-slim-buster
#ENV APP_HOME=/usr/app/
WORKDIR /app
ADD ./target/ecfback-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]