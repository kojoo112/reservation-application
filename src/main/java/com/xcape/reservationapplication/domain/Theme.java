package com.xcape.reservationapplication.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter @EqualsAndHashCode
@Builder @AllArgsConstructor @NoArgsConstructor
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theme_Id")
    private Long id;

    private String themeCode;

    private String themeName;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;
}
