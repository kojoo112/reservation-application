package com.xcape.reservationapplication.reservation;

import com.xcape.reservationapplication.domain.Merchant;
import com.xcape.reservationapplication.domain.Reservation;
import com.xcape.reservationapplication.domain.Theme;
import com.xcape.reservationapplication.repository.MerchantRepository;
import com.xcape.reservationapplication.repository.ReservationRepository;
import com.xcape.reservationapplication.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final MerchantRepository merchantRepository;
    private final ThemeRepository themeRepository;
    private final ReservationRepository reservationRepository;

    public void saveNewReservation(ReserveForm reserveForm) {
        Merchant merchant = merchantRepository.findByMerchantCode(reserveForm.getMerchantCode());
        Theme theme = themeRepository.findByThemeCode(reserveForm.getThemeCode());

        Reservation reservation = new Reservation().builder()
                .merchant(merchant)
                .theme(theme)
                .reservedAt(reserveForm.getReservedAt())
                .phoneNumber(reserveForm.getPhoneNumber()).build();
        reservationRepository.save(reservation);
    }
}
