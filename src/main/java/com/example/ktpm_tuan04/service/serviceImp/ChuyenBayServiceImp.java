package com.example.ktpm_tuan04.service.serviceImp;

import com.example.ktpm_tuan04.model.ChuyenBay;
import com.example.ktpm_tuan04.repository.ChuyenBayRepository;
import com.example.ktpm_tuan04.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayServiceImp implements ChuyenBayService {
    @Autowired
    private ChuyenBayRepository chuyenBayRepo;

    @Override
    public List<ChuyenBay> getDSChuyenBayByGaden(String gaden){
        return chuyenBayRepo.findChuyenBaysByGaden(gaden);
    }

    @Override
    public List<ChuyenBay> getDSChuyenBayByDodai(long from, long to){
        return  chuyenBayRepo.findChuyenBayByDodaiTrongKhoan(from,to);
    }

    @Override
    public List<ChuyenBay> getDSChuyenBayByGadiGaden(String from, String to){
        return  chuyenBayRepo.findChuyenBayByGadiGaden(from,to);
    }

    @Override
    public Integer countChuyenByXuatphatTu(String gadi){
        return  chuyenBayRepo.countChuyenByXuatphatTu(gadi);
    }
}
