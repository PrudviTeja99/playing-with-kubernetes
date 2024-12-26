FROM openjdk:23
WORKDIR /opt/student
COPY target/*.jar /opt/student/app.jar
ENTRYPOINT ["java","-jar","app.jar"]