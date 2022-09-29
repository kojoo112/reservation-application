package com.xcape.reservationapplication.controller;

import com.xcape.reservationapplication.reservation.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    
    private final ReservationService reservationService;
    

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
