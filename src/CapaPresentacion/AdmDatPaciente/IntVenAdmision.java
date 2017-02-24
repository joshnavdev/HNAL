
package CapaPresentacion.AdmDatPaciente;

import java.util.Enumeration;

/**
 *
 * @author Joshua
 */
public class IntVenAdmision extends javax.swing.JFrame {

    /**
     * Creates new form IntVenAdmision
     */
    public IntVenAdmision() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.modificarEstado("Inicio");
    }
    
    //Metodos Propios
    private String getRBSelected(javax.swing.ButtonGroup bg) {
        String text = null;
        Enumeration<javax.swing.AbstractButton> allRadioButton = bg.getElements();
        while(allRadioButton.hasMoreElements()) {
            javax.swing.JRadioButton temp = (javax.swing.JRadioButton) allRadioButton.nextElement();
            if(temp.isSelected())
               text = temp.getText();
        }
        return text;
    }
    private void enableCampos(boolean b) {
        this.jRAlta.setEnabled(b);
        this.jRBaja.setEnabled(b);
        this.jRHombre.setEnabled(b);
        this.jRMujer.setEnabled(b);
        
        this.jCDepartamento.setEnabled(b);
        this.jCDistrito.setEnabled(b);
        this.jCEstCivil.setEnabled(b);
        this.jCProvincia.setEnabled(b);
        
        this.jTAM.setEditable(b);
        this.jTAP.setEditable(b);
        this.jTNombre.setEditable(b);
        this.jTCorre.setEditable(b);
        this.jTDireccion.setEditable(b);
        this.jTGrpSanguineo.setEditable(b);
        this.jTMovil.setEditable(b);
        this.jTTelefono.setEditable(b);
        this.jTdni.setEditable(b);
        
        
        this.jAPersonales.setEditable(b);
        this.jAAlergias.setEditable(b);
        this.jACronicas.setEditable(b);
        this.jAFamiliares.setEditable(b);
        this.jAInter.setEditable(b);
        this.jAVacunas.setEditable(b);
        
        this.jDate.setEnabled(b);
       
        this.jSEdad.setEnabled(b);
    }
    private boolean toBoolean(int num) {
        return num != 0;
    }
    private void modificarBotones(int[] estado) {
        this.jBBuscar.setEnabled(toBoolean(estado[0]));
        this.jBNuevo.setEnabled(toBoolean(estado[1]));
        this.jBGuardar.setEnabled(toBoolean(estado[2]));
        this.jBVerConsultas.setEnabled(toBoolean(estado[3]));
        
    }
    private void modificarEstado(String cadena){
        switch(cadena) {
            case "Inicio":
                int[] inicio ={1,0,1,0,0};
                this.modificarBotones(inicio);
                break;
            case "Buscar":
                int[] buscar ={1,1,1,1,1}; 
                this.modificarBotones(buscar);
                break;
            case "Nuevo":
                int[] nuevo ={1,0,1,0,0}; 
                this.modificarBotones(nuevo);
                break;
            case "Guardar":
                int[] guardar ={1,1,1,1,1}; 
                this.modificarBotones(guardar);
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGEstado = new javax.swing.ButtonGroup();
        bGSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBVerConsultas = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTAP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLBorrar1 = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jLBorrar2 = new javax.swing.JLabel();
        jRAlta = new javax.swing.JRadioButton();
        jRBaja = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTAM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jRHombre = new javax.swing.JRadioButton();
        jRMujer = new javax.swing.JRadioButton();
        jCDepartamento = new javax.swing.JComboBox<>();
        jDate = new com.toedter.calendar.JDateChooser();
        jSEdad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTMovil = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTDireccion = new javax.swing.JTextField();
        jTCorre = new javax.swing.JTextField();
        jTGrpSanguineo = new javax.swing.JTextField();
        jCEstCivil = new javax.swing.JComboBox<>();
        jTabClinico = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAPersonales = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jAFamiliares = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jAAlergias = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jAVacunas = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jAInter = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jACronicas = new javax.swing.JTextArea();
        jCProvincia = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jCDistrito = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("<html>\n<center>HOSPITAL NACIONAL ARZOBISPO LOAYZA</center>\n<center>Historial Clinico</center>\n</html>");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jBBuscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jBBuscar);

        jBNuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(jBNuevo);

        jBGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jBGuardar);

        jBVerConsultas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBVerConsultas.setText("Ver Consultas");
        jBVerConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerConsultasActionPerformed(evt);
            }
        });
        jPanel2.add(jBVerConsultas);

        jBSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jBSalir);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Edad:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 40, 30));

        jTAP.setText("NAVARRO");
        jPanel3.add(jTAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 140, 30));

        jLabel2.setText("Apellido P:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 30));

        jLBorrar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLBorrar1.setText("COD:");
        jPanel3.add(jLBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 30));

        jLCodigo.setText("HC0001");
        jPanel3.add(jLCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 30));

        jLBorrar2.setText("Estado del Paciente:");
        jPanel3.add(jLBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 10, 120, 30));

        bGEstado.add(jRAlta);
        jRAlta.setSelected(true);
        jRAlta.setText("Alta");
        jPanel3.add(jRAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 30));

        bGEstado.add(jRBaja);
        jRBaja.setText("Baja");
        jPanel3.add(jRBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 30));

        jLabel6.setText("Apellido M:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 60, 30));

        jTAM.setText("RUIZ");
        jPanel3.add(jTAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 140, 30));

        jLabel7.setText("Nombre:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 50, 30));

        jTNombre.setText("JOSHUA NICOLAS");
        jPanel3.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 240, 30));

        bGSexo.add(jRHombre);
        jRHombre.setSelected(true);
        jRHombre.setText("Hombre");
        jPanel3.add(jRHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, 30));

        bGSexo.add(jRMujer);
        jRMujer.setText("Mujer");
        jPanel3.add(jRMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 30));

        jCDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIMA", "MADRE DE DIOS" }));
        jPanel3.add(jCDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 150, 30));
        jPanel3.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 150, 30));

        jSEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        jPanel3.add(jSEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 50, 30));

        jLabel8.setText("Fecha de Nacimiento:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 140, 30));

        jLabel9.setText("DNI:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 30, 30));

        jTdni.setText("72566233");
        jPanel3.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 100, 30));

        jLabel10.setText("Telefono:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 60, 30));

        jTTelefono.setText("5256950");
        jPanel3.add(jTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 100, 30));

        jLabel11.setText("Movil:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 40, 30));

        jTMovil.setText("962229088");
        jTMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMovilActionPerformed(evt);
            }
        });
        jPanel3.add(jTMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 100, 30));

        jLabel12.setText("Direccion");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 30));

        jTDireccion.setText("Jr. Alfonso Ugarte #115");
        jPanel3.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 220, 30));

        jTCorre.setText("joshua.navarro35@gmail.com");
        jPanel3.add(jTCorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 220, 30));

        jTGrpSanguineo.setText("O+");
        jPanel3.add(jTGrpSanguineo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 150, 30));

        jCEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", " " }));
        jPanel3.add(jCEstCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jAPersonales.setColumns(20);
        jAPersonales.setRows(5);
        jScrollPane1.setViewportView(jAPersonales);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabClinico.addTab("Ant. personales", jPanel4);

        jAFamiliares.setColumns(20);
        jAFamiliares.setRows(5);
        jScrollPane2.setViewportView(jAFamiliares);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabClinico.addTab("Ant. familiares", jPanel10);

        jAAlergias.setColumns(20);
        jAAlergias.setRows(5);
        jScrollPane3.setViewportView(jAAlergias);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabClinico.addTab("Alergias", jPanel11);

        jAVacunas.setColumns(20);
        jAVacunas.setRows(5);
        jScrollPane4.setViewportView(jAVacunas);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabClinico.addTab("Vacunas", jPanel12);

        jAInter.setColumns(20);
        jAInter.setRows(5);
        jScrollPane5.setViewportView(jAInter);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabClinico.addTab("Int. quirurgicas", jPanel13);

        jACronicas.setColumns(20);
        jACronicas.setRows(5);
        jScrollPane6.setViewportView(jACronicas);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabClinico.addTab("Enf. Cronicas", jPanel14);

        jPanel3.add(jTabClinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 770, 130));

        jCProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIMA", "BARRANCA" }));
        jPanel3.add(jCProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 150, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Departamento:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Grp. Sanguineo:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 90, 30));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Distrito:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 50, 30));

        jCDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMAS", "MIRAFLORES", "SAN JUAN DEL LURIGANCHO" }));
        jPanel3.add(jCDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 220, 30));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Provincia:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 70, 30));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Correo:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMovilActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        this.modificarEstado("Buscar");
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        this.modificarEstado("Nuevo");
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        this.modificarEstado("Guardar");
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBVerConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerConsultasActionPerformed
        IntAdmConsulta dialog = new IntAdmConsulta(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jBVerConsultasActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntVenAdmision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntVenAdmision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntVenAdmision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntVenAdmision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntVenAdmision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGEstado;
    private javax.swing.ButtonGroup bGSexo;
    private javax.swing.JTextArea jAAlergias;
    private javax.swing.JTextArea jACronicas;
    private javax.swing.JTextArea jAFamiliares;
    private javax.swing.JTextArea jAInter;
    private javax.swing.JTextArea jAPersonales;
    private javax.swing.JTextArea jAVacunas;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVerConsultas;
    private javax.swing.JComboBox<String> jCDepartamento;
    private javax.swing.JComboBox<String> jCDistrito;
    private javax.swing.JComboBox<String> jCEstCivil;
    private javax.swing.JComboBox<String> jCProvincia;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLBorrar1;
    private javax.swing.JLabel jLBorrar2;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRAlta;
    private javax.swing.JRadioButton jRBaja;
    private javax.swing.JRadioButton jRHombre;
    private javax.swing.JRadioButton jRMujer;
    private javax.swing.JSpinner jSEdad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTAM;
    private javax.swing.JTextField jTAP;
    private javax.swing.JTextField jTCorre;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTGrpSanguineo;
    private javax.swing.JTextField jTMovil;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTabbedPane jTabClinico;
    private javax.swing.JTextField jTdni;
    // End of variables declaration//GEN-END:variables
}
