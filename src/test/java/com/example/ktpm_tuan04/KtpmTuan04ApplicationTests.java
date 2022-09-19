package com.example.ktpm_tuan04;

import com.example.ktpm_tuan04.service.ChuyenBayService;
import com.example.ktpm_tuan04.service.MayBayService;
import com.example.ktpm_tuan04.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KtpmTuan04ApplicationTests {
    @Autowired
    private ChuyenBayService chuyenBayService;
    @Autowired
    private MayBayService mayBayService;
    @Autowired
    private NhanVienService nhanVienService;

    @Test
    void cau01() {
        System.out.println("====== Cau 01 =======");
        chuyenBayService.getDSChuyenBayByGaden("DAD").stream().forEach(chuyenBay -> {
            System.out.println(chuyenBay.toString());
        });
    }

    @Test
    void cau02(){
        System.out.println("====== Cau 03 =======");
        mayBayService.getDSMaybayByTambayGreater(10000).stream().forEach(System.out::println);
    }

    @Test
    void cau03(){
        System.out.println("====== Cau 03 =======");
        nhanVienService.getDSNhanVienByLuongGreater(10000d).stream().forEach(System.out::println);
    }


}
