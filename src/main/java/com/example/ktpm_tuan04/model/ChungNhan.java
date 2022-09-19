//package com.example.ktpm_tuan04.model;
//
//import lombok.Data;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "chungnhan")
//@Data
//public class ChungNhan {
//    @EmbeddedId
//    private  ChungNhanKey id;
//
//    @ManyToOne
//    @MapsId("manv")
//    @JoinColumn(name = "manv")
//    private NhanVien nhanvien;
//
//    @ManyToOne
//    @MapsId("macb")
//    @JoinColumn(name = "macb")
//    private ChuyenBay chuyenbay;
//}
