package com.xcape.reservationapplication.api;

import com.xcape.reservationapplication.domain.Merchant;
import com.xcape.reservationapplication.repository.MerchantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class APITest {

    @Autowired
    private MerchantRepository merchantRepository;

    @Test
    public void getAllMerchant() {
        List<Merchant> merchantList = merchantRepository.findAll();

    }
}
