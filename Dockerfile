FROM public.ecr.aws/docker/library/openjdk:17
MAINTAINER HEMANTH
EXPOSE 8080
COPY target/render-test-0.0.1-SNAPSHOT.jar render-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/render-test-0.0.1-SNAPSHOT.jar"]
