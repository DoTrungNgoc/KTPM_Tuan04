package com.example.ktpm_tuan04.service.serviceImp;

import com.example.ktpm_tuan04.model.NhanVien;
import com.example.ktpm_tuan04.repository.NhanVienRepository;
import com.example.ktpm_tuan04.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImp implements NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepo;

    @Override
    public List<NhanVien> getDSNhanVienByLuongGreater(double luong){
        return nhanVienRepo.findNhanViensByLuongGreaterThan(luong);
    }
}
