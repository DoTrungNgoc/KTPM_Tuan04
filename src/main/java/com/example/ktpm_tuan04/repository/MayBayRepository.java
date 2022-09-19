package com.example.ktpm_tuan04.repository;

import com.example.ktpm_tuan04.model.ChuyenBay;
import com.example.ktpm_tuan04.model.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay,String> {
    List<MayBay> findMayBaysByTambayGreaterThan(long tambay);
}
