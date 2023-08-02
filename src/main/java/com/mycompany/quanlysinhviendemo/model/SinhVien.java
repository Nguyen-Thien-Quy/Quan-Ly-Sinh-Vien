/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.model;

import java.time.LocalDate;

/**
 *
 * @author HOANGPHUC
 */
public class SinhVien {
    public String shortName;
    private String queQuan;
    private String maSV;
    private String hoTen;
    private String lopNienChe;
    private String ngaySinh;
    public MonHoc[] list;

    public SinhVien() {
        list = new MonHoc[10];
    }

    public SinhVien(String queQuan, String maSV, String hoTen, String lopNienChe, String ngaySinh) {
        this.queQuan = queQuan;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lopNienChe = lopNienChe;
        this.ngaySinh = ngaySinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }   

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLopNienChe() {
        return lopNienChe;
    }

    public void setLopNienChe(String lopNienChe) {
        this.lopNienChe = lopNienChe;
    }

    public double tinhDiem(){
        double tong = 0;
        for(MonHoc item : list){
            tong += item.getDiem()*item.soTinChi;
        }
        double Diem = tong/27.0;
        return Diem;
    }
    
    public String xepLoaiHocLuc(){
        if(tinhDiem() < 4){
            return "Hoc Luc Yeu";
        }else if(tinhDiem() >= 4 && tinhDiem() < 7){
            return "Hoc Luc Trung Binh";
        }else if(tinhDiem() >= 7 && tinhDiem() < 9){
            return "Hoc Luc Kha";
        }else{
            return "Hoc Luc Gioi";
        }
    }
    
    public boolean xetHocBong(){
        for(MonHoc item : list){
            if(item.getDiem() < 4.0){
                return false;
            }
        }
        return true;
    }
}
