# base image
FROM jenkins

#root user
USER root

# Maven setup
RUN ["/bin/bash", "-c", "wget http://ftp.unicamp.br/pub/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz"]
RUN ["/bin/bash", "-c", "tar -xvf apache-maven-3.3.9-bin.tar.gz"]
RUN ["/bin/bash", "-c", "mv ./apache-maven-3.3.9 /opt"]
RUN ["/bin/bash", "-c", "chmod 777 /opt/apache-maven-3.3.9"]
RUN ["/bin/bash", "-c", "echo M2_HOME=/opt/apache-maven-3.3.9 >> /etc/environment"]
RUN ["/bin/bash", "-c", "ln -s /opt/apache-maven-3.3.9/bin/mvn /usr/bin/mvn"]

# creates repo dir
RUN ["/bin/bash", "-c", "mkdir /usr/repository"]

# gives permission to user jenkins on repository dir
RUN ["/bin/bash", "-c", "chown -R jenkins:jenkins /usr/repository"]

# copy jenkins settings 
COPY jenkins_settings /var/jenkins_home
RUN ["/bin/bash", "-c", "chmod 777 -R /var/jenkins_home"]
