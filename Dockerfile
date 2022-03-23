
ARG java_version
ARG maven_version


COPY target/*.war mywebapp.war
ENTRYPOINT ["java","-jar","/mywebapp.war"]
EXPOSE 9000
