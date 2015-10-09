#!/bin/sh

# Create the archetype
cd ./base-project
mvn clean
mvn archetype:create-from-project -Darchetype.properties=../archetype.properties

# Install the archetype
cd ./target/generated-sources/archetype
mvn clean install
