
package CapaPresentacion.GesTicAtencion;

import CapaEntidades.Date;
import CapaEntidades.GesTicAtencion.TicketAtencion;
import CapaEntidades.Seguridad.Usuario;
import CapaNegocio.Seguridad.Usuario_LN;

/**
 *
 * @author Joshua
 */
public class IntGenBoleta extends javax.swing.JDialog {

    /**
     * Creates new form IntGenBoleta
     * @param parent
     * @param modal
     * @param us
     * @param ticket
     * @param cliente
     * @param dni
     */
    public IntGenBoleta(java.awt.Frame parent, boolean modal, String us, TicketAtencion ticket, String cliente, String dni) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        iniciarVentana(us, ticket, cliente, dni);
    }
    
    //Metodos Propios
    private void iniciarVentana(String us, TicketAtencion ticket, String cliente, String dni) {
        Usuario usuario = new Usuario_LN().buscarUsuarios(us).get(0);
        String nombre = usuario.getNombre().toUpperCase() + " " + usuario.getApellido().toUpperCase();
        this.jLCodUsuario.setText(usuario.getCodigo());
        this.jLNomUsuario.setText(nombre);
        this.jLFecha.setText(ticket.getFecGenerada().toString());
        this.jLCodTicket.setText(ticket.getCodigo());
        this.jLCliente.setText(cliente);
        this.jLDNI.setText(dni);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPDatUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLCodUsuario = new javax.swing.JLabel();
        jLNomUsuario = new javax.swing.JLabel();
        jPFecha = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jPProducto = new javax.swing.JPanel();
        jLCodTicket = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPDatCliente = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLDNI = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Boleta de Venta Electronica");

        jPLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<center>HOSPITAL NACIONAL ARZOBISPO LOAYZA</center>\n<center> Av. Alfonso Ugarte 848 - Lima</center>\n<center>Boleta de Venta Electronica</center>\n</html>");
        jPLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 370, 90));

        jPDatUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPDatUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Vendedor:");
        jPDatUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        jLCodUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLCodUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCodUsuario.setText("US001");
        jPDatUsuario.add(jLCodUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, 40));

        jLNomUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLNomUsuario.setText("JOSHUA NAVARRO");
        jPDatUsuario.add(jLNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 240, 40));

        jPFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPFecha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha de Emision:");
        jPFecha.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jLFecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLFecha.setText("20/02/2017");
        jPFecha.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 240, 40));

        jPProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCodTicket.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLCodTicket.setText("170220TI001");
        jPProducto.add(jLCodTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("TICKET DE ATENCION");
        jPProducto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("1.00 UN.   X  20.00");
        jPProducto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("20.00");
        jPProducto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("TOTAL S/");
        jPProducto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("20.00");
        jPProducto.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jPDatCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPDatCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("CLIENTE:");
        jPDatCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("TIPO DE DOCUMENTO:");
        jPDatCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("DNI");
        jPDatCliente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 90, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("NUMERO DE DOCUMENTO:");
        jPDatCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));

        jLDNI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLDNI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLDNI.setText("72566233");
        jPDatCliente.add(jLDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 90, -1));

        jLCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCliente.setText("JOSHUA NICOLAS NAVARRO RUIZ");
        jPDatCliente.add(jLCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 240, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton1.setText("Imprimir");
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntGenBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntGenBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntGenBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntGenBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IntGenBoleta dialog = new IntGenBoleta(new javax.swing.JFrame(), true,"josnav",
                        new TicketAtencion("170220TI002", new Date("05/05/2018")),"joshua","caca");
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLCodTicket;
    private javax.swing.JLabel jLCodUsuario;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLNomUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatCliente;
    private javax.swing.JPanel jPDatUsuario;
    private javax.swing.JPanel jPFecha;
    private javax.swing.JPanel jPLogo;
    private javax.swing.JPanel jPProducto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
