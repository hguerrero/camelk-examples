// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class Route extends RouteBuilder {
  @Override
  public void configure() throws Exception {

      // Write your routes here, for example:
      from("timer:java?period=10000")
        .routeId("java")
        .setHeader("Authorization")
          .simple("Bearer {{token}}")
        .to("https://echo-api.3scale.net")
        .to("log:info?multiline=true");

  }
}
