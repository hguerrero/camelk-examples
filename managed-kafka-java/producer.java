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