/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import CACDULIEU.ChuyenNganh;
import CACDULIEU.Lop;
import DAO.LopDAO;
import DBEngine.DBEngine;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class QLLop extends javax.swing.JFrame {

    static ArrayList<Lop> ds= new ArrayList<>();
    static ArrayList<ChuyenNganh> dsCN= new ArrayList<>();
    static  String fileCN="ChuyenNganh.txt";
    static  String fileL="Lop.txt";
    static Lop lp=new Lop();
    int dong=-1;
    static DBEngine DBE=new DBEngine();
    String maCN="";
    /**
     * Creates new form QLLop
     */
    public QLLop() {
        initComponents();
        loadfieL();
        loadfieCN();
        loacb();
        loadtb();
        
    }

    void loadfieCN(){
        try {
           dsCN=(ArrayList<ChuyenNganh>) DBE.docFile(fileCN);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
    }
    void loadfieL(){
        try {
           ds=(ArrayList<Lop>) DBE.docFile(fileL);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
    }
    void nhapfile(){
        try {
            DBE.LuuFile(fileL, ds);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    void loacb(){
        jCombCN.removeAllItems();
        for(var it: dsCN){
            jCombCN.addItem(it.getTenCN());
        }
    }
    void loadtb(){
        jTableLop.setModel(new LopDAO(ds));
    }
    boolean kiemtra(String kt){
       boolean x=true;
       for (var it:ds){
           if(it.getMaLop().trim().equals(kt.trim()))
               x=false;
       } 
       return  x;
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
        jTableLop = new javax.swing.JTable();
        jButtonThem = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonSua2 = new javax.swing.JButton();
        jTextTenL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextMaL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextSiso = new javax.swing.JTextField();
        jTextKhoaHoc = new javax.swing.JTextField();
        jCombCN = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButtonql1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Quản Lý Lớp ");

        jTableLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLop);

        jButtonThem.setText("Thêm ");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonSua2.setText("Sửa");
        jButtonSua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSua2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên Lớp");

        jLabel2.setText("Mã Lớp");

        jLabel4.setText("Sĩ Số");

        jLabel5.setText("Khóa Học ");

        jLabel6.setText("Chuyên Ngành");

        jCombCN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCombCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombCNActionPerformed(evt);
            }
        });

        jButton1.setText("Làm Mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonql1.setText("Quay Lại");
        jButtonql1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonql1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSua2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonThem)
                            .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMaL, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jButtonql1))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextTenL, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextSiso, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jCombCN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonThem)
                        .addGap(23, 23, 23)
                        .addComponent(jButtonSua2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonXoa)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTenL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonql1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        // TODO add your handling code here:
        if(jTextMaL.getText().trim().equals("") ||jTextTenL.getText().trim().equals("")||jTextSiso.getText().trim().equals("")|| jTextKhoaHoc.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Chua du thong tin de them");
        }else{
            if(kiemtra(jTextMaL.getText())){
                lp= new Lop(jTextMaL.getText(), jTextTenL.getText(), Integer.parseInt(jTextSiso.getText()), jTextKhoaHoc.getText(),maCN);
                ds.add(lp);
                nhapfile();
                loadtb();
            }
            else{
                JOptionPane.showMessageDialog(this,"Đã Tồn Tại Mã :"+jTextMaL.getText());
            }
        }
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
        dong= jTableLop.getSelectedRow();
        if(dong != -1){
            ds.remove(dong);
            nhapfile();
            loadtb();

        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonSua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSua2ActionPerformed
        // TODO add your handling code here:
        dong = jTableLop.getSelectedRow();
        if(dong !=-1){
            if(jTextMaL.getText().trim().equals("") ||jTextTenL.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this,"Chua du thong tin de them");
            }else{
                if(kiemtra(jTextMaL.getText())==false){
                    if(jTextMaL.getText().trim().equals(ds.get(dong).getMaLop().trim())){
                        lp= new Lop(jTextMaL.getText(), jTextTenL.getText(), Integer.parseInt(jTextSiso.getText()), jTextKhoaHoc.getText(), maCN);
                        ds.set(dong,lp);
                        nhapfile();
                        loadtb();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Đã có mã: "+jTextMaL.getText()+" Ở một dòng khác");
                    }
                }
                else{
                    lp= new Lop(jTextMaL.getText(), jTextTenL.getText(), Integer.parseInt(jTextSiso.getText()), jTextKhoaHoc.getText(), maCN);
                    ds.set(dong,lp);
                    nhapfile();
                    loadtb();
                }
            }
        }
    }//GEN-LAST:event_jButtonSua2ActionPerformed

    private void jCombCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombCNActionPerformed
        // TODO add your handling code here:
        String ten=(String) jCombCN.getSelectedItem();
        for(var it: dsCN){
            if(it.getTenCN().equals(ten))
                maCN=it.getMaCN();
        }
        
    }//GEN-LAST:event_jCombCNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextKhoaHoc.setText("");
        jTextMaL.setText("");
        jTextTenL.setText("");
        jTextSiso.setText("");
        loacb();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonql1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonql1ActionPerformed
        // TODO add your handling code here:
        MeNuQuanLy MN= new MeNuQuanLy();
        MN.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonql1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLLop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSua2;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JButton jButtonql1;
    private javax.swing.JComboBox<String> jCombCN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLop;
    private javax.swing.JTextField jTextKhoaHoc;
    private javax.swing.JTextField jTextMaL;
    private javax.swing.JTextField jTextSiso;
    private javax.swing.JTextField jTextTenL;
    // End of variables declaration//GEN-END:variables
}
