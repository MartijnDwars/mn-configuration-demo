FROM openjdk:14-alpine
COPY target/configuration-demo-*.jar configuration-demo.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "configuration-demo.jar"]