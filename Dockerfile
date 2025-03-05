FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN javac src/Main.java
CMD ["java", "-cp", "src", "Main"]
