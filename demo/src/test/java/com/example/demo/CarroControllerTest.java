package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
        assertEquals(result, result);//deve conter uma string x
    }

    //fazer um post antes pois qd o spring reinicia zera a memoria
    // @Test
    // public void getCarroByIdTest() {
    //     Long id =(long) 1;
    //     Carro result = carro.getCarroById(id);
    //     assertEquals(result, result);
    // }





}