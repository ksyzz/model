package org.ksyzz.test;

import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ksyzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by fengqian on 2017/4/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})

public class MainControllerTest {
    @Autowired
    UserService userService;
    @Before
    public void setUp(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }
    @Test
    public void testMain(){
        String user =
                given()
                .param("userName", "test5")
                .param("password", "test5")
                .when()
                .post("/add")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .path("userName");
        System.out.println(user);

    }
}
