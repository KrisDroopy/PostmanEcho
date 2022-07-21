import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {

@Test
    public void test() {
    given()
            .baseUri("https://postman-echo.com")
            .body("KrisDroopy")

            .when()
            .post("/post")

            .then()
            .statusCode(200)
            .body("data", equalTo("Kris"))
    ;
}
}

