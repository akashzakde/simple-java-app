FROM openjdk:8
EXPOSE 8080
ADD target/devops-code-*.jar devops-code.jar
ENTRYPOINT ["java","-jar","devops-code.jar"]
