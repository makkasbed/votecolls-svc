FROM amazoncorretto

# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/election-service-1.0-SNAPSHOT.jar /app

# Exposing port 81
EXPOSE 81

# Starting the application
CMD ["java", "-jar", "spring-0.0.1-SNAPSHOT.jar"]