FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD dubbopro-server.jar dubbopro-server.jar
RUN echo "Asia/Shanghai" > /etc/timezone
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dubbopro-server.jar"]
