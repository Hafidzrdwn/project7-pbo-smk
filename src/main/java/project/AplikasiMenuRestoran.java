/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Hafidz Ridwan
 */
public class AplikasiMenuRestoran extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiMenuMakanan
     */
    public int hargaMenu1, hargaMenu2, hargaMenu3, hargaMenu4, 
            hargaMenu5, hargaMenu6, hargaMenu7, hargaMenu8, hargaMenu9, hargaMenu10;
    
    public AplikasiMenuRestoran() {
        initComponents();
    }
    
    public static String getHarga(String text) {
        String[] arrOfStr = text.split(":");
        
        return arrOfStr[1];
    }
    
    public static String toRupiah(int price) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(price);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menu1 = new javax.swing.JCheckBox();
        menu2 = new javax.swing.JCheckBox();
        menu3 = new javax.swing.JCheckBox();
        menu4 = new javax.swing.JCheckBox();
        menu5 = new javax.swing.JCheckBox();
        jml_menu1 = new javax.swing.JTextField();
        jml_menu2 = new javax.swing.JTextField();
        jml_menu3 = new javax.swing.JTextField();
        jml_menu4 = new javax.swing.JTextField();
        jml_menu5 = new javax.swing.JTextField();
        menu6 = new javax.swing.JCheckBox();
        menu7 = new javax.swing.JCheckBox();
        menu8 = new javax.swing.JCheckBox();
        menu9 = new javax.swing.JCheckBox();
        menu10 = new javax.swing.JCheckBox();
        jml_menu6 = new javax.swing.JTextField();
        jml_menu7 = new javax.swing.JTextField();
        jml_menu8 = new javax.swing.JTextField();
        jml_menu9 = new javax.swing.JTextField();
        jml_menu10 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("DAFTAR MENU");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Makanan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Minuman");

        menu1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu1.setText("Soto : 5000");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        menu2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu2.setText("Rawon : 6000");
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        menu3.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu3.setText("Bakso : 4000");
        menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3ActionPerformed(evt);
            }
        });

        menu4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu4.setText("Gudeg : 8000");
        menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu4ActionPerformed(evt);
            }
        });

        menu5.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu5.setText("Mie Ayam : 13000");
        menu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu5ActionPerformed(evt);
            }
        });

        jml_menu1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu1.setText("0");
        jml_menu1.setEnabled(false);

        jml_menu2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu2.setText("0");
        jml_menu2.setEnabled(false);

        jml_menu3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu3.setText("0");
        jml_menu3.setEnabled(false);

        jml_menu4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu4.setText("0");
        jml_menu4.setEnabled(false);

        jml_menu5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu5.setText("0");
        jml_menu5.setEnabled(false);

        menu6.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu6.setText("Es Teh : 3000");
        menu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu6ActionPerformed(evt);
            }
        });

        menu7.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu7.setText("Es Jeruk : 4000");
        menu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu7ActionPerformed(evt);
            }
        });

        menu8.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu8.setText("Es Campur : 12000");
        menu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu8ActionPerformed(evt);
            }
        });

        menu9.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu9.setText("Susu : 5000");
        menu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu9ActionPerformed(evt);
            }
        });

        menu10.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        menu10.setText("Kopi : 3500");
        menu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu10ActionPerformed(evt);
            }
        });

        jml_menu6.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu6.setText("0");
        jml_menu6.setEnabled(false);

        jml_menu7.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu7.setText("0");
        jml_menu7.setEnabled(false);

        jml_menu8.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu8.setText("0");
        jml_menu8.setEnabled(false);

        jml_menu9.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu9.setText("0");
        jml_menu9.setEnabled(false);

        jml_menu10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jml_menu10.setText("0");
        jml_menu10.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel4.setText("Total : ");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTotal.setText("0");

        btnHitung.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHitungMouseClicked(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu4)
                            .addComponent(menu3)
                            .addComponent(menu2)
                            .addComponent(menu1)
                            .addComponent(menu5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jml_menu5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jml_menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jml_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jml_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jml_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu6)
                            .addComponent(menu7)
                            .addComponent(menu8)
                            .addComponent(menu9)
                            .addComponent(menu10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jml_menu7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jml_menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jml_menu8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jml_menu9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jml_menu10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jml_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jml_menu6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu2)
                    .addComponent(jml_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jml_menu7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu3)
                    .addComponent(jml_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(menu8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jml_menu8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu4)
                    .addComponent(jml_menu4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(menu9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jml_menu9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu5)
                    .addComponent(jml_menu5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(menu10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jml_menu10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHitungMouseClicked
        
        int totalHargaMenu1 = 0, totalHargaMenu2 = 0, totalHargaMenu3 = 0, totalHargaMenu4 = 0, totalHargaMenu5 = 0,
                totalHargaMenu6 = 0, totalHargaMenu7 = 0, totalHargaMenu8 = 0, totalHargaMenu9 = 0, totalHargaMenu10 = 0;
        
        if(!jml_menu1.getText().isEmpty()) totalHargaMenu1 = Integer.parseInt(jml_menu1.getText()) * hargaMenu1;
        if(!jml_menu2.getText().isEmpty()) totalHargaMenu2 = Integer.parseInt(jml_menu2.getText()) * hargaMenu2;
        if(!jml_menu3.getText().isEmpty()) totalHargaMenu3 = Integer.parseInt(jml_menu3.getText()) * hargaMenu3;
        if(!jml_menu4.getText().isEmpty()) totalHargaMenu4 = Integer.parseInt(jml_menu4.getText()) * hargaMenu4;
        if(!jml_menu5.getText().isEmpty()) totalHargaMenu5 = Integer.parseInt(jml_menu5.getText()) * hargaMenu5;
        if(!jml_menu6.getText().isEmpty()) totalHargaMenu6 = Integer.parseInt(jml_menu6.getText()) * hargaMenu6;
        if(!jml_menu7.getText().isEmpty()) totalHargaMenu7 = Integer.parseInt(jml_menu7.getText()) * hargaMenu7;
        if(!jml_menu8.getText().isEmpty()) totalHargaMenu8 = Integer.parseInt(jml_menu8.getText()) * hargaMenu8;
        if(!jml_menu9.getText().isEmpty()) totalHargaMenu9 = Integer.parseInt(jml_menu9.getText()) * hargaMenu9;
        if(!jml_menu10.getText().isEmpty()) totalHargaMenu10 = Integer.parseInt(jml_menu10.getText()) * hargaMenu10;
        
        int ArrayTotal[] = {totalHargaMenu1, totalHargaMenu2, totalHargaMenu3, totalHargaMenu4, totalHargaMenu5,
                                    totalHargaMenu6, totalHargaMenu7, totalHargaMenu8, totalHargaMenu9, totalHargaMenu10};
        
        int totalHarga = 0;
        for(int harga : ArrayTotal) {
            totalHarga += harga;
        }
        
        txtTotal.setText(toRupiah(totalHarga));
    }//GEN-LAST:event_btnHitungMouseClicked

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        jml_menu1.setEnabled(menu1.isSelected());
        jml_menu1.setText((jml_menu1.isEnabled()) ? "" : "0");
        
        hargaMenu1 = Integer.parseInt(getHarga(menu1.getText()).trim());
    }//GEN-LAST:event_menu1ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        jml_menu2.setEnabled(menu2.isSelected());
        jml_menu2.setText((jml_menu2.isEnabled()) ? "" : "0");
        
        hargaMenu2 = Integer.parseInt(getHarga(menu2.getText()).trim());
    }//GEN-LAST:event_menu2ActionPerformed

    private void menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3ActionPerformed
        jml_menu3.setEnabled(menu3.isSelected());
        jml_menu3.setText((jml_menu3.isEnabled()) ? "" : "0");
        
        hargaMenu3 = Integer.parseInt(getHarga(menu3.getText()).trim());
    }//GEN-LAST:event_menu3ActionPerformed

    private void menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu4ActionPerformed
        jml_menu4.setEnabled(menu4.isSelected());
        jml_menu4.setText((jml_menu4.isEnabled()) ? "" : "0");
        
        hargaMenu4 = Integer.parseInt(getHarga(menu4.getText()).trim());
    }//GEN-LAST:event_menu4ActionPerformed

    private void menu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu5ActionPerformed
        jml_menu5.setEnabled(menu5.isSelected());
        jml_menu5.setText((jml_menu5.isEnabled()) ? "" : "0");
        
        hargaMenu5 = Integer.parseInt(getHarga(menu5.getText()).trim());
    }//GEN-LAST:event_menu5ActionPerformed

    private void menu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu6ActionPerformed
        jml_menu6.setEnabled(menu6.isSelected());
        jml_menu6.setText((jml_menu6.isEnabled()) ? "" : "0");
        
        hargaMenu6 = Integer.parseInt(getHarga(menu6.getText()).trim());
    }//GEN-LAST:event_menu6ActionPerformed

    private void menu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu7ActionPerformed
        jml_menu7.setEnabled(menu7.isSelected());
        jml_menu7.setText((jml_menu7.isEnabled()) ? "" : "0");
        
        hargaMenu7 = Integer.parseInt(getHarga(menu7.getText()).trim());
    }//GEN-LAST:event_menu7ActionPerformed

    private void menu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu8ActionPerformed
        jml_menu8.setEnabled(menu8.isSelected());
        jml_menu8.setText((jml_menu8.isEnabled()) ? "" : "0");
        
        hargaMenu8 = Integer.parseInt(getHarga(menu8.getText()).trim());
    }//GEN-LAST:event_menu8ActionPerformed

    private void menu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu9ActionPerformed
        jml_menu9.setEnabled(menu9.isSelected());
        jml_menu9.setText((jml_menu9.isEnabled()) ? "" : "0");
        
        hargaMenu9 = Integer.parseInt(getHarga(menu9.getText()).trim());
    }//GEN-LAST:event_menu9ActionPerformed

    private void menu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu10ActionPerformed
        jml_menu10.setEnabled(menu10.isSelected());
        jml_menu10.setText((jml_menu10.isEnabled()) ? "" : "0");
        
        hargaMenu10 = Integer.parseInt(getHarga(menu10.getText()).trim());
    }//GEN-LAST:event_menu10ActionPerformed

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        menu1.setSelected(false);
        menu2.setSelected(false);
        menu3.setSelected(false);
        menu4.setSelected(false);
        menu5.setSelected(false);
        menu6.setSelected(false);
        menu7.setSelected(false);
        menu8.setSelected(false);
        menu9.setSelected(false);
        menu10.setSelected(false);
        
        jml_menu1.setEnabled(false); jml_menu1.setText("0");
        jml_menu2.setEnabled(false); jml_menu2.setText("0");
        jml_menu3.setEnabled(false); jml_menu3.setText("0");
        jml_menu4.setEnabled(false); jml_menu4.setText("0");
        jml_menu5.setEnabled(false); jml_menu5.setText("0");
        jml_menu6.setEnabled(false); jml_menu6.setText("0");
        jml_menu7.setEnabled(false); jml_menu7.setText("0");
        jml_menu8.setEnabled(false); jml_menu8.setText("0");
        jml_menu9.setEnabled(false); jml_menu9.setText("0");
        jml_menu10.setEnabled(false); jml_menu10.setText("0");
        
        txtTotal.setText("0");
    }//GEN-LAST:event_btnClearMouseClicked

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
            java.util.logging.Logger.getLogger(AplikasiMenuRestoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiMenuRestoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiMenuRestoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiMenuRestoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiMenuRestoran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jml_menu1;
    private javax.swing.JTextField jml_menu10;
    private javax.swing.JTextField jml_menu2;
    private javax.swing.JTextField jml_menu3;
    private javax.swing.JTextField jml_menu4;
    private javax.swing.JTextField jml_menu5;
    private javax.swing.JTextField jml_menu6;
    private javax.swing.JTextField jml_menu7;
    private javax.swing.JTextField jml_menu8;
    private javax.swing.JTextField jml_menu9;
    private javax.swing.JCheckBox menu1;
    private javax.swing.JCheckBox menu10;
    private javax.swing.JCheckBox menu2;
    private javax.swing.JCheckBox menu3;
    private javax.swing.JCheckBox menu4;
    private javax.swing.JCheckBox menu5;
    private javax.swing.JCheckBox menu6;
    private javax.swing.JCheckBox menu7;
    private javax.swing.JCheckBox menu8;
    private javax.swing.JCheckBox menu9;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
