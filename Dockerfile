FROM openjdk:8-jre-alpine
EXPOSE 8280
ADD build/libs/social-login-0.0.1-SNAPSHOT.jar app.jar
CMD java -jar app.jar