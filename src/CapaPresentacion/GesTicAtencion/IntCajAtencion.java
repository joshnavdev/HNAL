
package CapaPresentacion.GesTicAtencion;

import CapaEntidades.Date;
import CapaEntidades.GesTicAtencion.TicketAtencion;
import CapaNegocio.Date_LN;
import CapaNegocio.GesTicAtencion.TicketAtencion_LN;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class IntCajAtencion extends javax.swing.JFrame {

    /**
     * Creates new form IntCA
     * @param us
     */
    public IntCajAtencion(String us) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.us = us;
        this.iniciarVentana();
    }

    //Variables Propias
    private final String us;
    
    //Metodos Propios
    private void iniciarVentana() {
        this.jBGenFactura.setEnabled(false);
        this.jLCodTicket.setText(new TicketAtencion_LN().generarCodigo());
        this.jLFecha.setText(new Date_LN().obtenerFecha());
        this.jLModificable.setText("Ticket de Atencion");
        this.jLBorrar1.setText("Codigo:");
        this.jLBorrar2.setText("Fecha:");
        
        this.labelsInicio(true);
    }

    private void modificarVentana() {
        this.jLModificable.setText("TICKET DESPACHADO");
        this.jLAyuda.setText("GENERE LA FACTURA --->");
        
        this.labelsInicio(false);
    }
    
    private void labelsInicio(boolean b){
        this.jLBorrar1.setVisible(b);
        this.jLBorrar2.setVisible(b);
        this.jLCodTicket.setVisible(b);
        this.jLFecha.setVisible(b);
        this.jLAyuda.setVisible(!b);
        
        this.jBDesTicket.setEnabled(b);
        this.jBGenFactura.setEnabled(!b);
        this.jButton3.setEnabled(b);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLModificable = new javax.swing.JLabel();
        jLBorrar1 = new javax.swing.JLabel();
        jLCodTicket = new javax.swing.JLabel();
        jLBorrar2 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jLAyuda = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBDesTicket = new javax.swing.JButton();
        jBGenFactura = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<center>HOSPITAL NACIONAL ARZOBISPO LOAYZA</center>\n<center>Caja de Atencion</center>\n</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLModificable.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLModificable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificable.setText("Ticket de Atencion");
        jPanel2.add(jLModificable, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 53, 590, -1));

        jLBorrar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBorrar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLBorrar1.setText("Codigo:");
        jPanel2.add(jLBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 30));

        jLCodTicket.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLCodTicket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLCodTicket.setText("170220TI001");
        jPanel2.add(jLCodTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 290, 30));

        jLBorrar2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBorrar2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLBorrar2.setText("Fecha:");
        jPanel2.add(jLBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 450, 30));

        jLFecha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLFecha.setText("20/02/2017");
        jPanel2.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 130, 30));

        jLAyuda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLAyuda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 180, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jBDesTicket.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBDesTicket.setText("<html>\n<p>Despachar</p>\n<center>Ticket</center>\n</html>");
        jBDesTicket.setActionCommand("<html>\n<center>Despachar</center>\n<center>Ticket</center>\n</html>");
        jBDesTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDesTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesTicketActionPerformed(evt);
            }
        });
        jPanel3.add(jBDesTicket);

        jBGenFactura.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBGenFactura.setText("<html>\n<center>Generar</center>\n<center>Factura</center>\n</html>");
        jBGenFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGenFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenFacturaActionPerformed(evt);
            }
        });
        jPanel3.add(jBGenFactura);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton3.setText("Salir");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("vista previa del ticket");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBDesTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesTicketActionPerformed
        this.modificarVentana();
        TicketAtencion ticket = new TicketAtencion(this.jLCodTicket.getText());
        new TicketAtencion_LN().guardarTicketAtencion(ticket);
        JOptionPane.showMessageDialog(null, "Ticket  "+this.jLCodTicket.getText()+"  despachado");
    }//GEN-LAST:event_jBDesTicketActionPerformed

    private void jBGenFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenFacturaActionPerformed
        String cliente = "";
        String dni = "";
        
        do{
            cliente = JOptionPane.showInputDialog("Ingrese el nombre completo del Cliente:");
        }while("".equals(cliente));
        do{
            dni = JOptionPane.showInputDialog("Ingrese el DNI del Cliente:");
        }while("".equals(dni));
        
        if(cliente != null && dni != null){
            cliente = cliente.toUpperCase();
            dni = dni.toUpperCase();
            IntGenBoleta dialog = new IntGenBoleta(new javax.swing.JFrame(), true,us
                    ,new TicketAtencion(this.jLCodTicket.getText()),cliente,dni);
            dialog.setVisible(true);
            int flag = dialog.getFlag();
            if(flag == 1)
                iniciarVentana();
        } else {
            JOptionPane.showMessageDialog(null, "Se detecto una casilla como NULL, vuelva a machucar 'Generar Factura'");
        }
        
            
    }//GEN-LAST:event_jBGenFacturaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntCajAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntCajAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntCajAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntCajAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntCajAtencion("nicnav").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDesTicket;
    private javax.swing.JButton jBGenFactura;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLAyuda;
    private javax.swing.JLabel jLBorrar1;
    private javax.swing.JLabel jLBorrar2;
    private javax.swing.JLabel jLCodTicket;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLModificable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
