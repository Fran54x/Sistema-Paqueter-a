/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.sub_menus;

import java.awt.Color;

/**
 *
 * @author luisd
 */
public class buscarPaquetes extends javax.swing.JPanel {

    /**
     * Creates new form buscarPaquetes
     */
    public buscarPaquetes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        panelBoton = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JLabel();
        panelBoton1 = new javax.swing.JPanel();
        btnEntrar2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelBoton2 = new javax.swing.JPanel();
        btnEntrar1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(620, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/caja.png"))); // NOI18N
        jLabel7.setText("  BUSCAR PAQUETE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 533, 510, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 239, 207));
        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        jLabel11.setText("DATOS DEL REMITENTE");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        jTextField8.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField8.setText("Entidad federativa:");
        jTextField8.setBorder(null);
        jTextField8.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, 30));

        jTextField9.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField9.setText("Número:");
        jTextField9.setBorder(null);
        jTextField9.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel4.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 60, 30));

        jTextField10.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField10.setText("Código postal:");
        jTextField10.setBorder(null);
        jTextField10.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 87, 30));

        jTextField11.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField11.setText("Calle:");
        jTextField11.setBorder(null);
        jTextField11.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 30));

        jTextField12.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField12.setText("País:");
        jTextField12.setBorder(null);
        jTextField12.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 510, 90));

        panelBoton.setBackground(new java.awt.Color(221, 145, 19));
        panelBoton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar.setText("BUSCAR");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });
        panelBoton.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jPanel1.add(panelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 170, 40));

        panelBoton1.setBackground(new java.awt.Color(221, 145, 19));
        panelBoton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEntrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar2.setText("REGISTRAR");
        btnEntrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrar2MouseExited(evt);
            }
        });
        panelBoton1.add(btnEntrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jPanel1.add(panelBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 170, 40));

        jTextField5.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField5.setForeground(java.awt.Color.gray);
        jTextField5.setText("Identificador");
        jTextField5.setBorder(null);
        jTextField5.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 37));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 10));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 380, -1));

        jLabel8.setBackground(new java.awt.Color(255, 239, 207));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        jLabel8.setText("ESTADO DEL PAQUETE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Estado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, 20));

        panelBoton2.setBackground(new java.awt.Color(221, 145, 19));
        panelBoton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar1.setText("?");
        btnEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrar1MouseExited(evt);
            }
        });
        panelBoton2.add(btnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(panelBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 40, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 239, 207));
        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        jLabel12.setText("DATOS DEL DESTINATARIO");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 30));

        jTextField13.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField13.setText("Entidad federativa:");
        jTextField13.setBorder(null);
        jTextField13.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 30));

        jTextField14.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField14.setText("Número:");
        jTextField14.setBorder(null);
        jTextField14.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 60, 30));

        jTextField15.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField15.setText("Código postal:");
        jTextField15.setBorder(null);
        jTextField15.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 87, 30));

        jTextField16.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField16.setText("Calle:");
        jTextField16.setBorder(null);
        jTextField16.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 30));

        jTextField17.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField17.setText("País:");
        jTextField17.setBorder(null);
        jTextField17.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel5.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 510, 90));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 239, 207));
        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        jLabel13.setText("DATOS DEL DESTINATARIO");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 30));

        jTextField18.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField18.setText("Entidad federativa:");
        jTextField18.setBorder(null);
        jTextField18.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel6.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 30));

        jTextField19.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField19.setText("Número:");
        jTextField19.setBorder(null);
        jTextField19.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel6.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 60, 30));

        jTextField20.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField20.setText("Código postal:");
        jTextField20.setBorder(null);
        jTextField20.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel6.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 87, 30));

        jTextField21.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField21.setText("Calle:");
        jTextField21.setBorder(null);
        jTextField21.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel6.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 320, 30));

        jTextField22.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField22.setText("País:");
        jTextField22.setBorder(null);
        jTextField22.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jPanel6.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 510, 90));

        jLabel14.setBackground(new java.awt.Color(255, 239, 207));
        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        jLabel14.setText("DATOS DEL PAQUETE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel10.setText("Almacén:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 120, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel15.setText("Nombre:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, 30));

        jScrollPane1.setEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Descripción");
        jTextArea1.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 280, 110));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel16.setText("Fragilidad:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 120, 30));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked

    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        panelBoton.setBackground(new Color(249,191,92));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        panelBoton.setBackground(new Color(249,191,92));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnEntrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar2MouseClicked

    private void btnEntrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar2MouseEntered

    private void btnEntrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar2MouseExited

    private void btnEntrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1MouseClicked

    private void btnEntrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1MouseEntered

    private void btnEntrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1MouseExited

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JLabel btnEntrar1;
    private javax.swing.JLabel btnEntrar2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelBoton1;
    private javax.swing.JPanel panelBoton2;
    // End of variables declaration//GEN-END:variables
}
