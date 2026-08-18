package com.contacts.ContactsApp.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//Spring boots your whole app + starts a real Tomcat server on a free port.

class ContactsAppControllerTest {

    @LocalServerPort //grabs that random port number into a variable.
    private int port;

    @BeforeEach //configures REST Assured to send requests to localhost:<that port>
    void setUp(){
        RestAssured.port = port;
        RestAssured.baseURI = "http://localhost";
    }


    @Test
    void shouldGetAllContacts(){
        given()
                .when()
                .get("/api/contacts")
                .then()
                .statusCode(200)
                .body("size()",greaterThanOrEqualTo(3)); //from data.sql seed
    }

    @Test
    void shouldGetContactById(){
        given()
                .pathParam("id",1)
                .when()
                .get("/api/contacts/{id}")
                .then()
                .statusCode(200)
                .body("name", equalTo("John Doe"));
    }

    @Test
    void shouldCreateContact(){
        given()
                .contentType(ContentType.JSON)
                .body("""
                        {
                            "name" : "Divyanshi Gupta",
                            "phone" : "7906476778",
                            "email" : "divya1234@gmail.com"
                        }
                        """)
                .when()
                .post("/api/contacts")
                .then()
                .statusCode(201)
                .body("name", equalTo("Divyanshi Gupta"))
                .body("id", notNullValue());
    }

    @Test
    void shouldFailedToCreateContactWithInvalidEmail(){
        given()
                .contentType(ContentType.JSON)
                .body("""
                        {
                            "name" : "Anubhav",
                            "phone" : "9090909090",
                            "email" : "gjjksk"
                        }
                        """)
                .when()
                .post("/api/contacts")
                .then()
                .statusCode(400); //validation should reject this
    }

    @Test
    void shouldUpdateContact(){
        given()
                .contentType(ContentType.JSON)
                .pathParam("id",3)
                .body("""
                        {
                            "name" : "Alice Jackson",
                            "phone" : "9989898767",
                            "email" : "alice.jackson@example.com"
                        }
                        """)
                .when()
                .put("/api/contacts/{id}")
                .then()
                .statusCode(200)
                .body("name",equalTo("Alice Jackson"));
    }

    @Test
    void shouldDeleteContact(){
        given()
                .pathParam("id",2)
                .when()
                .delete("/api/contacts/{id}")
                .then()
                .statusCode(204);
    }
}