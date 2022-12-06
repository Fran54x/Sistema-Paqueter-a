
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import view.sub_menus.*;

public class vtMenuPrincipal extends javax.swing.JFrame {
    
    private vtLogin login;
    registroPaquetes pR = new registroPaquetes();
    listarPaquetesEmbalado pL = new listarPaquetesEmbalado();
    listarAlmacen pA = new listarAlmacen();
    verificarEstado pV = new verificarEstado();
    
    public vtMenuPrincipal(String usuario, vtLogin vL) {
        initComponents();
        this.login = vL;
        mostrarPanel(pR);
        this.setTitle("Paquetería");
        setIconImage(new ImageIcon(getClass().getResource("/source/abrir-caja (1).png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        fondoMenus = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        pRegistro = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JLabel();
        pListarPaquetesEmbalando = new javax.swing.JPanel();
        btnListarEmbalaje = new javax.swing.JLabel();
        pListarAlmacen = new javax.swing.JPanel();
        btnListarAlmacen = new javax.swing.JLabel();
        pBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JLabel();
        pVerificar = new javax.swing.JPanel();
        btnVerificar = new javax.swing.JLabel();
        pRegresar = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiRegistro = new javax.swing.JMenuItem();
        jmiEmbalaje = new javax.swing.JMenuItem();
        jmiAlmacen = new javax.swing.JMenuItem();
        jmiBuscar = new javax.swing.JMenuItem();
        jmiVerificar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiRegresar = new javax.swing.JMenuItem();
        jmiCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoMenus.setBackground(new java.awt.Color(239, 176, 71));

        logo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Icono.png"))); // NOI18N

        bienvenida.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenida.setText("Bienvenido");

        pRegistro.setBackground(new java.awt.Color(239, 176, 71));

        btnRegistro.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("    Registro de paquete");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pRegistroLayout = new javax.swing.GroupLayout(pRegistro);
        pRegistro.setLayout(pRegistroLayout);
        pRegistroLayout.setHorizontalGroup(
            pRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pRegistroLayout.setVerticalGroup(
            pRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pListarPaquetesEmbalando.setBackground(new java.awt.Color(239, 176, 71));
        pListarPaquetesEmbalando.setPreferredSize(new java.awt.Dimension(260, 53));

        btnListarEmbalaje.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        btnListarEmbalaje.setForeground(new java.awt.Color(255, 255, 255));
        btnListarEmbalaje.setText("    Listar embalaje en proceso");
        btnListarEmbalaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarEmbalaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarEmbalajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarEmbalajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarEmbalajeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pListarPaquetesEmbalandoLayout = new javax.swing.GroupLayout(pListarPaquetesEmbalando);
        pListarPaquetesEmbalando.setLayout(pListarPaquetesEmbalandoLayout);
        pListarPaquetesEmbalandoLayout.setHorizontalGroup(
            pListarPaquetesEmbalandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnListarEmbalaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pListarPaquetesEmbalandoLayout.setVerticalGroup(
            pListarPaquetesEmbalandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnListarEmbalaje, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        pListarAlmacen.setBackground(new java.awt.Color(239, 176, 71));
        pListarAlmacen.setPreferredSize(new java.awt.Dimension(260, 53));

        btnListarAlmacen.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        btnListarAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnListarAlmacen.setText("    Listar almacén");
        btnListarAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarAlmacenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarAlmacenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarAlmacenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pListarAlmacenLayout = new javax.swing.GroupLayout(pListarAlmacen);
        pListarAlmacen.setLayout(pListarAlmacenLayout);
        pListarAlmacenLayout.setHorizontalGroup(
            pListarAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnListarAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pListarAlmacenLayout.setVerticalGroup(
            pListarAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnListarAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        pBuscar.setBackground(new java.awt.Color(239, 176, 71));
        pBuscar.setPreferredSize(new java.awt.Dimension(260, 53));

        btnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("    Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBuscarLayout = new javax.swing.GroupLayout(pBuscar);
        pBuscar.setLayout(pBuscarLayout);
        pBuscarLayout.setHorizontalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pBuscarLayout.setVerticalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pVerificar.setBackground(new java.awt.Color(239, 176, 71));
        pVerificar.setPreferredSize(new java.awt.Dimension(260, 53));

        btnVerificar.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("    Verificar estado");
        btnVerificar.setToolTipText("");
        btnVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pVerificarLayout = new javax.swing.GroupLayout(pVerificar);
        pVerificar.setLayout(pVerificarLayout);
        pVerificarLayout.setHorizontalGroup(
            pVerificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVerificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pVerificarLayout.setVerticalGroup(
            pVerificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVerificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pRegresar.setBackground(new java.awt.Color(239, 176, 71));
        pRegresar.setPreferredSize(new java.awt.Dimension(260, 53));

        btnSalir.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("    Regresar");
        btnSalir.setToolTipText("");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pRegresarLayout = new javax.swing.GroupLayout(pRegresar);
        pRegresar.setLayout(pRegresarLayout);
        pRegresarLayout.setHorizontalGroup(
            pRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pRegresarLayout.setVerticalGroup(
            pRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout fondoMenusLayout = new javax.swing.GroupLayout(fondoMenus);
        fondoMenus.setLayout(fondoMenusLayout);
        fondoMenusLayout.setHorizontalGroup(
            fondoMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoMenusLayout.createSequentialGroup()
                .addGroup(fondoMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pRegresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pListarAlmacen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pListarPaquetesEmbalando, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pVerificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(272, 272, 272))
            .addGroup(fondoMenusLayout.createSequentialGroup()
                .addGroup(fondoMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoMenusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoMenusLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(bienvenida)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoMenusLayout.setVerticalGroup(
            fondoMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoMenusLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pListarPaquetesEmbalando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pListarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        bg.add(fondoMenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 580));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 720, 580));

        jMenu1.setText("Menú");
        jMenu1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N

        jmiRegistro.setText("Registro de paquéte");
        jmiRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRegistro);

        jmiEmbalaje.setText("Listar embalaje en proceso");
        jmiEmbalaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmbalajeActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEmbalaje);

        jmiAlmacen.setText("Listar almacén");
        jmiAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlmacenActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAlmacen);

        jmiBuscar.setText("Buscar");
        jmiBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBuscar);

        jmiVerificar.setText("Verificar estado");
        jmiVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVerificarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiVerificar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N

        jmiRegresar.setText("Regresar");
        jmiRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegresarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiRegresar);

        jmiCerrar.setText("Cerrar");
        jmiCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCerrar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
        mostrarPanel(pR);
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered
        sobreBoton(pRegistro);
    }//GEN-LAST:event_btnRegistroMouseEntered

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
        fueraBoton(pRegistro);
    }//GEN-LAST:event_btnRegistroMouseExited

    private void btnListarEmbalajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarEmbalajeMouseClicked
        mostrarPanel(pL);
    }//GEN-LAST:event_btnListarEmbalajeMouseClicked

    private void btnListarEmbalajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarEmbalajeMouseEntered
        sobreBoton(pListarPaquetesEmbalando);
    }//GEN-LAST:event_btnListarEmbalajeMouseEntered

    private void btnListarEmbalajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarEmbalajeMouseExited
        fueraBoton(pListarPaquetesEmbalando);
    }//GEN-LAST:event_btnListarEmbalajeMouseExited

    private void btnListarAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarAlmacenMouseClicked
        mostrarPanel(pA);
    }//GEN-LAST:event_btnListarAlmacenMouseClicked

    private void btnListarAlmacenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarAlmacenMouseEntered
        sobreBoton(pListarAlmacen);
    }//GEN-LAST:event_btnListarAlmacenMouseEntered

    private void btnListarAlmacenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarAlmacenMouseExited
        fueraBoton(pListarAlmacen);
    }//GEN-LAST:event_btnListarAlmacenMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //mostrarPanel(pB);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        sobreBoton(pBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        fueraBoton(pBuscar);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnVerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarMouseClicked
        mostrarPanel(pV);
    }//GEN-LAST:event_btnVerificarMouseClicked

    private void btnVerificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarMouseEntered
        sobreBoton(pVerificar);
    }//GEN-LAST:event_btnVerificarMouseEntered

    private void btnVerificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarMouseExited
        fueraBoton(pVerificar);
    }//GEN-LAST:event_btnVerificarMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        sobreBoton(pRegresar);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        fueraBoton(pRegresar);
    }//GEN-LAST:event_btnSalirMouseExited

    private void jmiRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistroActionPerformed
        mostrarPanel(pR);
    }//GEN-LAST:event_jmiRegistroActionPerformed

    private void jmiEmbalajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmbalajeActionPerformed
        mostrarPanel(pL);
    }//GEN-LAST:event_jmiEmbalajeActionPerformed

    private void jmiAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlmacenActionPerformed
        mostrarPanel(pA);
    }//GEN-LAST:event_jmiAlmacenActionPerformed

    private void jmiBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarActionPerformed
        //mostrarPanel(pB);
    }//GEN-LAST:event_jmiBuscarActionPerformed

    private void jmiVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVerificarActionPerformed
        mostrarPanel(pV);
    }//GEN-LAST:event_jmiVerificarActionPerformed

    private void jmiRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegresarActionPerformed
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jmiRegresarActionPerformed

    private void jmiCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiCerrarActionPerformed

    private void mostrarPanel(JPanel mp){
        mp.setSize (720, 540);
        mp.setLocation(0, 0);

        content.removeAll();
        content.add(mp, BorderLayout. CENTER) ;
        content.revalidate();
        content.repaint();
    }
    
    private void sobreBoton(JPanel p){
        p.setBackground(new Color(249,191,92));
    }
    
    private void fueraBoton(JPanel p){
        p.setBackground(new Color(239,176,71));
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new vtMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnListarAlmacen;
    private javax.swing.JLabel btnListarEmbalaje;
    private javax.swing.JLabel btnRegistro;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnVerificar;
    private javax.swing.JPanel content;
    private javax.swing.JPanel fondoMenus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAlmacen;
    private javax.swing.JMenuItem jmiBuscar;
    private javax.swing.JMenuItem jmiCerrar;
    private javax.swing.JMenuItem jmiEmbalaje;
    private javax.swing.JMenuItem jmiRegistro;
    private javax.swing.JMenuItem jmiRegresar;
    private javax.swing.JMenuItem jmiVerificar;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pBuscar;
    private javax.swing.JPanel pListarAlmacen;
    private javax.swing.JPanel pListarPaquetesEmbalando;
    private javax.swing.JPanel pRegistro;
    private javax.swing.JPanel pRegresar;
    private javax.swing.JPanel pVerificar;
    // End of variables declaration//GEN-END:variables
}
