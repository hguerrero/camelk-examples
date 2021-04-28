# Apache Camel K Examples

This repository contains a set of examples to be used with Apache Camel K and other open source components. 

* [Red Hat OpenShift Streams for Apache Kafka](mangaged-kafka-java): A simple Java DSL example on how to use a Camel K route to produce a `hello world` message every 10 seconds.
* [File upload OpenAPI](file-upload-openapi-yaml): A very basic service using OpenAPI specification using the YAML DSL to upload a text file and change it to uppercase.

## System Requirements

These applications are designed to be run with Apache Kafka 2.6.x versions or superior.

To compile and run these projects you will also need:

- Docker:
  - Docker version 1.11 or later is [installed and running](https://docs.docker.com/engine/installation/).
  - Docker Compose is [installed](https://docs.docker.com/compose/install/). Docker Compose is installed by default with Docker for Mac.
  - Docker memory is allocated minimally at 8 GB. When using Docker Desktop for Mac, the default Docker memory allocation is 2 GB. You can change the default allocation to 8 GB in **Docker** > **Preferences** > **Advanced**.
- [Git](https://git-scm.com/downloads).
- [jq](https://stedolan.github.io/jq/) JSON processor
- [Kafkacat](https://github.com/edenhill/kafkacat) utility
- JDK 8 or 11+
- Maven 3
- GraalVM Community
- Internet connectivity
- Red Hat OpenShift Application Services account.