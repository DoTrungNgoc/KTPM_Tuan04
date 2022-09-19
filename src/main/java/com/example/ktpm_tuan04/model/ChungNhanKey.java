package com.example.ktpm_tuan04.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChungNhanKey implements Serializable {
    @Column(name = "macb")
    private String macb;
    @Column(name = "manv")
    private String manv;
}
