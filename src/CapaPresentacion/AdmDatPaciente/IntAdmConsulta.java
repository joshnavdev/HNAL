
package CapaPresentacion.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Receta;
import CapaEntidades.AteTriaje.Consulta;
import CapaEntidades.AteTriaje.Especialidad;
import CapaEntidades.AteTriaje.Medico;
import CapaNegocio.AdmDatPaciente.Receta_LN;
import CapaNegocio.AteTriaje.Consulta_LN;
import CapaNegocio.AteTriaje.Especialidad_LN;
import CapaNegocio.AteTriaje.Medico_LN;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joshua
 */
public class IntAdmConsulta extends javax.swing.JDialog {

    /**
     * Creates new form IntAdmConsulta
     * @param parent
     * @param modal
     * @param codHisClinico
     * @param nombre
     */
    public IntAdmConsulta(java.awt.Frame parent, boolean modal, String codHisClinico, String nombre) {
        super(parent, modal);
        initComponents();
        this.codHisClinico = codHisClinico;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.iniciarVentana(codHisClinico,nombre);
        

    }
    //Variables Propias
    ArrayList<Consulta> consultas;
    ArrayList<Especialidad> especialidades;
    ArrayList<Medico> medicos;
    private String codHisClinico;
    private String codConsulta;
    int flag1 = 0;
    
    //Metodos Propios
    
//    private void ponerEspecialidades() {
//        especialidades = new Especialidad_LN().listarEspecialidad();
//        this.jCEspecialidad.removeAllItems();
//        for(Especialidad especialidad: especialidades)
//            this.jCEspecialidad.addItem(especialidad.getNombre());
//    }
//    private void ponerMedicos() {
//        medicos = new Medico_LN().listarMedicoEsp(this.obtenerCodigo(this.especialidades, this.jCEspecialidad.getSelectedItem().toString()));
//        this.jCMedico.removeAllItems();
//        for(Medico medico: medicos){
//            String nombre = medico.getNombre() + " " +medico.getApellido();
//            this.jCMedico.addItem(nombre);
//
//        }
//    }
//    
    private String obtenerCodigo(ArrayList<Especialidad> especialidades, String nombre) {
        String codigo = null;
        for(Especialidad temp : especialidades) {
            if(temp.getNombre().equals(nombre))
                codigo = temp.getCodEspecialidad();
        }
        return codigo;
    }
    private void iniciarVentana(String codHisClinico,String nombre) {
        this.iniciarTabla(codHisClinico);
        this.jLNombre.setText(nombre);
        this.jLDate.setText("");
        this.jADiagnostico.setEditable(false);
        this.jAMedicamento.setEditable(false);
        this.jASintomas.setEditable(false);
        this.jATratamiento.setEditable(false);
        this.modificarEstado("Inicio");
    }
    private void iniciarTabla(String codHisClinico) {
        DefaultTableModel modelo = new DefaultTableModel();
        //Iniciar Columnas
        String[] columnas = {"Cod","Fecha","Sintomas","Diagnostico","Medicamento","Tratamiento"};
        for (String columna : columnas) 
            modelo.addColumn(columna);
        
        consultas = new Consulta_LN().listarConsultasHc(codHisClinico);
       
        for(Consulta consulta : consultas) {
            System.out.println(consulta);
            Receta receta = new Receta_LN().buscarReceta(consulta.getCodReceta());
            String[] temp = new String[6];
            if(consulta.getDiagnostico() == null)
                consulta.setDiagnostico("");
            if(receta != null) {
                temp[0] = consulta.getCodConsulta();
                temp[1] = consulta.getFechaEmision();
                temp[2] = consulta.getSintomas();
                temp[3] = consulta.getDiagnostico();
                temp[4] = receta.getMedicamento();
                temp[5] = receta.getTratamiento();
            } else {
                temp[0] = consulta.getCodConsulta();
                temp[1] = consulta.getFechaEmision();
                temp[2] = consulta.getSintomas();
                temp[3] = consulta.getDiagnostico();
                temp[4] = "";
                temp[5] = "";
            }
             
            modelo.addRow(temp);
        }
            
        this.jTable1.setModel(modelo);
    }
    
    private boolean toBoolean(int num) {
        return num != 0;
    }
    private void modificarBotones(int[] estado) {
        this.jBAgregar.setEnabled(toBoolean(estado[0]));
        this.jBGuardar.setEnabled(toBoolean(estado[1]));
        this.jBVerDatos.setEnabled(toBoolean(estado[2]));
        this.jBImpReceta.setEnabled(toBoolean(estado[3]));
      
    }
    private void modificarEstado(String cadena){
        switch(cadena) {
            case "Inicio":
                int[] inicio ={1,0,1,0};
                this.modificarBotones(inicio);
                break;
            case "Guardar":
                int[] guardar ={1,0,1,1}; 
                this.modificarBotones(guardar);
                break;
            case "Ver Datos":
                int[] verDatos ={1,0,1,0}; 
                this.modificarBotones(verDatos);
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLDate = new javax.swing.JLabel();
        jCEspecialidad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jCMedico = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jASintomas = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jADiagnostico = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jAMedicamento = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jATratamiento = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jBAgregar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBVerDatos = new javax.swing.JButton();
        jBImpReceta = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Especialidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Paciente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 30));

        jLNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLNombre.setText("JOSHUA NICOLAS NAVARRO RUIZ");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 60, 30));

        jLDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDate.setText("23/01/2034");
        jPanel1.add(jLDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 190, 30));

        jCEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCEspecialidad.setEnabled(false);
        jCEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCEspecialidadActionPerformed(evt);
            }
        });
        jPanel1.add(jCEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Medico:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 60, 30));

        jCMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCMedico.setEnabled(false);
        jPanel1.add(jCMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 230, 30));

        jASintomas.setColumns(20);
        jASintomas.setRows(5);
        jScrollPane2.setViewportView(jASintomas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sintomas", jPanel4);

        jADiagnostico.setColumns(20);
        jADiagnostico.setRows(5);
        jScrollPane3.setViewportView(jADiagnostico);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Diagnostico", jPanel5);

        jAMedicamento.setColumns(20);
        jAMedicamento.setRows(5);
        jScrollPane4.setViewportView(jAMedicamento);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Medicamento", jPanel6);

        jATratamiento.setColumns(20);
        jATratamiento.setRows(5);
        jScrollPane5.setViewportView(jATratamiento);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tratamiento", jPanel7);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 620, 130));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jBAgregar.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(jBAgregar);

        jBGuardar.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(jBGuardar);

        jBVerDatos.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBVerDatos.setText("Ver Datos");
        jBVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerDatosActionPerformed(evt);
            }
        });
        jPanel3.add(jBVerDatos);

        jBImpReceta.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBImpReceta.setText("<html>\n<center>Generar Tardeja</center>\n<center>del Paciente</center>\n</html>");
        jBImpReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImpRecetaActionPerformed(evt);
            }
        });
        jPanel3.add(jBImpReceta);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Lista de consultas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBImpRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImpRecetaActionPerformed
        String nombre = this.jCMedico.getSelectedItem().toString();
        String especialidad = this.jCEspecialidad.getSelectedItem().toString();
        

        IntGenTarPaciente dialog = new IntGenTarPaciente(new javax.swing.JFrame(), true,nombre,especialidad,codConsulta);
        
        dialog.setVisible(true);
    }//GEN-LAST:event_jBImpRecetaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        String mensaje;
        do {
            mensaje = JOptionPane.showInputDialog( "Ingrese el CODIGO de la cosulta que se encuentra en el TICKET DE DERIVACION:");
        } while (mensaje == null || mensaje.equals(""));
        int resp = new Consulta_LN().modificarConsultaHC(mensaje, this.codHisClinico);
        if(resp != 0) {
            JOptionPane.showMessageDialog(null, "Consulta " + mensaje + " agregada al Historial Clinico "+ this.codHisClinico);
            this.iniciarTabla(codHisClinico);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Codigo no encontrad o Codigo ya existenten en el historial");
        }
        System.out.println(resp);
        
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
//        if(
//            this.jADiagnostico.getText().equals("") ||
//            this.jAMedicamento.getText().equals("") ||
//            this.jASintomas.getText().equals("") ||
//            this.jATratamiento.getText().equals("")
//                ) {
//            JOptionPane.showMessageDialog(null,"Rellene todo los campos" );
//        } else {
//            
//            this.modificarEstado("Guardar");
//
//        }
        

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerDatosActionPerformed
        int idx = this.jTable1.getSelectedRow();
        if(idx != -1) {
            ArrayList<String> medEsp = new Consulta_LN().obteerEspMedico(this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 0).toString());
            
            codConsulta =  this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 0).toString();
            String date = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 1).toString();
            date = (date == null) ? "" : date;
            this.jLDate.setText(date);
            String sintomas = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 2).toString();
            sintomas = (sintomas == null) ? "" : sintomas;
            this.jASintomas.setText(sintomas);
            String diagnostico = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 3).toString();
            diagnostico = (diagnostico == null) ? "" : diagnostico;
            this.jADiagnostico.setText(diagnostico);
            String medicamento = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 4).toString();
            medicamento = (medicamento == null) ? "" : medicamento;
            this.jAMedicamento.setText(medicamento);
            String tratamiento = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 5).toString();
            tratamiento = (tratamiento == null) ? "" : tratamiento;
            this.jATratamiento.setText(tratamiento);
            
            this.jCEspecialidad.removeAllItems();
            this.jCEspecialidad.addItem(medEsp.get(1));
            this.jCMedico.removeAllItems();
            this.jCMedico.addItem(medEsp.get(0));

            
            
            this.modificarEstado("Ver Datos");
            this.modificarEstado("Guardar");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione alguna CONSULTA");
        }
        

    }//GEN-LAST:event_jBVerDatosActionPerformed

    private void jCEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCEspecialidadActionPerformed
//        if(flag1 == 1){
//            this.ponerMedicos();
//        }
    }//GEN-LAST:event_jCEspecialidadActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntAdmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntAdmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntAdmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntAdmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IntAdmConsulta dialog = new IntAdmConsulta(new javax.swing.JFrame(), true,"HC0001","ASD DSA FFF");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jADiagnostico;
    private javax.swing.JTextArea jAMedicamento;
    private javax.swing.JTextArea jASintomas;
    private javax.swing.JTextArea jATratamiento;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBImpReceta;
    private javax.swing.JButton jBVerDatos;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jCEspecialidad;
    private javax.swing.JComboBox<String> jCMedico;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
