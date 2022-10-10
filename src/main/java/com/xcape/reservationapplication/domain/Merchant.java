package com.xcape.reservationapplication.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter @EqualsAndHashCode
@Builder @AllArgsConstructor @NoArgsConstructor
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "merchant_id")
    private Long id;

    private String merchantCode;

    private String merchantName;

    @OneToMany(mappedBy = "merchant")
    @JsonIgnore
    private List<Theme> themeList = new ArrayList<>();
}
