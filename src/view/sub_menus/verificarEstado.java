
package view.sub_menus;

import java.awt.Color;

public class verificarEstado extends javax.swing.JPanel {

    public verificarEstado() {
        initComponents();
        jtAlmacen.getTableHeader().setBackground(new Color(69, 73, 74));
        jtAlmacen.getTableHeader().setForeground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlmacen = new javax.swing.JTable();
        panelBoton = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(720, 540));

        bienvenida.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bienvenida.setForeground(new java.awt.Color(0, 0, 0));
        bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/lista-de-verificacion.png"))); // NOI18N
        bienvenida.setText("   VERIFICAR ESTADO DE PAQUETE");

        jtAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        jtAlmacen.setForeground(new java.awt.Color(102, 102, 102));
        jtAlmacen.setModel(new javax.swing.table.DefaultTableModel(
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
        jtAlmacen.setRowHeight(30);
        jScrollPane1.setViewportView(jtAlmacen);

        panelBoton.setBackground(new java.awt.Color(221, 145, 19));

        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar.setText("FINALIZAR");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        //código
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        panelBoton.setBackground(new Color(249,191,92));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        panelBoton.setBackground(new Color(221,145,19));
    }//GEN-LAST:event_btnEntrarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAlmacen;
    private javax.swing.JPanel panelBoton;
    // End of variables declaration//GEN-END:variables
}
