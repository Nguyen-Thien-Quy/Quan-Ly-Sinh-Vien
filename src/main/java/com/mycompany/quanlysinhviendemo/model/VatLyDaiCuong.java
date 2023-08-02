/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.model;

/**
 *
 * @author HOANGPHUC
 */
public class VatLyDaiCuong extends MonHoc{
    public VatLyDaiCuong() {
        super.soTinChi = 3;
        super.tenMonHoc = "Vat Ly Dai Cuong";
    }

    public VatLyDaiCuong(double diem) {
        super(diem);
        super.soTinChi = 3;
        super.tenMonHoc = "Vat Ly Dai Cuong";
    }
}
