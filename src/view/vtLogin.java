package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class vtLogin extends javax.swing.JFrame {

    public vtLogin() {
        initComponents();   
        this.setTitle("Paquetería");
        setIconImage(new ImageIcon(getClass().getResource("/source/abrir-caja (1).png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        imgInicio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nombreEmpresa = new javax.swing.JLabel();
        imgCajas = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfCorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jpfContra = new javax.swing.JPasswordField();
        panelBoton = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JLabel();
        contra1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgInicio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        imgInicio.setForeground(new java.awt.Color(0, 0, 0));
        imgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/entrar.png"))); // NOI18N
        imgInicio.setText("  INICIAR SESIÓN");
        bg.add(imgInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 40));

        jPanel1.setBackground(new java.awt.Color(255, 239, 207));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEmpresa.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        nombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        nombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa.setText("Sr. Envío");
        jPanel1.add(nombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 20));

        imgCajas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Icono.png"))); // NOI18N
        jPanel1.add(imgCajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 270));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 230, 320));

        usuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(51, 51, 51));
        usuario.setText("USUARIO");
        bg.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, 10));

        jtfCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jtfCorreo.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jtfCorreo.setForeground(new java.awt.Color(153, 153, 153));
        jtfCorreo.setText("Ingrese su correo electrónico");
        jtfCorreo.setBorder(null);
        jtfCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfCorreoMousePressed(evt);
            }
        });
        bg.add(jtfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 240, 20));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 220, 10));

        jpfContra.setBackground(new java.awt.Color(255, 255, 255));
        jpfContra.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jpfContra.setForeground(new java.awt.Color(153, 153, 153));
        jpfContra.setText("***********");
        jpfContra.setBorder(null);
        jpfContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpfContraMousePressed(evt);
            }
        });
        bg.add(jpfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 220, 20));

        panelBoton.setBackground(new java.awt.Color(221, 145, 19));

        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar.setText("INGRESAR");
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

        bg.add(panelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 220, 40));

        contra1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        contra1.setForeground(new java.awt.Color(51, 51, 51));
        contra1.setText("CONTRASEÑA");
        bg.add(contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfCorreoMousePressed
        if (jtfCorreo.getText().equals("Ingrese su correo electrónico")){
            jtfCorreo.setText("");
            jtfCorreo.setForeground(Color.black);
        }
        if(String.valueOf(jpfContra.getPassword()).equals("")){
            jpfContra.setText("***********");
            jpfContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtfCorreoMousePressed

    private void jpfContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfContraMousePressed
        if (String.valueOf(jpfContra.getPassword()).equals("***********")){
            jpfContra.setText("");
            jpfContra.setForeground(Color.black);
        }
        if(jtfCorreo.getText().equals("")){
            jtfCorreo.setText("Ingrese su correo electrónico");
            jtfCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jpfContraMousePressed

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        panelBoton.setBackground(new Color(249,191,92));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        panelBoton.setBackground(new Color(221,145,19));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        String correo = jtfCorreo.getText();
        //String contra = String.valueOf(jpfContra.getPassword());
        //JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso\nCorreo: " + correo + "\nContraseña: " + contra);
        new vtMenuPrincipal(correo, this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEntrarMouseClicked

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JLabel contra1;
    private javax.swing.JLabel imgCajas;
    private javax.swing.JLabel imgInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpfContra;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JLabel nombreEmpresa;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
