package com.example.ktpm_tuan04.service;

import com.example.ktpm_tuan04.model.ChuyenBay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChuyenBayService {
    List<ChuyenBay> getDSChuyenBayByGaden(String gaden);

    List<ChuyenBay> getDSChuyenBayByDodai(long from, long to);

    List<ChuyenBay> getDSChuyenBayByGadiGaden(String from, String to);

    Integer countChuyenByXuatphatTu(String gadi);
}
