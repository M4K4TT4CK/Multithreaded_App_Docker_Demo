FROM openjdk:11-jdk
LABEL authors="michaelmcmillin"
COPY ./target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/D387_sample_code-0.0.2-SNAPSHOT.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","D387_sample_code-0.0.2-SNAPSHOT.jar"]
