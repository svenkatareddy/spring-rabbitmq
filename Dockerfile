FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY build/libs/*.jar springboot-rabbitmq.jar
ENTRYPOINT ["java","-jar","/springboot-rabbitmq.jar"]
