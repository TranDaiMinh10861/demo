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
public class phat extends javax.swing.JInternalFrame {

    /**
     * Creates new form phat
     */
    public phat() {
        initComponents();
        txtdg.setEnabled(false);
        txtdg3.setEditable(false);
        txtdg2.setEnabled(false);
        txtdiachi.setEnabled(false);
        txtemail.setEnabled(false);
        txtname.setEnabled(false);
        txtdg1.setEnabled(false);
        txttm.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        txttm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        txtname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdg1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtdg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtdg2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdg3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(52, 143, 80));
        kGradientPanel1.setkStartColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin độc giả"));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mã thẻ mượn");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 60, 100, 17);

        txttm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttmActionPerformed(evt);
            }
        });
        jPanel2.add(txttm);
        txttm.setBounds(120, 60, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Họ tên");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 90, 100, 17);

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail);
        txtemail.setBounds(10, 160, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Địa chỉ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 190, 100, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 140, 100, 17);

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane1.setViewportView(txtdiachi);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 240, 90);

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtname);
        txtname.setBounds(10, 110, 240, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Mã độc giả");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 30, 100, 17);

        txtdg1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdg1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtdg1);
        txtdg1.setBounds(120, 20, 130, 30);

        kGradientPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 360, 320);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết"));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tiền mượn");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 20, 90, 30);

        txtdg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdgActionPerformed(evt);
            }
        });
        jPanel3.add(txtdg);
        txtdg.setBounds(100, 20, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Ngày quá");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 60, 90, 30);

        txtdg2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdg2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtdg2);
        txtdg2.setBounds(100, 60, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tiền phạt");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 100, 90, 30);

        txtdg3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdg3ActionPerformed(evt);
            }
        });
        jPanel3.add(txtdg3);
        txtdg3.setBounds(100, 100, 130, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        jButton1.setText("Phạt");
        jPanel3.add(jButton1);
        jButton1.setBounds(100, 150, 133, 57);

        kGradientPanel1.add(jPanel3);
        jPanel3.setBounds(390, 10, 300, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttmActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdgActionPerformed

    private void txtdg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdg1ActionPerformed

    private void txtdg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdg2ActionPerformed

    private void txtdg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdg3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdg3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtdg;
    private javax.swing.JTextField txtdg1;
    private javax.swing.JTextField txtdg2;
    private javax.swing.JTextField txtdg3;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttm;
    // End of variables declaration//GEN-END:variables
}