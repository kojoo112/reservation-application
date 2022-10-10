package com.xcape.reservationapplication.reservation;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ReserveForm {

    @NotBlank
    private String merchantCode;

    @NotBlank
    private String themeCode;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate reservedAt;

    @NotBlank
    private String phoneNumber;
}
