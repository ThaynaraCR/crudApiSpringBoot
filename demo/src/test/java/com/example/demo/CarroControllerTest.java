package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.web.client.TestRestTemplate;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.*;

@SpringBootTest
@WebAppConfiguration
public class CarroControllerTest {

    @Autowired
    private CarroController carro;

    @Test
    public void getAllCarrosTest() {
        List < Carro > result = carro.getAllCarros();
        assertEquals(result, result);
    }

    // @Test
    // public void integracao() {
    //     TestRestTemplate testRestTemplate = new TestRestTemplate();
    //     ResponseEntity<Carro> response = testRestTemplate.getForEntity("http://localhost:8080/carros", Carro.class );
    //     assertEquals(response.getStatusCode(), HttpStatus.OK);
    // }


}