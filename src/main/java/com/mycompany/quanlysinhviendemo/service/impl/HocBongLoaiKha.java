/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.service.impl;

import com.mycompany.quanlysinhviendemo.model.SinhVien;
import java.util.ArrayList;
import java.util.List;


public class HocBongLoaiKha {
    public List<SinhVien> HocBongKha(List<SinhVien> list){
        ISort top20 = (ISort) new Sort();
        List<SinhVien> list1 = new ArrayList();
        for(SinhVien item : list){
            int flag = 1;
            for(int i = 0; i < 10; i++){
                if(item.list[i].quaMon() == false){
                    flag = 0;
                    break;
                }
            }
            if(flag ==1 && item.tinhDiem()>=7.0 && item.tinhDiem()<9.0){
                list1.add(item);
            }
        }
        list1 = top20.filter(list1);
        List<SinhVien> list2 = new ArrayList<>();
        int size = list1.size();
        if(size > 20){
            size = 20;
        }
        for(int i = 0; i< size;i++){
            list2.add(list1.get(i));
        }
        return list2;
    }
}
