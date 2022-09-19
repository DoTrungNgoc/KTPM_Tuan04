package com.example.ktpm_tuan04.service;

import com.example.ktpm_tuan04.model.ChuyenBay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChuyenBayService {
    List<ChuyenBay> getDSChuyenBayByGaden(String gaden);
}
