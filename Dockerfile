FROM chandan374/java17_maven_git
WORKDIR /app
COPY ./target/t.jar .
CMD ["java", "-jar", "t.jar"]
