package com.xcape.reservationapplication.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter @EqualsAndHashCode
@Builder @AllArgsConstructor @NoArgsConstructor
public class Merchant {

    @Id @GeneratedValue
    @Column(name = "merchant_id")
    private Long id;

    private String merchantCode;

    private String merchantName;
}
