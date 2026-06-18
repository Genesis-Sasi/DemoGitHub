FROM eclipse-temurin:21-jdk
EXPOSE 8080
ADD target/springbootrepogithubactions.jar springbootrepogithubactions.jar
ENTRYPOINT ["java", "-jar", "springbootrepogithubactions.jar"]