package com.example.ktpm_tuan04.service;

import com.example.ktpm_tuan04.model.MayBay;
import com.example.ktpm_tuan04.model.NhanVien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NhanVienService {
    List<NhanVien> getDSNhanVienByLuongGreater(double luong);
}
