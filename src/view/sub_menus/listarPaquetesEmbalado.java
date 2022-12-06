
package view.sub_menus;

import java.awt.Color;

public class listarPaquetesEmbalado extends javax.swing.JPanel {

    public listarPaquetesEmbalado() {
        initComponents();
        jtEmbalando.getTableHeader().setBackground(new Color(69, 73, 74));
        jtEmbalando.getTableHeader().setForeground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmbalando = new javax.swing.JTable();
        panelBoton = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(720, 540));

        bienvenida.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bienvenida.setForeground(new java.awt.Color(0, 0, 0));
        bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/caja-de-carton-cerrada-con-cinta-de-embalaje.png"))); // NOI18N
        bienvenida.setText("   LISTA DE PAQUETES EN PROCESO DE EMBALAJE");

        jtEmbalando.setBackground(new java.awt.Color(255, 255, 255));
        jtEmbalando.setForeground(new java.awt.Color(102, 102, 102));
        jtEmbalando.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "ID Paquete", "Nombre Paquete"
            }
        ));
        jtEmbalando.setRowHeight(30);
        jScrollPane1.setViewportView(jtEmbalando);

        panelBoton.setBackground(new java.awt.Color(221, 145, 19));

        btnFinalizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bienvenida)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bienvenida)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseClicked
        //codigo
    }//GEN-LAST:event_btnFinalizarMouseClicked

    private void btnFinalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseEntered
        panelBoton.setBackground(new Color(249,191,92));
    }//GEN-LAST:event_btnFinalizarMouseEntered

    private void btnFinalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseExited
        panelBoton.setBackground(new Color(221,145,19));
    }//GEN-LAST:event_btnFinalizarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JLabel btnFinalizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEmbalando;
    private javax.swing.JPanel panelBoton;
    // End of variables declaration//GEN-END:variables
}
