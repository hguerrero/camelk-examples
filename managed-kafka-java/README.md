# Accessing Red Hat OpenShift Streams for Apache Kafka

This a simple Apache Camel K example using the Java DSL to access the Red Hat managed Kafka.

## Before you start

Access [cloud.redhat.com](https://cloud.redhat.com/beta/application-services/streams/) to log into your account and create your cluster. You will also need to create the topic `topic-test` in advance as the service does not allow auto creation of topic resources.

You will need to create a _service account_ to get the credentials used for the SASL_PLAIN security mechanism. 

You can use the [Red Hat OpenShift Application Services CLI](https://developers.redhat.com/products/rhosak/download) to create a service account from the terminal using the following command:

```shell
rhoas serviceaccount create --name my-service-account --file-format properties 
```

> Note: you can change the `--file-format` to use `json` `properties` or `env` .

This will return a file in the same location you execute the command with the information on the _client id_ and _client secret_ required to run the example.

## Run

Issue the following command to start running your integration with the dev mode enabled:

```shell
kamel run --property-file managed-kafka.properties producer.java --dev
```

### Known Issues

Be sure to have the Kafka clients dependency updated to use a recent release, as Red Hat managed Kafka is using the TLSv1.3 version and older clients don't support it.