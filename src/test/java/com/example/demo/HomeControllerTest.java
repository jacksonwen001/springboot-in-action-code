package com.example.demo;

import com.example.demo.controllers.HomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static
        org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author: Jackson.Wen
 */

@WebMvcTest(HomePage.class)
public class HomeControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testHome() throws Exception {
        mockMvc.perform(get("/api/v1/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }
}
