package com.xcape.reservationapplication.reservation;

import com.xcape.reservationapplication.domain.Merchant;
import com.xcape.reservationapplication.repository.MerchantRepository;
import com.xcape.reservationapplication.repository.ReservationRepository;
import com.xcape.reservationapplication.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;
    private final ReservationRepository reservationRepository;
    private final MerchantRepository merchantRepository;
    private final ThemeRepository themeRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/reserve")
    public String reserve(Model model) {
        model.addAttribute(new ReserveForm());
        List<Merchant> merchantList = merchantRepository.findAll();

        model.addAttribute("merchantList", merchantList);
        model.addAttribute("themeList", themeRepository.findThemesByMerchant(merchantList.get(0)));
        return "reservation/reserve";
    }

    @PostMapping("/reserve")
    public String reserveSubmit(ReserveForm reserveForm, Errors errors) {
        if (errors.hasErrors()) {
            return "reservation/reserve";
        }

        reservationService.saveNewReservation(reserveForm);

        return "redirect:/reservation";
    }
}
