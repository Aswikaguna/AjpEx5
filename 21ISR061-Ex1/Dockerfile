# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at the specified working directory
COPY target/helloworld-0.0.1-SNAPSHOT.jar helloworld-0.0.1-SNAPSHOT.jar

# Expose a port (e.g., 8080) for your Spring Boot application
EXPOSE 8080

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "helloworld-0.0.1-SNAPSHOT.jar"]