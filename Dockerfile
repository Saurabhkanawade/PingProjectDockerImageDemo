FROM openjdk:11
ADD target/pingproject-0.0.1-SNAPSHOT.jar pingservice.jar
ENTRYPOINT ["java","-jar","/pingservice.jar"]