FROM kurczews/alpine-fullstack

RUN apk add openjdk8-jre

COPY target/lib/ /opt/lib/

COPY target/mini-server-*.jar /opt/app.jar

ENTRYPOINT ["java", "-jar", "/opt/app.jar"]