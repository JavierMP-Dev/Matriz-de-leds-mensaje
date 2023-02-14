package seriematrizled;

import panamahitek.Arduino.PanamaHitek_Arduino;
import javax.swing.JTextField;

public class InterfazMatrizLed extends javax.swing.JFrame {

    /**
     * Creates new form InterfazMatrizLed
     */
    
    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
    public InterfazMatrizLed() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            arduino.arduinoTX("COM3", 9600);
        } catch (Exception ex) {
            Logger.getLogger(InterfazMatrizLed.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        txtEfecto = new javax.swing.JLabel();
        comboEfecto = new javax.swing.JComboBox<String>();
        btnEnviarMensaje = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboNivel = new javax.swing.JComboBox<String>();
        txtMensaje = new javax.swing.JLabel();
        txtEfecto1 = new javax.swing.JLabel();
        jButton1Limpiar = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        txtAreaMensaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 0));
        setForeground(new java.awt.Color(204, 153, 0));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTitulo.setText("Letrero de bus");

        txtEfecto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEfecto.setText("Direccion");

        comboEfecto.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Derecha --> Izquierda", "Izquierda --> Derecha", "Arriba --> Abajo", "Abajo --> Arriba" }));
        comboEfecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEfectoActionPerformed(evt);
            }
        });

        btnEnviarMensaje.setText("Do it");
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Velocidad");

        comboNivel.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5" }));
        comboNivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboNivelMouseClicked(evt);
            }
        });
        comboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNivelActionPerformed(evt);
            }
        });

        txtMensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMensaje.setText("Mensaje");

        txtEfecto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1Limpiar.setText("Limpiar");
        jButton1Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1LimpiarActionPerformed(evt);
            }
        });

        txtAreaMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaMensajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAreaMensaje)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(txtAreaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtEfecto1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1Limpiar)))
                                        .addGap(15, 15, 15))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMensaje)
                                    .addComponent(txtTitulo))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnEnviarMensaje)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addGap(44, 44, 44)
                .addComponent(txtMensaje)
                .addGap(19, 19, 19)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1Limpiar)
                    .addComponent(txtEfecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarMensaje)
                    .addComponent(btnCerrar))
                .addGap(34, 34, 34)
                .addComponent(txtEfecto1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEfectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEfectoActionPerformed
        // TODO add your handling code here:
        if(comboEfecto.getSelectedItem().toString().equals("Derecha --> Izquierda")){
            
            try {
                arduino.sendData("1");
            } catch (Exception ex) {
                Logger.getLogger(InterfazMatrizLed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(comboEfecto.getSelectedItem().toString().equals("Izquierda --> Derecha")){
            
            try {
                arduino.sendData("2");
            } catch (Exception ex) {
                Logger.getLogger(InterfazMatrizLed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(comboEfecto.getSelectedItem().toString().equals("Arriba --> Abajo")){
            
            try {
                arduino.sendData("3");
            } catch (Exception ex) {
                Logger.getLogger(InterfazMatrizLed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(comboEfecto.getSelectedItem().toString().equals("Abajo --> Arriba")){
            
            try {
                arduino.sendData("4");
            } catch (Exception ex) {
                Logger.getLogger(InterfazMatrizLed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_comboEfectoActionPerformed

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        // TODO add your handling code here:
        btnEnviarMensaje.setEnabled(true);
        try {
            arduino.sendData("@"+txtAreaMensaje.getText());
            
        } catch (Exception ex) {
            Logger.getLogger(InterfazMatrizLed.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        try {
            arduino.sendData("5");
        } catch (Exception ex) {
            Logger.getLogger(InterfazMatrizLed.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void comboNivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboNivelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboNivelMouseClicked

    private void comboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNivelActionPerformed
        // TODO add your handling code here:
        String nivel= comboNivel.getSelectedItem().toString();
        try {
                arduino.sendData("v"+ nivel);
        } catch (Exception ex) {
            Logger.getLogger(InterfazMatrizLed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboNivelActionPerformed

    private void jButton1LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1LimpiarActionPerformed
         JTextField caja;
        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (panel.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
          caja=(JTextField)panel.getComponent(i);
          caja.setText("");
}
}
    }//GEN-LAST:event_jButton1LimpiarActionPerformed

    private void txtAreaMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaMensajeActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazMatrizLed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMatrizLed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMatrizLed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMatrizLed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMatrizLed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JComboBox<String> comboEfecto;
    private javax.swing.JComboBox<String> comboNivel;
    private javax.swing.JButton jButton1Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtAreaMensaje;
    private javax.swing.JLabel txtEfecto;
    private javax.swing.JLabel txtEfecto1;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
