FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo.jar
RUN jar -xf demo.jar
RUN find  . -type d -maxdepth 1
RUN find ./BOOT-INF -type f
RUN cp ./BOOT-INF/classes/start.sh ./
RUN cp ./BOOT-INF/classes/stop.sh ./
ENTRYPOINT ["/bin/sh","start.sh"]