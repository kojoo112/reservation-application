package com.xcape.reservationapplication.reservation;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class ReserveForm {

    private String merchantCode;

    private String themeCode;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate reservedAt;

    private String phoneNumber;
}
