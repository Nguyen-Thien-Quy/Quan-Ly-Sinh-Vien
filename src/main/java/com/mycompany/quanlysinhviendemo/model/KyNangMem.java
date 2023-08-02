/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.model;

/**
 *
 * @author HOANGPHUC
 */
public class KyNangMem extends MonHoc{
    public KyNangMem() {
        super.soTinChi = 2;
        super.tenMonHoc = "Ky Nang Mem";
    }

    public KyNangMem(double diem) {
        super(diem);
        super.soTinChi = 2;
        super.tenMonHoc = "Ky Nang Mem";
    }
    
}