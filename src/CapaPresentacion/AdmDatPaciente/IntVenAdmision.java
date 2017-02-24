
package CapaPresentacion.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.*;
import CapaNegocio.AdmDatPaciente.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.JOptionPane;

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
        this.ponerDepartamentos();

        this.iniciarVentana();
    }
    //Variables Propias
    ArrayList<Geografico> departamentos;
    ArrayList<Geografico> provincias;
    ArrayList<Geografico> distritos;
    int flag1 = 0;
    int flag2 = 0;
    int flag3 = 0;
    //Metodos Propios
    private String toDate(String date) {
        String fecha = "";
        String[] splitFecha = date.split(" ");
        //1 mes,2 dia,5 años
        fecha += splitFecha[5]+"-";
        switch(splitFecha[1]) {
            case "Jan": fecha += "01-";break;
            case "Feb": fecha += "02-";break;
            case "Mar": fecha += "03-";break;
            case "Apr": fecha += "04-";break;
            case "May": fecha += "05-";break;
            case "Jun": fecha += "06-";break;
            case "Jul": fecha += "07-";break;
            case "Aug": fecha += "08-";break;
            case "Sep": fecha += "09-";break;
            case "Oct": fecha += "10-";break;
            case "Nov": fecha += "11-";break;
            case "Dec": fecha += "12-";break;
        }
        fecha += splitFecha[2];
        return fecha;
    }
    private void iniciarVentana() {
        flag1 = 0;
        this.ponerDepartamentos();
        flag2 = 0;
        this.ponerProvincias(this.obtenerCodigo(departamentos, this.jCDepartamento.getSelectedItem().toString()));
        this.ponerDistritos(this.obtenerCodigo(provincias, this.jCProvincia.getSelectedItem().toString()));
        flag1 = 1;
        flag2 = 1;

        this.jLCodigo.setText(new HisClinico_LN().generarCodigo());
        this.jTAM.setText("");
        this.jTAP.setText("");
        this.jTNombre.setText("");
        this.jTCorre.setText("");
        this.jTDireccion.setText("");
        this.jTMovil.setText("");
        this.jSEdad.setText("");
        this.jTTelefono.setText("");
        this.jTdni.setText("");
        this.jTGrpSanguineo1.setText("");
        
        this.jAAlergias.setText("");
        this.jACronicas.setText("");
        this.jAFamiliares.setText("");
        this.jAInter.setText("");
        this.jAPersonales.setText("");
        this.jAVacunas.setText("");
        
        this.jDate.setText("");
        
    }
    private boolean validarCampos() {
        boolean valido = true;
        
        return valido;
    }
    private String obtenerCodigo(ArrayList<Geografico> geografico, String nombre) {
        String codigo = null;
        for(Geografico temp : geografico) {
            if(temp.getNombre().equals(nombre))
                codigo = temp.getCodigo();
        }
        return codigo;
    }
    private void ponerDepartamentos() {
        departamentos = new Geografico_LN().listarDepartamento();
        this.jCDepartamento.removeAllItems(); //primera
        for(Geografico departamento : departamentos)
            this.jCDepartamento.addItem(departamento.getNombre());
    }
    private void ponerProvincias(String codDepartamento) {
        provincias = new Geografico_LN().listarProvinciaDep(codDepartamento);
        this.jCProvincia.removeAllItems();
        for(Geografico provincia : provincias)
            this.jCProvincia.addItem(provincia.getNombre());
    }
    private void ponerDistritos(String codProvincia) {
        distritos = new Geografico_LN().listaDistritoPro(codProvincia);
        this.jCDistrito.removeAllItems();
        for(Geografico distrito : distritos)
            this.jCDistrito.addItem(distrito.getNombre());
    }
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
        this.jTGrpSanguineo1.setEditable(b);
        this.jTMovil.setEditable(b);
        this.jTTelefono.setEditable(b);
        this.jTdni.setEditable(b);
        
        
        this.jAPersonales.setEditable(b);
        this.jAAlergias.setEditable(b);
        this.jACronicas.setEditable(b);
        this.jAFamiliares.setEditable(b);
        this.jAInter.setEditable(b);
        this.jAVacunas.setEditable(b);
        
        this.jbDate.setEnabled(b);
       
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
    private boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    private int buscadIdx(ArrayList<Geografico> geos,String nombre) {
        int resp = -1;
        for (int i = 0; i < geos.size(); i++) {
            if(geos.get(i).getNombre().equals(nombre))
                resp = i;
        }
        return resp;
    }
    private void selecionarEstCivil(String estadoC) {
        int idx = 0;
        switch(estadoC) {
            case "Soltero/a": idx = 0;break;
            case "Casado/a": idx = 1;break;
            case "Divorciado/a": idx = 2;break;
            case "Viudo/a": idx = 3;break;
        }
        this.jCEstCivil.setSelectedIndex(idx);
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
        jbDate = new com.toedter.calendar.JDateChooser();
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
        jSEdad = new javax.swing.JTextField();
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
        jTGrpSanguineo1 = new javax.swing.JTextField();
        jDate = new javax.swing.JTextField();

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
        jCDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDepartamentoActionPerformed(evt);
            }
        });
        jPanel3.add(jCDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 150, 30));

        jbDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jbDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jbDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbDateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbDateMousePressed(evt);
            }
        });
        jbDate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jbDateInputMethodTextChanged(evt);
            }
        });
        jbDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbDatePropertyChange(evt);
            }
        });
        jbDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbDateKeyPressed(evt);
            }
        });
        jPanel3.add(jbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 43, 30));

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

        jSEdad.setText("21");
        jPanel3.add(jSEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 50, 30));

        jCEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a" }));
        jCEstCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCEstCivilActionPerformed(evt);
            }
        });
        jPanel3.add(jCEstCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jAPersonales.setColumns(20);
        jAPersonales.setRows(5);
        jAPersonales.setText("asdasdasd");
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
        jAAlergias.setText("asdasd");
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
        jCProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProvinciaActionPerformed(evt);
            }
        });
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

        jTGrpSanguineo1.setText("O+");
        jPanel3.add(jTGrpSanguineo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 150, 30));

        jDate.setText("17/02/21");
        jPanel3.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 100, 30));

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
        String respuesta = JOptionPane.showInputDialog(null, "Ingrese DNI del paciente:");
        if(this.isNumeric(respuesta) && !"".equals(respuesta) && respuesta.length()==8) {
            Paciente paciente = new Paciente_LN().buscarPacienteDNI(respuesta);
            if(paciente != null) {
                HisClinico hisClinico = new HisClinico_LN().buscarHisClinicoPac(paciente.getCodPaciente());
                Direccion direccion = new Direccion_LN().buscarDireccion(paciente.getDireccion());
                flag2=0;
                this.ponerProvincias(this.obtenerCodigo(departamentos, direccion.getDepartamento()));
                this.ponerDistritos(this.obtenerCodigo(provincias, direccion.getProvincia()));
                flag2=1;
                this.jCDepartamento.setSelectedIndex(this.buscadIdx(departamentos, direccion.getDepartamento()));
                this.jCProvincia.setSelectedIndex(this.buscadIdx(provincias, direccion.getProvincia()));
                this.jCDistrito.setSelectedIndex(this.buscadIdx(distritos, direccion.getDistrito()));
                this.jLCodigo.setText(hisClinico.getCodHisClinico());
                if(hisClinico.getEstado().equals("1"))
                    this.jRAlta.setSelected(true);
                else
                    this.jRBaja.setSelected(true);
                this.jTNombre.setText(paciente.getNombre());
                this.jTAP.setText(paciente.getApellidoP());
                this.jTAM.setText(paciente.getApellidoM());
                this.selecionarEstCivil(paciente.getEstCivil());
                if(hisClinico.getEstado().equals("H"))
                    this.jRHombre.setSelected(true);
                else
                    this.jRMujer.setSelected(true);
                this.jSEdad.setText(paciente.getEdad());
                this.jTDireccion.setText(direccion.getDireccion());
                this.jTCorre.setText(paciente.getCorreo());
                this.jTdni.setText(paciente.getDni());
                this.jTTelefono.setText(paciente.getTelefono());
                this.jTMovil.setText(paciente.getMovil());
                this.jTGrpSanguineo1.setText(hisClinico.getgSanguineo());
                this.jAPersonales.setText(hisClinico.getAntPersonales());
                this.jAFamiliares.setText(hisClinico.getAntFamiliares());
                this.jAAlergias.setText(hisClinico.getAlergias());
                this.jAVacunas.setText(hisClinico.getVacunas());
                this.jAInter.setText(hisClinico.getIntQuirurgicas());
                this.jACronicas.setText(hisClinico.getEnfCronicas());
                this.jDate.setText(paciente.getFecNacimiento());
                this.modificarEstado("Buscar");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el historial clinico del paciente");
            }

        } else {
            JOptionPane.showMessageDialog(null ,"Ingrese un DNI valido");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        this.iniciarVentana();
        this.modificarEstado("Nuevo");
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        this.modificarEstado("Guardar");
        Paciente paciente = new Paciente(
                this.jTNombre.getText(),
                this.jTAP.getText(),
                this.jTAM.getText(),
                this.jCEstCivil.getSelectedItem().toString(),
                this.getRBSelected(this.bGSexo).equals("Hombre") ? "H":"M",
                this.jDate.getText(),
                this.jSEdad.getText(),
                this.jTTelefono.getText(),
                this.jTMovil.getText(),
                this.jTDireccion.getText(),
                this.obtenerCodigo(this.distritos, this.jCDistrito.getSelectedItem().toString()),
                this.jTCorre.getText(),
                this.jTdni.getText()
        );
        System.out.println(this.toDate(this.jbDate.getDate().toString()));
        HisClinico clinico = new HisClinico(
                this.getRBSelected(this.bGEstado).equals("Alta") ? "1" : "0",
                this.jTGrpSanguineo1.getText(),
                this.jAPersonales.getText(),
                this.jAFamiliares.getText(),
                this.jAAlergias.getText(),
                this.jAVacunas.getText(),
                this.jAInter.getText(),
                this.jACronicas.getText()
        );
        new Paciente_LN().guardarPaciente(paciente);
        new HisClinico_LN().guardarHisClinico(clinico);
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBVerConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerConsultasActionPerformed
        String nombre = this.jTNombre.getText().toUpperCase() + this.jTAP.getText().toUpperCase() + this.jTAM.getText().toUpperCase();
        IntAdmConsulta dialog = new IntAdmConsulta(new javax.swing.JFrame(), true,this.jLCodigo.getText(),nombre);
        dialog.setVisible(true);
    }//GEN-LAST:event_jBVerConsultasActionPerformed

    private void jCDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDepartamentoActionPerformed
        if(flag1 == 1) {
            flag2 = 0;
            this.ponerProvincias(this.obtenerCodigo(departamentos, this.jCDepartamento.getSelectedItem().toString()));
            this.ponerDistritos(this.obtenerCodigo(provincias, this.jCProvincia.getSelectedItem().toString()));
            flag2 = 1;
        }   
            

    }//GEN-LAST:event_jCDepartamentoActionPerformed

    private void jCProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProvinciaActionPerformed
        if(flag2 == 1)
            this.ponerDistritos(this.obtenerCodigo(provincias, this.jCProvincia.getSelectedItem().toString()));
    }//GEN-LAST:event_jCProvinciaActionPerformed

    private void jCEstCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCEstCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCEstCivilActionPerformed

    private void jbDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbDateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDateKeyPressed

    private void jbDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDateMouseClicked

    private void jbDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbDateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDateMousePressed

    private void jbDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jbDateAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDateAncestorAdded

    private void jbDateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jbDateInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDateInputMethodTextChanged

    private void jbDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbDatePropertyChange
        if(flag3 == 1)
            this.jDate.setText(toDate(this.jbDate.getDate().toString()));
        flag3=1;
    }//GEN-LAST:event_jbDatePropertyChange

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
    private javax.swing.JTextField jDate;
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
    private javax.swing.JTextField jSEdad;
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
    private javax.swing.JTextField jTGrpSanguineo1;
    private javax.swing.JTextField jTMovil;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTabbedPane jTabClinico;
    private javax.swing.JTextField jTdni;
    private com.toedter.calendar.JDateChooser jbDate;
    // End of variables declaration//GEN-END:variables
}
