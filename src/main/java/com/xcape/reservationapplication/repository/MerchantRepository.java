package com.xcape.reservationapplication.repository;

import com.xcape.reservationapplication.domain.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {

    Merchant findByMerchantCode(String merchantCode);
}
