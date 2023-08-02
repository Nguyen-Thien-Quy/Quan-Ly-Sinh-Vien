/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.model;

/**
 *
 * @author HOANGPHUC
 */
public class LapTrinhCanBan extends MonHoc{
    public LapTrinhCanBan() {
        super.soTinChi = 3;
        super.tenMonHoc = "Lap Trinh Can Ban";
    }

    public LapTrinhCanBan(double diem) {
        super(diem);
        super.soTinChi = 3;
        super.tenMonHoc = "Lap Trinh Can Ban";
    }
}
