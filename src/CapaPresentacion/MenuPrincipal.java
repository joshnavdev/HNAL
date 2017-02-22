
package CapaPresentacion;

import CapaPresentacion.AteTriaje.IntTriaje;
import CapaPresentacion.GesTicAtencion.IntCajAtencion;
import CapaPresentacion.Seguridad.IntAdmUsuarios;

/**
 *
 * @author Joshua
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     * @param tipo
     * @param us
     */
    public MenuPrincipal(String tipo, String us) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.iniciarVentana(tipo);
        this.us = us; 
    }
    //Variables Propias
    
    private final String us;
    
    //Metodos Propios
    private void iniciarVentana(String tipo){
        this.jBCaja.setEnabled(false);
        this.jBTriaje.setEnabled(false);
        this.jBVentanilla.setEnabled(false);
        this.jBConsultorio.setEnabled(false);
        this.jBAdministrar.setEnabled(false);
        switch(tipo){
            case "Administrador": 
                this.jBAdministrar.setEnabled(true);
                break;
            case "Medico": 
                this.jBTriaje.setEnabled(true);
                this.jBConsultorio.setEnabled(true);
                break;
            case "Personal de Caja": 
                this.jBCaja.setEnabled(true);
                break;
            case "Personal de Ventanilla": 
                this.jBVentanilla.setEnabled(true);
                break;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBCaja = new javax.swing.JButton();
        jBTriaje = new javax.swing.JButton();
        jBVentanilla = new javax.swing.JButton();
        jBConsultorio = new javax.swing.JButton();
        jBAdministrar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atencion al Paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOSPITAL NACIONAL ARZOBISPO LOAYZA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1000, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        jBCaja.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jBCaja.setText("Caja de Atencion");
        jBCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCajaActionPerformed(evt);
            }
        });
        jPanel2.add(jBCaja);

        jBTriaje.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jBTriaje.setText("Triaje");
        jBTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTriajeActionPerformed(evt);
            }
        });
        jPanel2.add(jBTriaje);

        jBVentanilla.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jBVentanilla.setText("Ventanilla de Admision");
        jPanel2.add(jBVentanilla);

        jBConsultorio.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jBConsultorio.setText("Consultorio");
        jPanel2.add(jBConsultorio);

        jBAdministrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jBAdministrar.setText("Administrar Usuarios");
        jBAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdministrarActionPerformed(evt);
            }
        });
        jPanel2.add(jBAdministrar);

        jBSalir.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jBSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdministrarActionPerformed
        this.dispose();
        new IntAdmUsuarios().setVisible(true);
    }//GEN-LAST:event_jBAdministrarActionPerformed

    private void jBCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCajaActionPerformed
        this.dispose();
        new IntCajAtencion(this.us).setVisible(true);
    }//GEN-LAST:event_jBCajaActionPerformed

    private void jBTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTriajeActionPerformed
        this.dispose();
        new IntTriaje().setVisible(true);
    }//GEN-LAST:event_jBTriajeActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal("Administrador","nicnav").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdministrar;
    private javax.swing.JButton jBCaja;
    private javax.swing.JButton jBConsultorio;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBTriaje;
    private javax.swing.JButton jBVentanilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
