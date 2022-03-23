
ARG java_version
ARG maven_version

FROM maven:${maven_version}-openjdk-${java_version}-slim

COPY target/*.war mywebapp.war
ENTRYPOINT ["java","-jar","/mywebapp.war"]
EXPOSE 9000
