/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prn215_grupo_4_1;

/**
 *
 * @author Diana
 */
import javax.swing.table.DefaultTableModel;
import Clases.Colegio.Estudiante;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.format.ResolverStyle;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class ffrmEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form ffrmEstudiante
     */
    public ffrmEstudiante() {
        initComponents();
    }

     //declarando para que la tabla muestre los datos agregados.
    DefaultTableModel model=new DefaultTableModel();
    protected void agregarEstudianteTabla( Estudiante estudiante){
    try{
        model = (DefaultTableModel) tbDatosEstudiante.getModel();
        Object [] fila = new Object [10];
        fila [0] = estudiante.getCodigoEstudiante();
        fila [1] = estudiante.getNombres();
        fila [2] = estudiante.getApellidos();
        fila [3] = estudiante.getTelefono();
        fila [4] = estudiante.getDireccion();
        fila [5] = estudiante.getCorreoElectronico();
        fila [6] = estudiante.getNombreEncargado();
        fila [7] = estudiante.getIdGrado();
        fila [8] = estudiante.getGrado();
        fila [9] = estudiante.getFechaRegistro();
        model.addRow(fila);
        
    } catch(Exception e){
    }
    }
       
    //Metodo para limpiar textField.
    protected void limpiar(){
      txtCodigoEstudiante.setText("");
      txtNombreEstu.setText("");
      txtApellidosEstu.setText("");
      txtTelefonoEstu.setText("");
      txtDireccionEstu.setText("");
      txtCorreo.setText("");
      txtEncargado.setText("");
      txtGrado.setText("");
      txtCodGrado.setText("");
      txtFechaRegistro.setText("");
      }
              
        // Metodo para validar numeros.   
       protected boolean validarNumeros(char letra){
       return Character.isLetter(letra);
       }
       
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigoEstudiante1 = new javax.swing.JLabel();
        lblNombresEstudiante1 = new javax.swing.JLabel();
        lblApellidosEstudiante1 = new javax.swing.JLabel();
        lblTelefonoEstudiante1 = new javax.swing.JLabel();
        lblDireccionEstudiante1 = new javax.swing.JLabel();
        lblCorreoEstu1 = new javax.swing.JLabel();
        lblEncargado1 = new javax.swing.JLabel();
        txtNombreEstu1 = new javax.swing.JTextField();
        txtApellidosEstu1 = new javax.swing.JTextField();
        txtDireccionEstu1 = new javax.swing.JTextField();
        txtCorreo1 = new javax.swing.JTextField();
        txtEncargado1 = new javax.swing.JTextField();
        txtCodigoEstudiante1 = new javax.swing.JTextField();
        txtRegistrarEstudiante1 = new javax.swing.JButton();
        txtLimpiar1 = new javax.swing.JButton();
        txtSalir1 = new javax.swing.JButton();
        lblCodigoEstudiante = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblNombresEstudiante = new javax.swing.JLabel();
        txtEncargado = new javax.swing.JTextField();
        lblApellidosEstudiante = new javax.swing.JLabel();
        txtCodigoEstudiante = new javax.swing.JTextField();
        lblTelefonoEstudiante = new javax.swing.JLabel();
        lblDireccionEstudiante = new javax.swing.JLabel();
        lblCorreoEstu = new javax.swing.JLabel();
        lblEncargado = new javax.swing.JLabel();
        txtNombreEstu = new javax.swing.JTextField();
        txtRegistrarEstudiante = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();
        txtApellidosEstu = new javax.swing.JTextField();
        txtSalir = new javax.swing.JButton();
        txtDireccionEstu = new javax.swing.JTextField();
        txtTelefonoEstu = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosEstudiante = new javax.swing.JTable();
        lblGrado = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        lblCodGrado = new javax.swing.JLabel();
        txtCodGrado = new javax.swing.JTextField();
        lblFechaRegistro = new javax.swing.JLabel();
        txtFechaRegistro = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del estudiante:"));
        jPanel1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        lblCodigoEstudiante1.setText("Código estudiante:");

        lblNombresEstudiante1.setText("Nombres:");

        lblApellidosEstudiante1.setText("Apellidos:");

        lblTelefonoEstudiante1.setText("Telefono:");

        lblDireccionEstudiante1.setText("Dirección:");

        lblCorreoEstu1.setText("Correo Electronico:");

        lblEncargado1.setText("Encargado:");

        txtRegistrarEstudiante1.setBackground(new java.awt.Color(0, 51, 204));
        txtRegistrarEstudiante1.setText("Registrar");

        txtLimpiar1.setBackground(new java.awt.Color(0, 0, 204));
        txtLimpiar1.setText("Limpiar");

        txtSalir1.setBackground(new java.awt.Color(0, 0, 204));
        txtSalir1.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigoEstudiante1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombresEstudiante1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreEstu1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblApellidosEstudiante1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidosEstu1))
                            .addComponent(lblTelefonoEstudiante1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRegistrarEstudiante1)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDireccionEstudiante1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCorreoEstu1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEncargado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEncargado1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoEstudiante1)
                            .addComponent(txtCodigoEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtRegistrarEstudiante1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresEstudiante1)
                            .addComponent(txtNombreEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtLimpiar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidosEstudiante1)
                    .addComponent(txtApellidosEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefonoEstudiante1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtSalir1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionEstudiante1)
                    .addComponent(txtDireccionEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoEstu1)
                    .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEncargado1)
                    .addComponent(txtEncargado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        lblCodigoEstudiante.setText("Código estudiante:");

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        lblNombresEstudiante.setText("Nombre:");

        txtEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEncargadoKeyTyped(evt);
            }
        });

        lblApellidosEstudiante.setText("Apellido:");

        txtCodigoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEstudianteKeyTyped(evt);
            }
        });

        lblTelefonoEstudiante.setText("Telefono:");

        lblDireccionEstudiante.setText("Dirección:");

        lblCorreoEstu.setText("Correo Electronico:");

        lblEncargado.setText("Encargado:");

        txtNombreEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEstuKeyTyped(evt);
            }
        });

        txtRegistrarEstudiante.setBackground(new java.awt.Color(0, 51, 204));
        txtRegistrarEstudiante.setText("Registrar");
        txtRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrarEstudianteActionPerformed(evt);
            }
        });

        txtLimpiar.setBackground(new java.awt.Color(0, 0, 204));
        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });

        txtApellidosEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosEstuKeyTyped(evt);
            }
        });

        txtSalir.setBackground(new java.awt.Color(0, 0, 204));
        txtSalir.setText("Salir");
        txtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalirActionPerformed(evt);
            }
        });

        txtDireccionEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionEstuKeyTyped(evt);
            }
        });

        try {
            txtTelefonoEstu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEstuKeyTyped(evt);
            }
        });

        tbDatosEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Nombres", "Apellidos", "Telefono", "Direccion", "Correo", "Encargado", "IdGrado", "Grado", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tbDatosEstudiante);

        lblGrado.setText("Grado:");

        txtGrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGradoKeyTyped(evt);
            }
        });

        lblCodGrado.setText("Codigo Grado:");

        txtCodGrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodGradoKeyTyped(evt);
            }
        });

        lblFechaRegistro.setText("Fecha de registro:");

        txtFechaRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel1.setText("Usar formato dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTelefonoEstudiante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRegistrarEstudiante)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(lblCodGrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(lblFechaRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFechaRegistro)
                                .addGap(239, 239, 239))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNombresEstudiante)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNombreEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtTelefonoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCorreoEstu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCorreo)))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblApellidosEstudiante, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDireccionEstudiante, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtApellidosEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDireccionEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEncargado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEncargado)))
                                .addGap(0, 434, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtRegistrarEstudiante))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoEstudiante)
                            .addComponent(txtCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresEstudiante)
                            .addComponent(txtNombreEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidosEstudiante)
                            .addComponent(txtApellidosEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoEstudiante)
                            .addComponent(txtTelefonoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccionEstudiante)
                            .addComponent(txtDireccionEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtSalir)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoEstu)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEncargado)
                    .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrado)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodGrado)
                    .addComponent(txtCodGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaRegistro)
                    .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
// VALIDANDO ENTRADAS EN TEXFIELD CODIGO Y TELEFONO.
    private void txtCodigoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEstudianteKeyTyped
        // TODO add your handling code here:
        //Validando para que solo permita datos numericos.
        if(validarNumeros(evt.getKeyChar())){
        //no deja que se escriba una letra o limpia la caja
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo números.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoEstudianteKeyTyped

    private void txtTelefonoEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEstuKeyTyped
        // TODO add your handling code here:
        //Validando para que solo permita datos numericos.
        if(validarNumeros(evt.getKeyChar())){
        //no deja que se escriba una letra o limpia la caja
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo números.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoEstuKeyTyped
//BOTON LIMPIAR.
    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
        
        //Invocamos la funcion limpiar.
        limpiar();
    }//GEN-LAST:event_txtLimpiarActionPerformed
//BOTON PARA SALIR DEL PROGRAMA.
    private void txtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalirActionPerformed
       
        //Funcion para salir del programa.
        dispose();
        JOptionPane.showMessageDialog(rootPane, "Feliz Dia!");
    }//GEN-LAST:event_txtSalirActionPerformed

    //VALIDACIONES EN TEXFIELDS NOMBRE, APELLIDOS, DIRECCION, CORREO Y ENCARGADO.
    private void txtNombreEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstuKeyTyped
       
        //Validando que solo permita entrada de letras.
        char validar = evt.getKeyChar();
          if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
             JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtNombreEstuKeyTyped

    private void txtApellidosEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosEstuKeyTyped
       
         //Validando que solo permita entrada de letras.
         char validar = evt.getKeyChar();
          if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
             JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtApellidosEstuKeyTyped

    private void txtDireccionEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionEstuKeyTyped
   
        //Validando que solo permita entrada de letras.
         char validar = evt.getKeyChar();
          if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
             JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtDireccionEstuKeyTyped

    private void txtEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEncargadoKeyTyped
        
        //Validando que solo permita entrada de letras.
         char validar = evt.getKeyChar();
          if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
             JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtEncargadoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
        // Validando la entrada de correo electronico.
        if(txtCorreo.getText().length()>49){
                evt.consume(); //hace que esa pulsación de tecla se rechace.
               
    }
    }
    // Metodo para validar la entrada de correo electronico.
    public boolean ValidarMail(String correo) {
        // Patron para validar el email
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat = pat.matcher(correo);
        if (mat.find()){
            return true;
        } else {
            return false;
        }
    

    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        // TODO add your handling code here:
        // Validando correo.
        if(!ValidarMail(txtCorreo.getText())){
            JOptionPane.showMessageDialog(null, "Ingresa un correo valido.", "Error", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
    }//GEN-LAST:event_txtCorreoFocusLost
    }
    private void txtRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrarEstudianteActionPerformed
        // TODO add your handling code here:
        try {
            Estudiante estudiante = new Estudiante();
            if (txtCodigoEstudiante.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setCodigoEstudiante(Integer.parseInt(txtCodigoEstudiante.getText()));
            }
             if (txtNombreEstu.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setNombres(txtNombreEstu.getText());
            }
              if (txtApellidosEstu.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setApellidos(txtApellidosEstu.getText());
            }
               if (txtTelefonoEstu.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setTelefono(txtTelefonoEstu.getText());
            }
                if (txtDireccionEstu.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setDireccion(txtDireccionEstu.getText());
            }
                 if (txtCorreo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setCorreoElectronico(txtCorreo.getText());
            }
                  if (txtEncargado.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setNombreEncargado(txtEncargado.getText());
            }
                    if (txtGrado.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setGrado(txtGrado.getText());
            }
                      if (txtCodGrado.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            estudiante.setIdGrado(Integer.parseInt(txtCodGrado.getText()));
            }
                         if (txtFechaRegistro.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No dejar el campo vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
              SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
             Date FechaDate= null;
            try{
                FechaDate= formato.parse(txtFechaRegistro.getText());
            }catch(ParseException ex){
              System.out.println(ex);
            }
            
            estudiante.setFechaRegistro(FechaDate);
            }
            agregarEstudianteTabla(estudiante);
            limpiar();
            
        } catch (Exception e){}
        
    }//GEN-LAST:event_txtRegistrarEstudianteActionPerformed

    private void txtGradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGradoKeyTyped
          //Validando que solo permita entrada de letras.
        char validar = evt.getKeyChar();
          if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
             JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtGradoKeyTyped

    private void txtCodGradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodGradoKeyTyped
         //Validar entrada numerica.
        if(validarNumeros(evt.getKeyChar())){
        //no deja que se escriba una letra o limpia la caja
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo números.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCodGradoKeyTyped
  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ffrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ffrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ffrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ffrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ffrmEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidosEstudiante;
    private javax.swing.JLabel lblApellidosEstudiante1;
    private javax.swing.JLabel lblCodGrado;
    private javax.swing.JLabel lblCodigoEstudiante;
    private javax.swing.JLabel lblCodigoEstudiante1;
    private javax.swing.JLabel lblCorreoEstu;
    private javax.swing.JLabel lblCorreoEstu1;
    private javax.swing.JLabel lblDireccionEstudiante;
    private javax.swing.JLabel lblDireccionEstudiante1;
    private javax.swing.JLabel lblEncargado;
    private javax.swing.JLabel lblEncargado1;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblNombresEstudiante;
    private javax.swing.JLabel lblNombresEstudiante1;
    private javax.swing.JLabel lblTelefonoEstudiante;
    private javax.swing.JLabel lblTelefonoEstudiante1;
    private javax.swing.JTable tbDatosEstudiante;
    private javax.swing.JTextField txtApellidosEstu;
    private javax.swing.JTextField txtApellidosEstu1;
    private javax.swing.JTextField txtCodGrado;
    private javax.swing.JTextField txtCodigoEstudiante;
    private javax.swing.JTextField txtCodigoEstudiante1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtDireccionEstu;
    private javax.swing.JTextField txtDireccionEstu1;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtEncargado1;
    private javax.swing.JFormattedTextField txtFechaRegistro;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JButton txtLimpiar1;
    private javax.swing.JTextField txtNombreEstu;
    private javax.swing.JTextField txtNombreEstu1;
    private javax.swing.JButton txtRegistrarEstudiante;
    private javax.swing.JButton txtRegistrarEstudiante1;
    private javax.swing.JButton txtSalir;
    private javax.swing.JButton txtSalir1;
    private javax.swing.JFormattedTextField txtTelefonoEstu;
    // End of variables declaration//GEN-END:variables
}
