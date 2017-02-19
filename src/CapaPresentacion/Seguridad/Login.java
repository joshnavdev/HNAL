
package CapaPresentacion.Seguridad;

/**
 *
 * @author Joshua
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPLogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTClave = new javax.swing.JTextField();
        jBIngresar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Hospital Nacional Arzobispo Loayza");
        jPLogo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Atencion al Paciente");
        jPLogo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jPLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Usuario");
        jPLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 20));

        jTUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPLogin.add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 167, -1));

        jBCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBCancelar.setText("Cancelar");
        jPLogin.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Clave");
        jPLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, 20));

        jTClave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPLogin.add(jTClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 167, -1));

        jBIngresar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBIngresar1.setText("Ingresar");
        jBIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar1ActionPerformed(evt);
            }
        });
        jPLogin.add(jBIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar1ActionPerformed
        
        
    }//GEN-LAST:event_jBIngresar1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBIngresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPLogo;
    private javax.swing.JTextField jTClave;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
