FROM amazoncorretto:11
ARG JAR_FILE=target/*.jar
COPY --chmod=755 ./run.sh .
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["./run.sh"]