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
    @Query("select cb from ChuyenBay cb where cb.dodai > ?1 and cb.dodai < ?2")
    List<ChuyenBay> findChuyenBayByDodaiTrongKhoan(long from, long to);

    @Query("select cb from ChuyenBay cb where cb.gadi like ?1 and cb.gaden like ?2")
    List<ChuyenBay> findChuyenBayByGadiGaden(String from, String to);

    @Query("select count(cb) from ChuyenBay cb where cb.gadi like ?1")
    Integer countChuyenByXuatphatTu(String gadi);

}
