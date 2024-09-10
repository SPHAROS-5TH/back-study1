FROM openjdk:17
COPY ./build/libs/study-0.0.1-SNAPSHOT.jar test-app.jar
ENTRYPOINT ["java","-jar","test-app.jar"]