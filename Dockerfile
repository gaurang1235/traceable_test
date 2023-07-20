FROM openjdk
COPY ./traceable-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "traceable-0.0.1-SNAPSHOT.jar"]