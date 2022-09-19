package com.example.ktpm_tuan04.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "chuyenbay")
@Data
public class ChuyenBay {
    @Id
    @Column(columnDefinition = "varchar(5)")
    private String macb;
    @Column(columnDefinition = "varchar(50)")
    private String gadi;
    @Column(columnDefinition = "varchar(50)")
    private String gaden;
    private Long dodai;
    private Time giodi;
    private Time gioden;
    private Double chiphi;

}
