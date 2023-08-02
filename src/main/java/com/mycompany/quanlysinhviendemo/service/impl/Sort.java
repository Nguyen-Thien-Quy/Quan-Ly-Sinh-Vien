/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.service.impl;

import com.mycompany.quanlysinhviendemo.model.SinhVien;
import com.mycompany.quanlysinhviendemo.util.CompareDiem;
import com.mycompany.quanlysinhviendemo.util.CompareMaSV;
import java.util.List;


public class Sort implements ISort{

    @Override
    public List<SinhVien> filter(List<SinhVien> list) {
        list.sort(new CompareDiem().thenComparing(new CompareMaSV()));
        return list;
    }
    
}
