package com.example.ktpm_tuan04.repository;

import com.example.ktpm_tuan04.model.MayBay;
import com.example.ktpm_tuan04.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,String> {
    List<NhanVien> findNhanViensByLuongGreaterThan(double luong);
}
