/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import CACDULIEU.ChuyenNganh;
import CACDULIEU.Khoa;
import DAO.ChuyenNganhDAO;
import DBEngine.DBEngine;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class QLChuyenNganh extends javax.swing.JFrame {
    static ArrayList<ChuyenNganh> ds= new ArrayList<>();
    static ArrayList<Khoa> dsK= new ArrayList<>();
    static  String fileCN="ChuyenNganh.txt";
    static  String fileK="Khoa.txt";
    static ChuyenNganh cn=new ChuyenNganh();
    int dong=-1;
    static DBEngine DBE=new DBEngine();
    String mak="";
    
    void loadfieCN(){
        try {
           ds=(ArrayList<ChuyenNganh>) DBE.docFile(fileCN);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
    }
    void loadfieK(){
        try {
           dsK=(ArrayList<Khoa>) DBE.docFile(fileK);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
    }
    void nhapfile(){
        try {
            DBE.LuuFile(fileCN, ds);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    void loacb(){
        jCombKhoa.removeAllItems();
        for(var it: dsK){
            jCombKhoa.addItem(it.getTenKhoa());
        }
    }
    void loadtb(){
        jTableCN.setModel(new ChuyenNganhDAO(ds));
    }
    boolean kiemtra(String kt){
       boolean x=true;
       for (var it:ds){
           if(it.getMaCN().trim().equals(kt.trim()))
               x=false;
       } 
       return  x;
    }
    /**
     * Creates new form QLChuyenNganh
     */
    public QLChuyenNganh() {
        initComponents();
        loadfieCN();
        loadfieK();
        loacb();
        loadtb();
                
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
        jTableCN = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextMaCN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextTenCN = new javax.swing.JTextField();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCombKhoa = new javax.swing.JComboBox<>();
        jButtonLamMoi = new javax.swing.JButton();
        jButtonql = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Quản Lý Chuyên Nganh");

        jTableCN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCN);

        jLabel2.setText("Mã Chuyên Ngành");

        jLabel3.setText("Tên Chuyên Ngành");

        jButtonSua.setText("Sửa");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonThem.setText("Thêm ");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên Khoa");

        jCombKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCombKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombKhoaActionPerformed(evt);
            }
        });

        jButtonLamMoi.setText("Làm Mới");
        jButtonLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLamMoiActionPerformed(evt);
            }
        });

        jButtonql.setText("Quay Lại");
        jButtonql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonqlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonThem)
                    .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextMaCN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jCombKhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButtonLamMoi)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonql))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextMaCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCombKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonThem)
                            .addGap(31, 31, 31)
                            .addComponent(jButtonXoa)
                            .addGap(36, 36, 36)
                            .addComponent(jButtonSua)
                            .addGap(66, 66, 66)
                            .addComponent(jButtonLamMoi)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButtonql)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        // TODO add your handling code here:
        dong = jTableCN.getSelectedRow();
        if(dong !=-1){
            if(jTextMaCN.getText().trim().equals("") ||jTextTenCN.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this,"Chua du thong tin de them");
            }else{
                if(kiemtra(jTextMaCN.getText())==false){
                    if(jTextMaCN.getText().trim().equals(ds.get(dong).getMaCN().trim())){
                        cn = new ChuyenNganh(jTextMaCN.getText(), jTextTenCN.getText(),mak);
                        ds.set(dong,cn);
                        nhapfile();
                        loadtb();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Đã có mã: "+jTextMaCN.getText()+" Ở một dòng khác");
                    }
                }
                else{
                    cn = new ChuyenNganh(jTextMaCN.getText(), jTextTenCN.getText(),mak);
                    ds.set(dong,cn);
                    nhapfile();
                    loadtb();
                }
            }
        }
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
        dong= jTableCN.getSelectedRow();
        if(dong != -1){
            ds.remove(dong);
            nhapfile();
            loadtb();

        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        // TODO add your handling code here:
        if(jTextMaCN.getText().trim().equals("") ||jTextTenCN.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Chua du thong tin de them");
        }else{
            if(kiemtra(jTextMaCN.getText())){
                cn = new ChuyenNganh(jTextMaCN.getText(), jTextTenCN.getText(),mak);
                ds.add(cn);
                nhapfile();
                loadtb();
            }
            else{
                JOptionPane.showMessageDialog(this,"Đã Tồn Tại Mã :"+jTextMaCN.getText());
            }
        }
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLamMoiActionPerformed
        // TODO add your handling code here:
        jTextMaCN.setText("");
        jTextTenCN.setText("");
        loacb();
    }//GEN-LAST:event_jButtonLamMoiActionPerformed

    private void jCombKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombKhoaActionPerformed
        // TODO add your handling code here:
        String ten=(String) jCombKhoa.getSelectedItem();
        for(var it:dsK){
            if(it.getTenKhoa().equals(ten))
                mak=it.getMaKhoa();
        }
    }//GEN-LAST:event_jCombKhoaActionPerformed

    private void jButtonqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonqlActionPerformed
        // TODO add your handling code here:
        MeNuQuanLy MN= new MeNuQuanLy();
        MN.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonqlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLChuyenNganh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLChuyenNganh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLChuyenNganh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLChuyenNganh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLChuyenNganh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLamMoi;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JButton jButtonql;
    private javax.swing.JComboBox<String> jCombKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCN;
    private javax.swing.JTextField jTextMaCN;
    private javax.swing.JTextField jTextTenCN;
    // End of variables declaration//GEN-END:variables
}
