FROM openjdk:11
ARG JAR_FILE=target/*.jar
RUN mkdir /opt/backend
COPY ${JAR_FILE} /opt/backend/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/opt/backend/app.jar"]