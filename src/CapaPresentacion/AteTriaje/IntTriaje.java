
package CapaPresentacion.AteTriaje;

/**
 *
 * @author Joshua
 */
public class IntTriaje extends javax.swing.JFrame {

    /**
     * Creates new form IntTriaje
     */
    public IntTriaje() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jCEspecialidad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jCMedico = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTPaciente = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLCodConsulta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSintomas = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBCrearConsulta = new javax.swing.JButton();
        jBGenTicDerivacion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Elaborar Consulta:");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<center>HOSPITAL NACIONAL ARZOBISPO LOAYZA</center>\n<center>Atencion en Triaje</center>\n</html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 130));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Especialidad:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 50));

        jCEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ODONCOLOGIA", "ODONTOLOGIA", "OFTALMOLOGIA", "GINECOLOGIA" }));
        jPanel4.add(jCEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Medico:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 90, 50));

        jCMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIERO LUJAN MALPARTIDA", "JOSHUA NAVARRO RUIZ", "NICOLAS RUIZ DIAZ", "MARIA ESPINOZA GOMEZ" }));
        jPanel4.add(jCMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 260, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 630, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        jTPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTPaciente.setText("JOSHUA NICOLAS NAVARRO RUIZ");
        jPanel5.add(jTPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 270, 30));

        jTdni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTdni.setText("72566233");
        jPanel5.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("DNI:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 50, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 630, 50));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fecha:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 70, 50));

        jLFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLFecha.setText("21/02/2017");
        jPanel6.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Numero de Consulta:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 50));

        jLCodConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLCodConsulta.setText("CO0001");
        jPanel6.add(jLCodConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 60, 50));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Derivacion:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 20));

        jTSintomas.setColumns(20);
        jTSintomas.setRows(5);
        jScrollPane1.setViewportView(jTSintomas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 630, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Sintomas:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Paciente:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jBCrearConsulta.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBCrearConsulta.setText("<html>\n<center>Crear</center>\n<center>Consulta</center>\n</html>");
        jBCrearConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jBCrearConsulta);

        jBGenTicDerivacion.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBGenTicDerivacion.setText("<html>\n<center>Generar Ticket</center>\n<center> de </center>\n<center>Derivacion</center>\n</html>");
        jBGenTicDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGenTicDerivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenTicDerivacionActionPerformed(evt);
            }
        });
        jPanel3.add(jBGenTicDerivacion);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton3.setText("Salir");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGenTicDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenTicDerivacionActionPerformed
        IntGenTicDerivacion dialog = new IntGenTicDerivacion(new javax.swing.JFrame(), true,
                this.jLCodConsulta.getText(),
                this.jCEspecialidad.getSelectedItem().toString()
                );
        dialog.setVisible(true);
    }//GEN-LAST:event_jBGenTicDerivacionActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntTriaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntTriaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntTriaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntTriaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntTriaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrearConsulta;
    private javax.swing.JButton jBGenTicDerivacion;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCEspecialidad;
    private javax.swing.JComboBox<String> jCMedico;
    private javax.swing.JLabel jLCodConsulta;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPaciente;
    private javax.swing.JTextArea jTSintomas;
    private javax.swing.JTextField jTdni;
    // End of variables declaration//GEN-END:variables
}
