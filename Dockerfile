FROM openjdk:21
EXPOSE 8080
ADD target/springbootrepogithubactions.jar springbootrepogithubactions.jar
ENTRYPOINT {"java", ".jar", "springbootrepogithubactions.jar"}