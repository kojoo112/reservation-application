package com.xcape.reservationapplication.repository;

import com.xcape.reservationapplication.reservation.ReservationService;
import com.xcape.reservationapplication.reservation.ReserveForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;
    private final ReservationRepository reservationRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/reserve")
    public String reserve(Model model) {
        model.addAttribute(new ReserveForm());
        return "reservation/reserve";
    }
}
