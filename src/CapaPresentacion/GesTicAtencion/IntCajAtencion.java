
package CapaPresentacion.GesTicAtencion;

import CapaEntidades.Date;
import CapaEntidades.GesTicAtencion.TicketAtencion;

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
    }

    //Variables Propias
    private final String us;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLCodTicket = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ticket de Atencion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 53, 590, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Codigo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 30));

        jLCodTicket.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLCodTicket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLCodTicket.setText("170220TI001");
        jPanel2.add(jLCodTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 290, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 450, 30));

        jLFecha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLFecha.setText("20/02/2017");
        jPanel2.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 130, 30));

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
        
    }//GEN-LAST:event_jBDesTicketActionPerformed

    private void jBGenFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenFacturaActionPerformed
        String cliente = "JOSHUA NAVARRO RUIZ";
        String dni = "72566233";
        IntGenBoleta dialog = new IntGenBoleta(new javax.swing.JFrame(), true,us
                ,new TicketAtencion("170220TI002", new Date("05/05/2018")),cliente,dni);
        dialog.setVisible(true);
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
    private javax.swing.JLabel jLCodTicket;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
