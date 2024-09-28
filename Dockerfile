# Use the latest Jenkins base image
FROM jenkins/jenkins:lts

# Switch to root user to install packages
USER root

# Install OpenJDK 17 and necessary tools
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    wget \
    unzip \
    && rm -rf /var/lib/apt/lists/*  # Clean up APT when done

# Install Gradle 8.7
RUN wget https://services.gradle.org/distributions/gradle-8.7-bin.zip \
    && unzip gradle-8.7-bin.zip -d /opt/ \
    && ln -s /opt/gradle-8.7/bin/gradle /usr/bin/gradle \
    && rm gradle-8.7-bin.zip  # Clean up Gradle zip

# Set JAVA_HOME environment variable
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH="$PATH:$JAVA_HOME/bin"

# Switch back to the Jenkins user
USER jenkins
