import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldReturnValue() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello"))
        ;
    }
}
