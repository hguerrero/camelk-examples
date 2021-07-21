// camel-k: language=js

// Write your routes here, for example:
rest('/')
    .post()
      .consumes("application/json")
      .produces("application/json")
    .to("direct:post")

from("direct:post")
    .unmarshal().json()
    .to("log:info")
    .process(e => handlePost(e))
    .marshal().json()
    .to("log:info")

function handlePost(e) {
    var result = {
        body: e.getIn().getBody(),
        name: e.getIn().getBody().get("name"),
        timestamp: Date.now()
    }
    e.getOut().setBody(result)
}
