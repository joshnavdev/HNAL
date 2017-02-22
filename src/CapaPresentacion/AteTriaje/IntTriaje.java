
package CapaPresentacion.AteTriaje;

import CapaEntidades.AteTriaje.Consulta;
import CapaEntidades.AteTriaje.Especialidad;
import CapaEntidades.AteTriaje.Medico;
import CapaNegocio.AteTriaje.Consulta_LN;
import CapaNegocio.AteTriaje.Especialidad_LN;
import CapaNegocio.AteTriaje.Medico_LN;
import CapaNegocio.Date_LN;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        this.jCEspecialidad.addItem("ELIJA ESPECIALIDAD");
        especialidades = new Especialidad_LN().listarEspecialidad();
        for (Especialidad especialidad : especialidades) {
            this.jCEspecialidad.addItem(especialidad.getNombre());
        }
        this.iniciarVentana();
    }
    
    //Variables propias
    private ArrayList<Especialidad> especialidades;
    ArrayList<Medico> medicos;
    javax.swing.JComboBox<String> nuevo;
    
    //Metodos propios
    private void iniciarVentana(){
        
        
        this.inicarComponentes(true);
        
        this.jTdni.setText("");
        this.jTSintomas.setText("");
        this.jTPaciente.setText("");
        
        this.jLCodConsulta.setText(new Consulta_LN().generarCodigo());
        this.jLFecha.setText(new Date_LN().obtenerFecha());
        this.jCMedico.removeAllItems();
        this.jCEspecialidad.setSelectedIndex(0);
        
        this.jCMedico.setEnabled(false);
    }
    
    private void inicarComponentes(boolean b) {
        this.jPBorrar1.setVisible(b);
        this.jPBorrar2.setVisible(b);
        this.jPBorrar3.setVisible(b);
        
        this.jSBorrar.setVisible(b);
        
        this.jLBorrar1.setVisible(b);
        this.jLBorrar2.setVisible(b);
        this.jLBorrar2.setVisible(b);
        this.jLBorrar3.setVisible(b);
        if(!b)
            this.jLBorrar4.setText("");
        
        this.jLAyuda.setVisible(!b);
        this.jLConfirmacion.setVisible(!b);
        
        this.jBCrearConsulta.setEnabled(b);
        this.jBGenTicDerivacion.setEnabled(!b);
        this.jButton3.setEnabled(b);
    }
    
    private boolean validarCampos() {
        boolean valido = true;
        if(
            "".equals(this.jTPaciente.getText()) || 
            "".equals(this.jTdni.getText()) ||
            "".equals(this.jTSintomas.getText())
                )
            valido = false;
        return valido;
    }
    
    private boolean validarEspecialidad() {
        boolean valido = true;
        if(this.jCEspecialidad.getSelectedIndex() == 0)
            valido = false;
        return valido;
    }
    
    private void modificarVentana() {
        this.inicarComponentes(false);
        this.jLAyuda.setText("GENERE EL TICKET DE DERIVACION --->");
        this.jLConfirmacion.setText("CONSULTA CREADA");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLBorrar4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPBorrar1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jCEspecialidad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jCMedico = new javax.swing.JComboBox<>();
        jPBorrar2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTPaciente = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPBorrar3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLCodConsulta = new javax.swing.JLabel();
        jLBorrar1 = new javax.swing.JLabel();
        jSBorrar = new javax.swing.JScrollPane();
        jTSintomas = new javax.swing.JTextArea();
        jLBorrar2 = new javax.swing.JLabel();
        jLBorrar3 = new javax.swing.JLabel();
        jLAyuda = new javax.swing.JLabel();
        jLConfirmacion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBCrearConsulta = new javax.swing.JButton();
        jBGenTicDerivacion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLBorrar4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLBorrar4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBorrar4.setText("Elaborar Consulta:");

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

        jPBorrar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPBorrar1.setOpaque(false);
        jPBorrar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Especialidad:");
        jPBorrar1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 50));

        jCEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCEspecialidadActionPerformed(evt);
            }
        });
        jPBorrar1.add(jCEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Medico:");
        jPBorrar1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 90, 50));

        jCMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPBorrar1.add(jCMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 260, 30));

        jPanel2.add(jPBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 630, 50));

        jPBorrar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPBorrar2.setOpaque(false);
        jPBorrar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");
        jPBorrar2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        jTPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPBorrar2.add(jTPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 270, 30));

        jTdni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPBorrar2.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("DNI:");
        jPBorrar2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 50, 50));

        jPanel2.add(jPBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 630, 50));

        jPBorrar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPBorrar3.setOpaque(false);
        jPBorrar3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fecha:");
        jPBorrar3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 70, 50));

        jLFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLFecha.setText("21/02/2027");
        jPBorrar3.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Numero de Consulta:");
        jPBorrar3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 50));

        jLCodConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLCodConsulta.setText("CO0001");
        jPBorrar3.add(jLCodConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 60, 50));

        jPanel2.add(jPBorrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 50));

        jLBorrar1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLBorrar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBorrar1.setText("Derivacion:");
        jPanel2.add(jLBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 20));

        jTSintomas.setColumns(20);
        jTSintomas.setRows(5);
        jSBorrar.setViewportView(jTSintomas);

        jPanel2.add(jSBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 630, -1));

        jLBorrar2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLBorrar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBorrar2.setText("Sintomas:");
        jPanel2.add(jLBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 20));

        jLBorrar3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLBorrar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBorrar3.setText("Paciente:");
        jPanel2.add(jLBorrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 20));

        jLAyuda.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLAyuda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 500, -1));

        jLConfirmacion.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLConfirmacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 650, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jBCrearConsulta.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBCrearConsulta.setText("<html>\n<center>Crear</center>\n<center>Consulta</center>\n</html>");
        jBCrearConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCrearConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearConsultaActionPerformed(evt);
            }
        });
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
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
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
                        .addComponent(jLBorrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLBorrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGenTicDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenTicDerivacionActionPerformed
        int idx = this.jCEspecialidad.getSelectedIndex() -1;
        IntGenTicDerivacion dialog = new IntGenTicDerivacion(new javax.swing.JFrame(), true,
                this.jLCodConsulta.getText(),
                this.especialidades.get(idx)
                );
        dialog.setVisible(true);
        int flag = dialog.getFlag();
        if(flag == 1){
            this.iniciarVentana();
        }
    }//GEN-LAST:event_jBGenTicDerivacionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCEspecialidadActionPerformed
        int idx = this.jCEspecialidad.getSelectedIndex() -1;
        this.jCMedico.removeAllItems();

        if(idx != -1) {
            medicos = new Medico_LN().listarMedicoEsp(this.especialidades.get(idx).getCodEspecialidad());
            for(Medico medico : medicos){
                this.jCMedico.addItem(medico.toString());
            }
            this.jCMedico.setEnabled(true);
        } else {
            this.jCMedico.setEnabled(false);
        }
    }//GEN-LAST:event_jCEspecialidadActionPerformed

    private void jBCrearConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearConsultaActionPerformed
        if(validarCampos()) {
            if(validarEspecialidad()) {
                int idxMedico = this.jCMedico.getSelectedIndex();
                Consulta consulta = new Consulta(
                        this.jLCodConsulta.getText(),
                        this.medicos.get(idxMedico).getCodMedico(),
                        this.jTSintomas.getText().toUpperCase()
                );
                new Consulta_LN().crearConsulta(consulta);
                JOptionPane.showMessageDialog(null, "Consulta  "+consulta.getCodConsulta()+"  creada");
                this.modificarVentana();
            } else {
                JOptionPane.showMessageDialog(null, "Elija alguna especialidad");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todo los campos");
        }
    }//GEN-LAST:event_jBCrearConsultaActionPerformed

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
    private javax.swing.JLabel jLAyuda;
    private javax.swing.JLabel jLBorrar1;
    private javax.swing.JLabel jLBorrar2;
    private javax.swing.JLabel jLBorrar3;
    private javax.swing.JLabel jLBorrar4;
    private javax.swing.JLabel jLCodConsulta;
    private javax.swing.JLabel jLConfirmacion;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPBorrar1;
    private javax.swing.JPanel jPBorrar2;
    private javax.swing.JPanel jPBorrar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jSBorrar;
    private javax.swing.JTextField jTPaciente;
    private javax.swing.JTextArea jTSintomas;
    private javax.swing.JTextField jTdni;
    // End of variables declaration//GEN-END:variables
}
