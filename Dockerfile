FROM amazoncorretto:17

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar employee.jar

CMD ["java", "-jar", "employee.jar"]