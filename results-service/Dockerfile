FROM amazoncorretto

# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/results-service-1.0-SNAPSHOT.jar /app

# Exposing port 81
EXPOSE 82

# Starting the application
CMD ["java", "-jar", "results-service-1.0-SNAPSHOT.jar"]