FROM openjdk:11.0.2
COPY target/request-service-*.jar request-service.jar
CMD ["java", "-XX:+UseContainerSupport", "-XX:MaxRAMPercentage=75.0", "-jar", "/request-service.jar"]