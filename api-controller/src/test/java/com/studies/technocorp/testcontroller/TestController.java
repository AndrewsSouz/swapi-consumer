package com.studies.technocorp.testcontroller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.studies.technocorp.controller.Controller;
import com.studies.technocorp.model.People;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(controllers = Controller.class)
public class TestController {

    @Autowired
    private MockMvc mockMvc;



    public void test() throws Exception {
        People people = new People();

        people.setName("Luke Skywalker");
        people.setBirthYear("19BBY");
        people.setEyeColor("blue");
        people.setGender("male");
        people.setHeigth("172");
        people.setHairColor("blond");
        people.setSkinColor("fair");
        people.setMass("77");


        ObjectWriter mapper = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = mapper.writeValueAsString(people);
//        JSONObject json = new JSONObject(people);


        mockMvc
                .perform(get("/swapi/people/1"))
                .andExpect(status().isOk());
//                .andExpect(content().json(json));
    }

}
