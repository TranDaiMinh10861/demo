/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Administrator
 */
public class gia_han_the_muon extends javax.swing.JInternalFrame {

    /**
     * Creates new form gia_han_the_muon
     */
    public gia_han_the_muon() {
        initComponents();
        jTextArea2.setEnabled(false);
        jTextField9.setEnabled(false);
        jTextField10.setEnabled(false);
        jTextField11.setEnabled(false);
        jTextField12.setEnabled(false);
        btnadd1.setEnabled(false);
        txtmoney.setEditable(false);
        cbodate.setEnabled(false);
    }
    void selectMoney(){
        String select = (String) cbodate.getSelectedItem();
        if (select == "6 tháng(Mặc định)") {
            txtmoney.setText("50000");
        }else if (select == "1 năm") {
            txtmoney.setText("100000");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cbodate = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtmoney = new javax.swing.JTextField();
        btnadd1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnsearch = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(52, 143, 80));
        kGradientPanel1.setkStartColor(new java.awt.Color(86, 180, 211));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Gia hạn thẻ mượn"));
        jPanel2.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Thời hạn");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(30, 20, 90, 17);

        cbodate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbodate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 tháng(Mặc định)", "1 năm" }));
        cbodate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodateActionPerformed(evt);
            }
        });
        jPanel2.add(cbodate);
        cbodate.setBounds(30, 40, 180, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("VND");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(150, 90, 60, 30);

        txtmoney.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmoneyActionPerformed(evt);
            }
        });
        jPanel2.add(txtmoney);
        txtmoney.setBounds(30, 90, 110, 30);

        btnadd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnadd1.setText("Gia hạn");
        jPanel2.add(btnadd1);
        btnadd1.setBounds(30, 130, 140, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Phí thẻ");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(30, 70, 90, 17);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm độc giả"));
        jPanel1.setLayout(null);

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        btnsearch.setText("Tìm");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch);
        btnsearch.setBounds(276, 46, 80, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(16, 46, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Số điện thoại");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(16, 26, 100, 17);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin độc giả"));
        jPanel3.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mã độc giả");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(16, 26, 90, 17);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9);
        jTextField9.setBounds(16, 46, 240, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Họ tên");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(16, 76, 90, 17);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField10);
        jTextField10.setBounds(16, 96, 240, 30);

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField11);
        jTextField11.setBounds(16, 146, 240, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Ngày sinh");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(16, 126, 90, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Email");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(16, 176, 90, 17);

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField12);
        jTextField12.setBounds(16, 196, 240, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(16, 226, 90, 17);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(16, 246, 240, 90);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbodateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodateActionPerformed
        // TODO add your handling code here:
        selectMoney();
    }//GEN-LAST:event_cbodateActionPerformed

    private void txtmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmoneyActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        //        btnadd.setEnabled(true);
        btnadd1.setEnabled(true);
        cbodate.setEnabled(true);
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd1;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cbodate;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtmoney;
    // End of variables declaration//GEN-END:variables
}
