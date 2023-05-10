/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prn215_grupo_4_1;

import funciones.funciones_estudiante;
import Clases.Colegio.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class PnlEstudiante extends javax.swing.JPanel {

    Estudiante controlador_estudiante = new Estudiante();
    funciones_estudiante funciones = new funciones_estudiante();
    
    /**
     * Creates new form pnlEstudiante2
     */
    public PnlEstudiante() {
        initComponents();
        mostrarEstudiantes();
        //Se llenan los comboBoxes con los datos de las otras tablas - llaves foraneas
        cmbPersona.setModel(funciones.llenarPersonas());
        //cmbPersona.setSelectedIndex(-1);
        cmbGrado.setModel(funciones.llenarGrado());
        //cmbGrado.setSelectedIndex(-1);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);  
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCorreo.setEnabled(false);
        tbEstudiante.getTableHeader().setOpaque(false);
        tbEstudiante.getTableHeader().setBackground(new Color(183, 35, 95));
        tbEstudiante.getTableHeader().setForeground(Color.WHITE);
        tbEstudiante.getTableHeader().setFont(new Font ("Dialog", Font.BOLD, 15));
        tbEstudiante.setFont(new Font ("Dialog", Font.PLAIN, 12));
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbEstudiante = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtEncargado = new javax.swing.JTextField();
        lblApellidosEstudiante = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblDireccionEstudiante = new javax.swing.JLabel();
        lblEncargado = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTelefonoEstudiante = new javax.swing.JLabel();
        cmbGrado = new javax.swing.JComboBox<>();
        cmbPersona = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JFormattedTextField();
        lblCodGrado = new javax.swing.JLabel();
        lblCodigoEstudiante = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblCorreoEstu = new javax.swing.JLabel();
        lblNombresEstudiante = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tbEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Nombres", "Apellidos", "Telefono", "Direccion", "Correo", "Encargado", "IdGrado", "Grado", "Fecha"
            }
        ));
        tbEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEstudianteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEstudiante);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        lblApellidosEstudiante.setText("Apellido:");

        lblDireccionEstudiante.setText("Dirección:");

        lblEncargado.setText("Encargado:");

        lblTelefonoEstudiante.setText("Telefono:");

        cmbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPersonaActionPerformed(evt);
            }
        });

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCodGrado.setText("Grado:");

        lblCodigoEstudiante.setText("Nombre de persona:");

        lblCorreoEstu.setText("Correo Electronico:");

        lblNombresEstudiante.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCorreoEstu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCodigoEstudiante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTelefonoEstudiante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNombresEstudiante)
                                        .addGap(10, 10, 10)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDireccionEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEncargado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblApellidosEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lblCodGrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoEstudiante)
                    .addComponent(cmbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefonoEstudiante)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNombresEstudiante)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblApellidosEstudiante)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccionEstudiante)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCorreoEstu)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEncargado)
                        .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodGrado)
                    .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(255, 196, 0));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 122));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 196, 0));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 122));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 196, 0));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 122));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPersonaActionPerformed
        //Al momento de cambiar la persona del combobox
        ChangeValue();        
    }//GEN-LAST:event_cmbPersonaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarEstudiante();
        mostrarEstudiantes();
        limpiarCampos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarEstudiante();
        mostrarEstudiantes();
        limpiarCampos();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnAgregar.setEnabled(true);
        cmbPersona.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarEstudiante();
        mostrarEstudiantes();
        limpiarCampos();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnAgregar.setEnabled(true);
        cmbPersona.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEstudianteMouseClicked
        
        btnAgregar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        cmbPersona.setEnabled(false);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Conexion con = new Conexion();
            Connection conn = con.conectar();
            
            int fila = tbEstudiante.getSelectedRow();
            String codigoEstudiante = tbEstudiante.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("SELECT estudiantes.idEstudiante, personas.nombres, personas.apellidos, grados.idGrado, grados.grado, estudiantes.estadoAprobacion, personas.telefono, personas.direccion, personas.correoElectronico, personas.fechaRegistro, estudiantes.nombreEncargado\n" +
                                        "FROM estudiante estudiantes\n" +
                                        "INNER JOIN persona personas ON personas.idPersona = estudiantes.idEstudiante\n" +
                                        "INNER JOIN grado grados ON grados.idGrado = estudiantes.idGrado\n" +
                                        "WHERE estudiantes.idEstudiante = ?" +
                                        "GROUP BY estudiantes.idEstudiante;");
            ps.setString(1, codigoEstudiante);
            rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                txtNombre.setText(rs.getString("nombres"));
                txtApellido.setText(rs.getString("apellidos"));
                txtTelefono.setText(rs.getString("telefono"));
                txtDireccion.setText(rs.getString("direccion"));
                txtCorreo.setText(rs.getString("correoElectronico"));
                txtEncargado.setText(rs.getString("nombreEncargado"));
                cmbGrado.setSelectedItem(rs.getString("grado"));
                
            }
        } 
        catch (Exception e) 
        {
              JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbEstudianteMouseClicked

    /* Creacion de las diferentes funciones para mandar los datos capturados de los textboxes al controlador y ser mandados a las funciones SQL */
    void mostrarEstudiantes()
    {
          
        
        try 
        {
            DefaultTableModel modelo = new DefaultTableModel();
            tbEstudiante.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.conectar();
            
            String sql = "SELECT estudiantes.idEstudiante, personas.nombres, personas.apellidos, grados.idGrado, grados.grado, estudiantes.estadoAprobacion, personas.telefono, personas.direccion, personas.correoElectronico, personas.fechaRegistro, estudiantes.nombreEncargado\n" +
                        "FROM estudiante estudiantes\n" +
                        "INNER JOIN persona personas ON personas.idPersona = estudiantes.idEstudiante\n" +
                        "INNER JOIN grado grados ON grados.idGrado = estudiantes.idGrado\n" +
                        "GROUP BY estudiantes.idEstudiante;"; 
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Codigo Estudiante");
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Codigo Grado");
            modelo.addColumn("Grado");
            modelo.addColumn("Estado Aprobacion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Direccion");
            modelo.addColumn("Correo Electronico");
            modelo.addColumn("Fecha Registro");
            modelo.addColumn("Nombre Encargado");
            while (rs.next()) 
            {
                Object[] filas = new Object[cantidadColumnas];
                
                for (int i = 0; i < cantidadColumnas; i++) 
                {
                    filas[i] = rs.getObject(i + 1);
                }
                
                modelo.addRow(filas);
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
        }       
        
        tbEstudiante.getColumnModel().getColumn(0).setMinWidth(0);
        tbEstudiante.getColumnModel().getColumn(0).setMaxWidth(0);
        tbEstudiante.getColumnModel().getColumn(3).setMinWidth(0);
        tbEstudiante.getColumnModel().getColumn(3).setMaxWidth(0);
        
    }
    
    private void agregarEstudiante()
    {
        
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty()
           || txtDireccion.getText().isEmpty() || txtEncargado.getText().isEmpty() || txtCorreo.getText().isEmpty()
           || cmbPersona.getSelectedIndex() == -1 || cmbGrado.getSelectedIndex() == -1) 
        {
            JOptionPane.showMessageDialog(this, "No dejar campos vacios", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            // Obtener el id del grado seleccionado en el comboBox
            int idPersona = funciones.getIdPersona(cmbPersona.getItemAt(cmbPersona.getSelectedIndex()));
            controlador_estudiante.setCodigoEstudiante(idPersona);
            String idGrado = funciones.getIdGrado(cmbGrado.getSelectedItem().toString());
            controlador_estudiante.setIdGrado(idGrado);
            
            //System.out.print(idPersona);
            //System.out.print(idGrado);

            controlador_estudiante.setNombres(txtNombre.getText());
            controlador_estudiante.setApellidos(txtApellido.getText());
            controlador_estudiante.setTelefono(txtTelefono.getText());
            controlador_estudiante.setDireccion(txtDireccion.getText());
            controlador_estudiante.setNombreEncargado(txtEncargado.getText());
            controlador_estudiante.setCorreoElectronico(txtCorreo.getText());
            funciones.agregarEstudiante(controlador_estudiante);
            //Se actualizan la lista de personas que no han sido asignadas como estudiante o docente
            cmbPersona.setModel(funciones.llenarPersonas());
            
        }
        
    }
    
    private void actualizarEstudiante()
    {
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty()
           || txtDireccion.getText().isEmpty() || txtEncargado.getText().isEmpty() || txtCorreo.getText().isEmpty()
           || cmbGrado.getSelectedIndex() == -1) 
        {
            JOptionPane.showMessageDialog(this, "No dejar campos vacios", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            int fila = tbEstudiante.getSelectedRow();
            int idEstudiante = Integer.parseInt(tbEstudiante.getValueAt(fila, 0).toString());
            controlador_estudiante.setCodigoEstudiante(idEstudiante);
            String idGrado = funciones.getIdGrado(cmbGrado.getSelectedItem().toString());
            controlador_estudiante.setIdGrado(idGrado);
            
            //System.out.print(idPersona);
            //System.out.print(idGrado);

            controlador_estudiante.setNombres(txtNombre.getText());
            controlador_estudiante.setApellidos(txtApellido.getText());
            controlador_estudiante.setTelefono(txtTelefono.getText());
            controlador_estudiante.setDireccion(txtDireccion.getText());
            controlador_estudiante.setNombreEncargado(txtEncargado.getText());
            controlador_estudiante.setCorreoElectronico(txtCorreo.getText());
            funciones.actualizarEstudiante(controlador_estudiante);
        }
    }
    
    private void eliminarEstudiante()
    {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro que quieres eliminar este estudiante?", "Eliminar registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) 
        {
            int fila = tbEstudiante.getSelectedRow();
            int idEstudiante = Integer.parseInt(tbEstudiante.getValueAt(fila, 0).toString());
            controlador_estudiante.setCodigoEstudiante(idEstudiante);
            funciones.eliminarEstudiante(controlador_estudiante);
            
            //Se actualizan la lista de personas que no han sido asignadas como estudiante o docente
            cmbPersona.setModel(funciones.llenarPersonas());
        }
    }
    
    private void limpiarCampos()
    {
        
        //cmbPersona.setSelectedIndex(-1);
        //.setSelectedIndex(-1);     
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtEncargado.setText("");
        
    }
    //Método que al momento de seleccionar la persona en el comboBox los txtboxes se llenarán con la información que este contiene
    private void ChangeValue()
    {
                
        Conexion con = new Conexion();
        try {
           String sql = "SELECT * FROM persona WHERE CONCAT(nombres,' ',apellidos) LIKE '" + cmbPersona.getSelectedItem().toString() + "'";
           PreparedStatement ps = con.conectar().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           if (rs.next()) {
                txtNombre.setText(rs.getString("nombres"));
                txtApellido.setText(rs.getString("apellidos"));  
                txtTelefono.setText(rs.getString("telefono"));
                txtDireccion.setText(rs.getString("direccion"));
                txtCorreo.setText(rs.getString("correoElectronico"));
                
           }
           
           con.conectar().close();
       } catch (Exception e) 
       {
           System.out.println(e.toString());
       }
       finally
        {
            try {
                con.conectar().close();                
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
   }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbGrado;
    private javax.swing.JComboBox<String> cmbPersona;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidosEstudiante;
    private javax.swing.JLabel lblCodGrado;
    private javax.swing.JLabel lblCodigoEstudiante;
    private javax.swing.JLabel lblCorreoEstu;
    private javax.swing.JLabel lblDireccionEstudiante;
    private javax.swing.JLabel lblEncargado;
    private javax.swing.JLabel lblNombresEstudiante;
    private javax.swing.JLabel lblTelefonoEstudiante;
    private javax.swing.JTable tbEstudiante;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
