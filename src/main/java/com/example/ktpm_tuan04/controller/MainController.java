package com.example.ktpm_tuan04.controller;

import com.example.ktpm_tuan04.service.ChuyenBayService;
import com.example.ktpm_tuan04.service.MayBayService;
import com.example.ktpm_tuan04.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private ChuyenBayService chuyenBayService;
    @Autowired
    private MayBayService mayBayService;
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/cau01")
    public ResponseEntity cau01(){
        return ResponseEntity.ok(chuyenBayService.getDSChuyenBayByGaden("DAD"));
    }

    @GetMapping("/cau02")
    public ResponseEntity cau02(){
        return ResponseEntity.ok( mayBayService.getDSMaybayByTambayGreater(10000));
    }
}
