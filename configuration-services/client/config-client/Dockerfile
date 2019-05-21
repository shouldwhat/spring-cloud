FROM openjdk:8-jdk-alpine
#VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
# 
#	-Dspring.profiles.active=prod (cs-prod.yml)
#	-Dspring.profiles.active=dev (cs-dev.yml)
#
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod", "/app.jar"]