FROM adoptopenjdk/openjdk11
ADD build/libs/user-info-service-0.0.1-SNAPSHOT.jar user-info-service-0.0.1-SNAPSHOT.jar
EXPOSE 7081
ENTRYPOINT ["java","-jar","user-info-service-0.0.1-SNAPSHOT.jar"]
