FROM 192.168.159.136:5000/java:8u111-jre-alpine as dev

ADD target/drone-java-ci-demo-*-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=28081", "--server.address=0.0.0.0", "--server.register=false"]
