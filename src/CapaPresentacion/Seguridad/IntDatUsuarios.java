
package CapaPresentacion.Seguridad;

import CapaEntidades.Seguridad.Usuario;
import CapaNegocio.Seguridad.Usuario_LN;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class IntDatUsuarios extends javax.swing.JDialog {

    /**
     * Creates new form asd
     */
    public IntDatUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.jTCodigo.setText(new Usuario_LN().generarCodigo());
        this.usu = null;
    }
    
    public IntDatUsuarios(java.awt.Frame parent, boolean modal, Usuario usu) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.usu = usu;
        this.llenarCampos(usu);
    }
    
    //VARIABLES PROPIAS
    private Usuario usu = null;
    
    //METODOS PROPIOS
    private boolean validarEspacios(){
        boolean valido = true;
        if(     "".equals(this.jTNombre.getText()) || 
                "".equals(this.jTApellido.getText()) ||
                "".equals(this.jTUsuario.getText()) ||
                "".equals(this.jTClave.getText())
                )
            valido = false;
        return valido;
    }
    
    private void llenarCampos(Usuario usuario) {
        this.jTCodigo.setText(usuario.getCodigo());
        this.jTNombre.setText(usuario.getNombre());
        this.jTApellido.setText(usuario.getApellido());
        this.jTUsuario.setText(usuario.getUsuario());
        this.jTClave.setText(usuario.getClave());
        this.jCTipo.setSelectedItem(usuario.getTipo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTClave = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jCTipo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jBGuardar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 76, 25));

        jTCodigo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTCodigo.setEnabled(false);
        getContentPane().add(jTCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 93, 25));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 76, 25));

        jTNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 170, 25));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 76, 25));

        jTApellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 76, 25));

        jTUsuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 170, 25));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 76, 25));

        jTClave.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(jTClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 170, 25));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Tipo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 76, 25));

        jCTipo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal de Caja", "Personal de Ventanilla", "Medico", "Administrador" }));
        getContentPane().add(jCTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 170, 25));

        jPanel1.setLayout(new java.awt.GridLayout());

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar);

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBCancelar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 286, 380, 54));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if(this.validarEspacios()) {
            Usuario usuario = new Usuario(
                    this.jTCodigo.getText(),
                    this.jTNombre.getText(),
                    this.jTApellido.getText(),
                    this.jTUsuario.getText(),
                    this.jTClave.getText(),
                    this.jCTipo.getSelectedItem().toString()
            );
            if(this.usu == null) {
                new Usuario_LN().guardarUsuario(usuario);
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            } else {
                new Usuario_LN().modificarUsuario(usuario);
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente");
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todo los campos");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IntDatUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IntDatUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IntDatUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IntDatUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                
//                IntDatUsuarios dialog = new IntDatUsuarios(new javax.swing.JFrame(), true, new Usuario("US003","Joshua","Navarro","josnav","1234","Personal de Ventanilla"));
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JPasswordField jTClave;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
