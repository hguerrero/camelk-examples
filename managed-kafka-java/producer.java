// how-to-run: kamel run --property-file managed-kafka.properties producer.java
// camel-k: language=java dependency=mvn:org.apache.kafka:kafka-clients:2.7.0

import org.apache.camel.builder.RouteBuilder;
/**
 * producer
 */
public class producer extends RouteBuilder {
        @Override
        public void configure() throws Exception {
            from("timer:start?period=10000")
            .setBody().constant("hello world!")
            .to("kafka:{{topic}}");
        }
}