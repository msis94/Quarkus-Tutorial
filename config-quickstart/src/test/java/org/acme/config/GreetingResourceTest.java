package org.acme.config;

import groovyjarjarantlr4.v4.codegen.model.LabeledOp;
import io.quarkus.test.junit.QuarkusTest;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {
    private static final Logger LOG = Logger.getLogger(logging.class);
    @Test
    public void testHelloEndpoint() {
        LOG.info("Greeting quarkus");
        given()
          .when().get("/greeting")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}