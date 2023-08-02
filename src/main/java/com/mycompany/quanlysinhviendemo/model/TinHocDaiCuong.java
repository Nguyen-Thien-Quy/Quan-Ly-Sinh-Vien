/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.model;

/**
 *
 * @author HOANGPHUC
 */
public class TinHocDaiCuong extends MonHoc{
    public TinHocDaiCuong() {
        super.soTinChi = 2;
        super.tenMonHoc = "Tin Hoc Dai Cuong";
    }   

    public TinHocDaiCuong(double diem) {
        super(diem);
        super.soTinChi = 2;
        super.tenMonHoc = "Tin Hoc Dai Cuong";
    }
}
