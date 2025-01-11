FROM openjdk:17
EXPOSE 8080
ARG JAR_FILE=target/kube-0.0.1.jar
COPY ${JAR_FILE} kube-demo.jar
ENTRYPOINT ["java","-jar","/kube-demo.jar"]