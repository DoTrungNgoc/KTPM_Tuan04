package com.example.ktpm_tuan04.repository;

import com.example.ktpm_tuan04.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.text.html.Option;
import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay,String> {
    List<ChuyenBay> findChuyenBaysByGaden(String gaden);
}
