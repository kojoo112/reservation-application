package com.xcape.reservationapplication.api;

import com.xcape.reservationapplication.domain.Merchant;
import com.xcape.reservationapplication.domain.Theme;
import com.xcape.reservationapplication.repository.MerchantRepository;
import com.xcape.reservationapplication.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class XcapeApiController {

    private final MerchantRepository merchantRepository;
    private final ThemeRepository themeRepository;

    @GetMapping("/merchants")
    public List<Merchant> getAllMerchants() {
        return merchantRepository.findAll();
    }

    @GetMapping("/themes")
    public List<Theme> getAllThemes() {
        return themeRepository.findAll();
    }

    @GetMapping("/merchant/{merchantCode}")
    public List<Theme> getThemesByMerchant(@PathVariable String merchantCode) {

        List<Theme> themesByMerchant_merchantCode = themeRepository.findThemesByMerchant_MerchantCode(merchantCode);
        return themesByMerchant_merchantCode;
    }

}
