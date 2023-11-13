package org.mon;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PokedexResourceTest {

    @Test
    public void testListEndpoint() {
        given()
          .when().get("pokemon/list")
          .then()
             .statusCode(200)
             .body(containsString("0001"));
    }

    @Test
    public void testNumberEndpoint() {
        given()
                .pathParam("number", "0001")
                .when().get("pokemon/number?number={number}")
                .then()
                .statusCode(200)
                .body(containsString("Bulbasaur"));
    }

    @Test
    public void testNumberEndpointError() {
        given()
                .pathParam("number", "9999")
                .when().get("pokemon/number?number={number}")
                .then()
                .statusCode(200)
                .body(is("No pokemon exists with that number!"));
    }

    @Test
    public void testNameEndpoint() {
        given()
                .pathParam("name", "Bulbasaur")
                .when().get("pokemon/name?name={name}")
                .then()
                .statusCode(200)
                .body(containsString("0001"));
    }

    @Test
    public void testNameEndpointError() {
        given()
                .pathParam("name", "Agumon")
                .when().get("pokemon/name?name={name}")
                .then()
                .statusCode(200)
                .body(is("No pokemon exists with that name!"));
    }

    @Test
    public void testTypeEndpoint() {
        given()
                .pathParam("type", "GRASS")
                .when().get("pokemon/type?type={type}")
                .then()
                .statusCode(200)
                .body(containsString("0001"));
    }

    @Test
    public void testTypeEndpointError() {
        given()
                .pathParam("type", "DIGIMON")
                .when().get("pokemon/type?type={type}")
                .then()
                .statusCode(200)
                .body(is("Invalid type input. Use /pokemon/listTypes endpoint to see available Pokemon types."));
    }

}