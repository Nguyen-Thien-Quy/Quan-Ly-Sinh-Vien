/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.quanlysinhviendemo.ui;

import com.mycompany.quanlysinhviendemo.model.SinhVien;
import com.mycompany.quanlysinhviendemo.service.impl.ISort;
import com.mycompany.quanlysinhviendemo.service.impl.Sort;
import static com.mycompany.quanlysinhviendemo.ui.QuanLy.data;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public class DanhSachHocLai extends javax.swing.JPanel {

    public static int sttHocLai;
    DefaultTableModel modelHocLai;
    List<SinhVien> hocLai;

    /**
     * Creates new form DanhSachHocLai
     */
    public DanhSachHocLai() {
        initComponents();
        modelHocLai = (DefaultTableModel) tblHocLai.getModel();
        cbxMonHocLai.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocLai = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbxMonHocLai = new javax.swing.JComboBox<>();
        btnCapNhatHocLai = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(770, 580));
        setPreferredSize(new java.awt.Dimension(770, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách sinh viên học lại theo các môn");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        tblHocLai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Họ và tên", "Mã SV", "Lớp", "Ngày sinh", "Quê quán", "Khoa", "Môn học lại"
            }
        ));
        jScrollPane1.setViewportView(tblHocLai);
        if (tblHocLai.getColumnModel().getColumnCount() > 0) {
            tblHocLai.getColumnModel().getColumn(0).setMinWidth(25);
            tblHocLai.getColumnModel().getColumn(0).setMaxWidth(30);
            tblHocLai.getColumnModel().getColumn(1).setMinWidth(170);
            tblHocLai.getColumnModel().getColumn(1).setMaxWidth(175);
            tblHocLai.getColumnModel().getColumn(3).setMinWidth(55);
            tblHocLai.getColumnModel().getColumn(3).setMaxWidth(60);
            tblHocLai.getColumnModel().getColumn(7).setMinWidth(180);
            tblHocLai.getColumnModel().getColumn(7).setMaxWidth(185);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 750, 350));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chọn môn");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        cbxMonHocLai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cong Nghe Mang May Tinh", "Ky Nang Mem", "Lap Trinh Can Ban", "The Chat", "Tin Hoc Dai Cuong", "Toan Cao Cap A1", "Toan Cao Cap A2", "Toan Cao Cap A3", "Triet Hoc Mac Lenin", "Vat Ly Dai Cuong" }));
        add(cbxMonHocLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        btnCapNhatHocLai.setText("Cập nhật");
        btnCapNhatHocLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatHocLaiActionPerformed(evt);
            }
        });
        add(btnCapNhatHocLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void fillToJTableHocLai() {
        if (hocLai != null) {
            for (int i = 0; i < hocLai.size(); i++) {
                SinhVien sv = hocLai.get(i);
                modelHocLai.addRow(new Object[]{
                    sttHocLai++,
                    sv.getHoTen(),
                    sv.getMaSV(),
                    sv.getLopNienChe(),
                    sv.getNgaySinh().toString(),
                    sv.getQueQuan(),
                    sv.shortName,
                    cbxMonHocLai.getSelectedItem().toString()
                });
            }
        }
    }
    private void btnCapNhatHocLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatHocLaiActionPerformed
        // TODO add your handling code here:
        String monHoc = cbxMonHocLai.getSelectedItem().toString();
        List<SinhVien> list;
        ISort sort;
        switch (monHoc) {
            case "Cong Nghe Mang May Tinh":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[0].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "Ky Nang Mem":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[1].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "Lap Trinh Can Ban":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[2].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "The Chat":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[3].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "Tin Hoc Dai Cuong":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[4].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "Toan Cao Cap A1":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[5].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "Toan Cao Cap A2":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[6].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "Toan Cao Cap A3":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[7].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "Triet Hoc Mac Lenin":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[8].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
            case "Vat Ly Dai Cuong":
                list = new ArrayList<>();
                for (SinhVien item : data) {
                    if (item.list[9].quaMon() == false) {
                        list.add(item);
                    }
                }
                sort = new Sort();
                hocLai = sort.filter(list);
                if (modelHocLai.getRowCount() == 0) {
                    fillToJTableHocLai();
                } else {
                    for (int i = modelHocLai.getRowCount() - 1; i >= 0; i--) {
                        modelHocLai.removeRow(i);
                    }
                    sttHocLai = 1;
                    fillToJTableHocLai();
                }
                break;
        }
        hocLai = null;
    }//GEN-LAST:event_btnCapNhatHocLaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatHocLai;
    private javax.swing.JComboBox<String> cbxMonHocLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHocLai;
    // End of variables declaration//GEN-END:variables
}
