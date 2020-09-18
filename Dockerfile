FROM java:8
MAINTAINER blackmanba<wen578351314@gmail.com>

ADD /target/test-docker.jar /app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]

EXPOSE 8080