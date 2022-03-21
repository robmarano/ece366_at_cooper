#!/bin/bash

# from https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
mvn archetype:generate \
    -DgroupId=edu.cooper.ece366.tutorials \
    -DartifactId=test-ng \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false

