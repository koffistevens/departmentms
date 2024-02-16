FROM chandan374/java17_maven_git
WORKDIR /app
COPY ./target/department-ms-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "department-ms-0.0.1-SNAPSHOT.jar"]
