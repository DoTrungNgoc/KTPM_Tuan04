package com.example.ktpm_tuan04.service;

import com.example.ktpm_tuan04.model.ChuyenBay;
import com.example.ktpm_tuan04.model.MayBay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MayBayService {
    List<MayBay> getDSMaybayByTambayGreater(long tambay);
}
