/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.model;

/**
 *
 * @author HOANGPHUC
 */
public class MonHoc {
    public int soTinChi;
    public String tenMonHoc;
    private double diem;

    public MonHoc() {
    }

    public MonHoc(double diem) {
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public boolean quaMon(){
        if(this.diem < 4){
            return false;
        }
        return true;
    }
}
