package com.example.ktpm_tuan04.service.serviceImp;

import com.example.ktpm_tuan04.model.MayBay;
import com.example.ktpm_tuan04.repository.MayBayRepository;
import com.example.ktpm_tuan04.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayServiceImp implements MayBayService {
    @Autowired
    private MayBayRepository  mayBayRepository;

    @Override
    public List<MayBay> getDSMaybayByTambayGreater(long tambay){
        return mayBayRepository.findMayBaysByTambayGreaterThan(tambay);
    }
}
