FROM openjdk:11.0.11-jre

ADD target/KTPM_Tuan04-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT exec java -jar app.jar

#  mvn clean package -DskipTests && docker build -t  spring-boot-docker .
# docker run -p 8080:8080 -t spring-boot-docker