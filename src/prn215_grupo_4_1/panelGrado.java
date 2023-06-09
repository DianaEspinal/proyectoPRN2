/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prn215_grupo_4_1;

import java.awt.Color;
import javax.swing.*;
import Clases.Colegio.*;
import funciones.*;
import java.awt.Component;
import java.awt.Font;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author diego
 */
public class panelGrado extends javax.swing.JPanel {

    /* Declaracion de variables */
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    String idGrado;
    DefaultTableModel model = new DefaultTableModel();
    // Se hace llamado de el controlador y las funciones SQL
    Grado controlador_grado = new Grado();
    funciones_grado funciones = new funciones_grado();
    Component rootPane = null;
    
    /**
     * Creates new form panelGrado
     */
    public panelGrado() {
        initComponents();
        mostrarGrados();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        tbGrado.getTableHeader().setOpaque(false);
        tbGrado.getTableHeader().setBackground(new Color(183, 35, 95));
        tbGrado.getTableHeader().setForeground(Color.WHITE);
        tbGrado.getTableHeader().setFont(new Font ("Dialog", Font.BOLD, 15));
        tbGrado.setFont(new Font ("Dialog", Font.PLAIN, 12));
    }

    /* Creacion de las diferentes funciones para mandar los datos capturados de los textboxes al controlador y ser mandados a las funciones SQL */
    void mostrarGrados()
    {
               
        try 
        {
            DefaultTableModel modelo = new DefaultTableModel();
            tbGrado.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.conectar();
            
            String sql = "SELECT * FROM grado;"; 
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Codigo Grado");
            modelo.addColumn("Nombre grado");
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
            JOptionPane.showMessageDialog(null, e);
        }       
        
    }
    
    private void agregarGrado()
    {
        
        if (txtCodigoGrado.getText().isEmpty() || txtGrado.getText().isEmpty()) 
        {
            //
            JOptionPane.showMessageDialog(this, "No dejar campos vacios", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            controlador_grado.setCodigoGrado(txtCodigoGrado.getText());
            controlador_grado.setGrado(txtGrado.getText());
            funciones.agregarGrado(controlador_grado);
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    }
    
    private void actualizarGrado()
    {
        if (txtCodigoGrado.getText().isEmpty() || txtGrado.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No dejar campos vacios", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            controlador_grado.setCodigoGrado(txtCodigoGrado.getText());
            controlador_grado.setGrado(txtGrado.getText());
            funciones.actualizarGrado(controlador_grado);
            
        }
    }
    
    private void eliminarGrado()
    {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro que quieres eliminar este grado?", "Eliminar registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) 
        {
            int fila = tbGrado.getSelectedRow();
            String idGrado = tbGrado.getValueAt(fila, 0).toString();
            controlador_grado.setCodigoGrado(idGrado);
            funciones.borrarGrado(controlador_grado);

        }
    } 
    
    private void limpiarCampos()
    {
        
        txtCodigoGrado.setText("");
        txtGrado.setText("");
        
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
        tbGrado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoGrado = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(774, 537));
        setPreferredSize(new java.awt.Dimension(774, 537));

        tbGrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbGrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGrado);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de grado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Codigo grado:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Grado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoGrado)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(255, 196, 0));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 122));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 196, 0));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 122));
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 196, 0));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 122));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    /* Eventos que se llaman a las funciones antes creadas al ser clickeados los botones y la tabla */
    
    private void tbGradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradoMouseClicked
        
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Conexion con = new Conexion();
            Connection conn = con.conectar();
            
            int fila = tbGrado.getSelectedRow();
            String codigoGrado = tbGrado.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("SELECT * FROM grado WHERE idGrado = ?");
            ps.setString(1, codigoGrado);
            rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                txtCodigoGrado.setText(rs.getString("idGrado"));
                txtGrado.setText(rs.getString("grado"));
                
            }
        } 
        catch (Exception e) 
        {
              JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_tbGradoMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarGrado();
        mostrarGrados();
        limpiarCampos();        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarGrado();
        mostrarGrados();
        limpiarCampos();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarGrado();
        mostrarGrados();
        limpiarCampos();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGrado;
    private javax.swing.JTextField txtCodigoGrado;
    private javax.swing.JTextField txtGrado;
    // End of variables declaration//GEN-END:variables
}
