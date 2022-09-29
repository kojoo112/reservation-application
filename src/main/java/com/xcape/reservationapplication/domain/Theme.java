package com.xcape.reservationapplication.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @EqualsAndHashCode
@Builder @AllArgsConstructor @NoArgsConstructor
public class Theme {

    @Id @GeneratedValue
    @Column(name = "theme_Id")
    private Long id;

    private String themeCode;

    private String themeName;
}
