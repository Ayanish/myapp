
ARG java_version
ARG maven_version

FROM maven:${maven_version}-openjdk-${java_version}-slim

COPY target/*.war webapp.war
ENTRYPOINT ["java","-jar","/web.war"]
EXPOSE 9000
