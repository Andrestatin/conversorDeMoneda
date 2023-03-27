package conversor.vista;

import javax.swing.JOptionPane;
import modelo.Api;

public class VistaMoneda extends javax.swing.JFrame {
//llamando clase Api

    Api monedaCambio = new Api();
    double dolar = monedaCambio.map().get("USD");
    double euros = monedaCambio.map().get("EUR");
    double librasEsterlinas = monedaCambio.map().get("GBP");
    double yen = monedaCambio.map().get("JPY");
    double pesoCol = monedaCambio.map().get("COP");
    double wonSurCoreano = monedaCambio.map().get("KRW");
    VistaConversores vc=new VistaConversores();

    public VistaMoneda() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void cambiar(String nomMon , String nomMonA ,double moneda,double monedaA) {
        if(jConvertir.getSelectedItem().equals(nomMon)&& jConvertirA.getSelectedItem().equals(nomMonA)){
                double calculoConvesion = (Double.parseDouble(jTCantidad.getText()) * monedaA / moneda);
                JOptionPane.showMessageDialog(null, jTCantidad.getText() +" "+nomMon+ "  equivalen a: " + String.format("%.6f", calculoConvesion) + " "+nomMonA);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLConvertir = new javax.swing.JLabel();
        jConvertirA = new javax.swing.JComboBox<>();
        jLConvertir1 = new javax.swing.JLabel();
        jConvertir = new javax.swing.JComboBox<>();
        jLConvertir2 = new javax.swing.JLabel();
        jBtnAceptar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jTCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));
        jPanel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(534, 341));
        jPanel1.setNextFocusableComponent(jBtnAceptar);
        jPanel1.setPreferredSize(new java.awt.Dimension(534, 341));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONVERSOR DE MONEDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 240, 30));

        jLConvertir.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLConvertir.setForeground(new java.awt.Color(255, 255, 255));
        jLConvertir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLConvertir.setText("a");
        jPanel1.add(jLConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 30));
        jLConvertir.getAccessibleContext().setAccessibleName("Convertir");

        jConvertirA.setBackground(new java.awt.Color(51, 204, 255));
        jConvertirA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso Colombiano", "Euros", "Dolares", "Libras Esterlinas", "Yen Japonés", "Won sur-coreano" }));
        jConvertirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConvertirAActionPerformed(evt);
            }
        });
        jPanel1.add(jConvertirA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, -1));

        jLConvertir1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLConvertir1.setForeground(new java.awt.Color(255, 255, 255));
        jLConvertir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLConvertir1.setText("Cantidad");
        jPanel1.add(jLConvertir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 30));

        jConvertir.setBackground(new java.awt.Color(51, 0, 153));
        jConvertir.setForeground(new java.awt.Color(255, 255, 255));
        jConvertir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso Colombiano", "Euros", "Dolares", "Libras Esterlinas", "Yen Japonés", "Won sur-coreano" }));
        jConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jConvertir.setName(""); // NOI18N
        jConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(jConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, -1));

        jLConvertir2.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLConvertir2.setForeground(new java.awt.Color(255, 255, 255));
        jLConvertir2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLConvertir2.setText("Convertir");
        jPanel1.add(jLConvertir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 30));

        jBtnAceptar.setBackground(new java.awt.Color(255, 255, 0));
        jBtnAceptar.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jBtnAceptar.setText("ACEPTAR");
        jBtnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, 50));

        jBtnCancelar.setBackground(new java.awt.Color(255, 255, 0));
        jBtnCancelar.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 130, 50));

        jTCantidad.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jPanel1.add(jTCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 249, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConvertirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConvertirActionPerformed

    private void jConvertirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConvertirAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConvertirAActionPerformed

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        // TODO add your handling code here:
        if(jTCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Escriba la cantidad que desea cambiar");
        }else{
            cambiar("Peso Colombiano", "Dolares", pesoCol, dolar);
            cambiar("Peso Colombiano", "Euros", pesoCol, euros);
            cambiar("Peso Colombiano", "Libras Esterlinas", pesoCol, librasEsterlinas);
            cambiar("Peso Colombiano", "Yen Japonés", pesoCol, yen);
            cambiar("Peso Colombiano", "Won sur-coreano", pesoCol, wonSurCoreano);
            cambiar("Euros", "Peso Colombiano", euros, pesoCol);
            cambiar("Euros", "Dolares", euros, dolar);
            cambiar("Euros", "Libras Esterlinas", euros, librasEsterlinas);
            cambiar("Euros", "Yen Japonés", euros, yen);
            cambiar("Euros", "Won sur-coreano", euros, wonSurCoreano);
            cambiar("Dolares", "Peso Colombiano", dolar, pesoCol);
            cambiar("Dolares", "Euros", dolar, euros);
            cambiar("Dolares", "Libras Esterlinas", dolar, librasEsterlinas);
            cambiar("Dolares", "Yen Japonés", dolar, yen);
            cambiar("Dolares", "Won sur-coreano", dolar, wonSurCoreano);
            cambiar("Libras Esterlinas", "Peso Colombiano", librasEsterlinas, pesoCol);
            cambiar("Libras Esterlinas", "Euros", librasEsterlinas, euros);
            cambiar("Libras Esterlinas", "Dolares", librasEsterlinas, dolar);
            cambiar("Libras Esterlinas", "Yen Japonés", librasEsterlinas, yen);
            cambiar("Libras Esterlinas", "Won sur-coreano", librasEsterlinas, wonSurCoreano);
            cambiar("Yen Japonés", "Peso Colombiano", yen, pesoCol);
            cambiar("Yen Japonés", "Euros", yen, euros);
            cambiar("Yen Japonés", "Dolares", yen, dolar);
            cambiar("Yen Japonés", "Libras Esterlinas", yen, yen);
            cambiar("Yen Japonés", "Won sur-coreano", yen, wonSurCoreano);
            cambiar("Won sur-coreano", "Peso Colombiano", wonSurCoreano, pesoCol);
            cambiar("Won sur-coreano", "Euros", wonSurCoreano, euros);
            cambiar("Won sur-coreano", "Dolares", wonSurCoreano, dolar);
            cambiar("Won sur-coreano", "Yen Japonés", wonSurCoreano, yen);
            cambiar("Won sur-coreano", "Libras Esterlinas", wonSurCoreano, librasEsterlinas);
        }
       
        jTCantidad.setText("");
        jTCantidad.grabFocus();
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
        vc.setVisible(true);
    }//GEN-LAST:event_jBtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JComboBox<String> jConvertir;
    private javax.swing.JComboBox<String> jConvertirA;
    private javax.swing.JLabel jLConvertir;
    private javax.swing.JLabel jLConvertir1;
    private javax.swing.JLabel jLConvertir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCantidad;
    // End of variables declaration//GEN-END:variables
}
