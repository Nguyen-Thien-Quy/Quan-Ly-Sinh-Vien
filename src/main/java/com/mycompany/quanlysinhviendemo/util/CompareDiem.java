/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.util;

import com.mycompany.quanlysinhviendemo.model.SinhVien;
import java.util.Comparator;

/**
 *
 * @author HOANGPHUC
 */
public class CompareDiem implements Comparator<SinhVien>{

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if(o1.tinhDiem() > o2.tinhDiem()){
            return -1;
        }else if(o1.tinhDiem() < o2.tinhDiem()){
            return 1;
        }
        return 0;
    }
    
}
