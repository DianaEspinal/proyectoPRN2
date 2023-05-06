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
import java.awt.Window;
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
import javax.swing.SwingUtilities;


public class PnlEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form PnlEstudiante
     */
    public PnlEstudiante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
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
      
      txtNombreEstu.setText("");
      txtApellidosEstu.setText("");
      txtTelefonoEstu.setText("");
      txtDireccionEstu.setText("");
      txtCorreo.setText("");
      txtEncargado.setText("");
      txtGrado.setText("");
      txtFechaRegistro.setText("");
      }
              
        // Metodo para validar numeros.   
       protected boolean validarNumeros(char letra){
       return Character.isLetter(letra);
       }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGrado = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        lblCodGrado = new javax.swing.JLabel();
        lblFechaRegistro = new javax.swing.JLabel();
        txtFechaRegistro = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        lblDireccionEstudiante = new javax.swing.JLabel();
        lblCorreoEstu = new javax.swing.JLabel();
        lblEncargado = new javax.swing.JLabel();
        txtNombreEstu = new javax.swing.JTextField();
        btnRegistrarEstudiante = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtApellidosEstu = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        txtDireccionEstu = new javax.swing.JTextField();
        txtTelefonoEstu = new javax.swing.JFormattedTextField();
        lblCodigoEstudiante = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblNombresEstudiante = new javax.swing.JLabel();
        txtEncargado = new javax.swing.JTextField();
        lblApellidosEstudiante = new javax.swing.JLabel();
        lblTelefonoEstudiante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosEstudiante = new javax.swing.JTable();
        cbxCodigoGrado = new javax.swing.JComboBox<>();
        cbxCodigoEstudiante = new javax.swing.JComboBox<>();

        lblGrado.setText("Grado:");

        txtGrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGradoKeyTyped(evt);
            }
        });

        lblCodGrado.setText("Codigo Grado:");

        lblFechaRegistro.setText("Fecha de registro:");

        txtFechaRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel1.setText("Usar formato dd/MM/yyyy");

        lblDireccionEstudiante.setText("Dirección:");

        lblCorreoEstu.setText("Correo Electronico:");

        lblEncargado.setText("Encargado:");

        txtNombreEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEstuKeyTyped(evt);
            }
        });

        btnRegistrarEstudiante.setBackground(new java.awt.Color(0, 51, 204));
        btnRegistrarEstudiante.setText("Registrar");
        btnRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstudianteActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 204));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtApellidosEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosEstuKeyTyped(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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

        lblTelefonoEstudiante.setText("Telefono:");

        tbDatosEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Nombres", "Apellidos", "Telefono", "Direccion", "Correo", "Encargado", "IdGrado", "Grado", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tbDatosEstudiante);

        cbxCodigoGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxCodigoEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTelefonoEstudiante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 694, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRegistrarEstudiante)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblGrado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(lblCodGrado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxCodigoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(lblFechaRegistro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                .addComponent(txtEncargado)))))
                                .addGap(0, 363, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnRegistrarEstudiante))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoEstudiante)
                            .addComponent(cbxCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnLimpiar))
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
                        .addComponent(btnSalir)))
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
                    .addComponent(lblFechaRegistro)
                    .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCodigoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtGradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGradoKeyTyped
        //Validando que solo permita entrada de letras.
        char validar = evt.getKeyChar();
        if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtGradoKeyTyped

    private void txtNombreEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstuKeyTyped

        //Validando que solo permita entrada de letras.
        char validar = evt.getKeyChar();
        if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreEstuKeyTyped

    private void btnRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteActionPerformed
      

    }//GEN-LAST:event_btnRegistrarEstudianteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        //Invocamos la funcion limpiar.
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtApellidosEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosEstuKeyTyped

        //Validando que solo permita entrada de letras.
        char validar = evt.getKeyChar();
        if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtApellidosEstuKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        //Funcion para salir del programa.
       Window w = SwingUtilities.getWindowAncestor(PnlEstudiante.this);
        JOptionPane.showMessageDialog(this, "Feliz Dia!");
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtTelefonoEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEstuKeyTyped
        // TODO add your handling code here:
        //Validando para que solo permita datos numericos.
        if(validarNumeros(evt.getKeyChar())){
            //no deja que se escriba una letra o limpia la caja
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo números.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoEstuKeyTyped

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        // TODO add your handling code here:
        // Validando correo.
        if(!ValidarMail(txtCorreo.getText())){
            JOptionPane.showMessageDialog(null, "Ingresa un correo valido.", "Error", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
    }//GEN-LAST:event_txtCorreoFocusLost
    }
    
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

    private void txtEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEncargadoKeyTyped

        //Validando que solo permita entrada de letras.
        char validar = evt.getKeyChar();
        if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtEncargadoKeyTyped

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
                new PnlEstudiante().setVisible(true);
            }
        });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarEstudiante;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxCodigoEstudiante;
    private javax.swing.JComboBox<String> cbxCodigoGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidosEstudiante;
    private javax.swing.JLabel lblCodGrado;
    private javax.swing.JLabel lblCodigoEstudiante;
    private javax.swing.JLabel lblCorreoEstu;
    private javax.swing.JLabel lblDireccionEstudiante;
    private javax.swing.JLabel lblEncargado;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblNombresEstudiante;
    private javax.swing.JLabel lblTelefonoEstudiante;
    private javax.swing.JTable tbDatosEstudiante;
    private javax.swing.JTextField txtApellidosEstu;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccionEstu;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JFormattedTextField txtFechaRegistro;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtNombreEstu;
    private javax.swing.JFormattedTextField txtTelefonoEstu;
    // End of variables declaration//GEN-END:variables
}
