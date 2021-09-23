package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
 

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc

public class CarroControllerTestIntegration {
 
    @Autowired
    private MockMvc mockMvc;
 
    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/carro")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void criaCarro() throws Exception {
        mockMvc.perform(get("/carro")
        .contentType("application/json")
        .content("teste"))
        .andExpect(status().isOk());
    }


//getbyid
//put
//delete

 
}