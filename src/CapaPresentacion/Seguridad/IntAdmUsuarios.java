
package CapaPresentacion.Seguridad;

import CapaEntidades.Seguridad.Usuario;
import CapaNegocio.Seguridad.Usuario_LN;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joshua
 */
public class IntAdmUsuarios extends javax.swing.JFrame {
    
    /**
     * Creates new form IntAdmUsuarios
     */
    public IntAdmUsuarios() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.iniciarVentana();
    }
    
    //VARIABLES PROPIAS
    int flag = 0;

    
    //METODOS PROPIOS
    private void iniciarVentana() {
        this.cambiarBotones(false);
        this.iniciarTabla();
        flag = 0;
    }
    private void cambiarBotones(boolean b) {
        this.jBModificar.setEnabled(b);
        this.jBEliminar.setEnabled(b);
    }
    private void iniciarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        //Iniciar Columnas
        String[] columnas = {"Cod","Nombre","Apellido","Usuario","Tipo"};
        for (String columna : columnas) 
            modelo.addColumn(columna);
        
        //Listar Usuarios
        ArrayList<Usuario> usuarios = new Usuario_LN().listarUsuarios();
        for(Usuario usuario : usuarios){
            String[] temp = {usuario.getCodigo(),usuario.getNombre(),usuario.getApellido(),usuario.getUsuario(),usuario.getTipo()};
            modelo.addRow(temp);
        }
        this.jTable1.setModel(modelo);
    }
    
    private void llenarTabla(ArrayList<Usuario> usuarios) {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();
        int rowCount = modelo.getRowCount();
        for(int i=0;i<rowCount;i++) 
            modelo.removeRow(0);
  
        for(Usuario usuario : usuarios){
            String[] temp = {usuario.getCodigo(),usuario.getNombre(),usuario.getApellido(),usuario.getUsuario(),usuario.getTipo()};
            modelo.addRow(temp);
        }
        this.jTable1.setModel(modelo);
        flag = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jBBuscar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 920, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOSPITAL NACIONAL ARZOBISPO LOAYZA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 920, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 270));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jBBuscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(jBBuscar);

        jBAgregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(jBAgregar);

        jBModificar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        jPanel3.add(jBModificar);

        jBEliminar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(jBEliminar);

        jBSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel3.add(jBSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        IntDatUsuarios dialog = new IntDatUsuarios(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        this.iniciarVentana();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String respuesta = "";
        do {
            respuesta = JOptionPane.showInputDialog(null, "Ingrese Codigo, nombre o Tipo de usuario para realizar la busqueda:");
        }while("".equals(respuesta));
        ArrayList<Usuario> usuarios =  new Usuario_LN().buscarUsuarios(respuesta);
        if(!usuarios.isEmpty()) {
            this.llenarTabla(usuarios);
            this.cambiarBotones(false);
        } else {
            JOptionPane.showMessageDialog(null, "Datos no encontrados");
        }
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(flag == 0) {
            flag = 1;
            this.cambiarBotones(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String codigo = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 3).toString();
        ArrayList<Usuario> usuarios = new Usuario_LN().buscarUsuarios(codigo);
        Usuario usuario = usuarios.get(0);
        IntDatUsuarios dialog = new IntDatUsuarios(new javax.swing.JFrame(), true, usuario);
        dialog.setVisible(true);    
        this.iniciarVentana();
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        String codigo = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        int res = JOptionPane.showConfirmDialog(null, "Seguro que quiere eliminar al usuario con codigo " + codigo);
        if(res == 0) {
            new Usuario_LN().eliminarUsuario(codigo);
            JOptionPane.showMessageDialog(null, "Usuario " + codigo + " eliminado");
            this.iniciarVentana();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntAdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntAdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntAdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntAdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntAdmUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
