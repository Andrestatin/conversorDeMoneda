package conversor.vista;



public class VistaConversores extends javax.swing.JFrame {
    
    
    public VistaConversores() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPElije = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComconvert = new javax.swing.JComboBox<>();
        jBtnContinuar = new javax.swing.JButton();
        jBtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPElije.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONVERSOR DE DIVISAS Y LONGITUD");

        jComconvert.setBackground(new java.awt.Color(51, 204, 255));
        jComconvert.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jComconvert.setForeground(new java.awt.Color(255, 255, 255));
        jComconvert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "CONVERSOR DE MONEDA", "CONVERSOR DE TEMPERATURA" }));

        jBtnContinuar.setBackground(new java.awt.Color(51, 0, 153));
        jBtnContinuar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jBtnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnContinuar.setText("CONTINUAR");
        jBtnContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnContinuarActionPerformed(evt);
            }
        });

        jBtnCerrar.setBackground(new java.awt.Color(51, 0, 153));
        jBtnCerrar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jBtnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCerrar.setText("CERRAR");
        jBtnCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPElijeLayout = new javax.swing.GroupLayout(jPElije);
        jPElije.setLayout(jPElijeLayout);
        jPElijeLayout.setHorizontalGroup(
            jPElijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPElijeLayout.createSequentialGroup()
                .addGroup(jPElijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPElijeLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPElijeLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPElijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPElijeLayout.createSequentialGroup()
                                .addComponent(jBtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComconvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPElijeLayout.setVerticalGroup(
            jPElijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPElijeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jComconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPElijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPElije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPElije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnContinuarActionPerformed
        // TODO add your handling code here:
        if (jComconvert.getSelectedItem().equals("CONVERSOR DE MONEDA")) {
            VistaMoneda vm = new VistaMoneda();
            dispose();
            vm.setVisible(true);
        } else if(jComconvert.getSelectedItem().equals("CONVERSOR DE TEMPERATURA")){
            VistaTemperatura vt= new VistaTemperatura();
            dispose();
            vt.setVisible(true);
        }
    }//GEN-LAST:event_jBtnContinuarActionPerformed

    private void jBtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnCerrarActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConversores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCerrar;
    private javax.swing.JButton jBtnContinuar;
    private javax.swing.JComboBox<String> jComconvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPElije;
    // End of variables declaration//GEN-END:variables

}

