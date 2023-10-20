FROM openjdk:17

ADD target/springjenkins.jar springjenkisn.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/springjenkins.jar"]