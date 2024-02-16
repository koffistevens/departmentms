FROM chandan374/java17_maven_git
WORKDIR /app
COPY ./target/department-ms-latest.jar .
CMD ["java", "-jar", "department-ms-latest.jar"]
