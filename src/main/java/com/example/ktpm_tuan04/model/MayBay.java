package com.example.ktpm_tuan04.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
@Data
public class MayBay {
    @Id
    private String mamb;
    private String loai;
    private Long tambay;
}
