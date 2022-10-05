package com.xcape.reservationapplication.repository;

import com.xcape.reservationapplication.domain.Merchant;
import com.xcape.reservationapplication.domain.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long> {

    List<Theme> findThemesByMerchant(Merchant merchant);

    Theme findByThemeCode(String themeCode);
}
