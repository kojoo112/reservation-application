package com.xcape.reservationapplication.reservation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
class ReservationControllerTest {

    @Autowired
    private ReservationController reservationController;

    @Autowired
    MockMvc mockMvc;

    @Test
    void reserveError() throws Exception {
        mockMvc.perform(post("/reserve")
                .param("merchantCode", "mrc001")
                .param("themeCode", "thm001")
                .param("phoneNumber", "0123102131")
                .param("reservedAt", ""))
                .andExpect(status().isOk())
                .andExpect(view().name("reservation/reserve"));

    }
}