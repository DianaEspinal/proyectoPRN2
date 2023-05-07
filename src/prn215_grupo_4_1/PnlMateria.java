/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prn215_grupo_4_1;

/**
 *
 * @author diani
 */

import javax.swing.JOptionPane;
import Clases.Colegio.Materia;
import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
public class PnlMateria extends javax.swing.JPanel {

    /**
     * Creates new form PnlMateria
     */
    public PnlMateria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
            
     DefaultTableModel model=new DefaultTableModel();
    protected void agregarMateriaTabla( Materia materia){
    try{
        model = (DefaultTableModel) tbDatosMateria.getModel();
        Object [] fila = new Object [2];
        fila [0] = materia.getCodigoMateria();
        fila [1] = materia.getNombreMateria();
        
        model.addRow(fila);
        
    } catch(Exception e){
    }
    }
       
    //Metodo para limpiar textField.
    protected void limpiar(){
      txtCodigoMateria.setText("");
      txtNombreMateria.setText("");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombresEstudiante = new javax.swing.JLabel();
        txtCodigoMateria = new javax.swing.JTextField();
        txtNombreMateria = new javax.swing.JTextField();
        btnRegistrarMateria = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();
        txtSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosMateria = new javax.swing.JTable();
        lblCodigoEstudiante = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblNombresEstudiante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombresEstudiante.setText("Nombre:");

        txtCodigoMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNombreMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMateriaKeyTyped(evt);
            }
        });

        btnRegistrarMateria.setBackground(new java.awt.Color(255, 196, 0));
        btnRegistrarMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrarMateria.setText("Registrar");
        btnRegistrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMateriaActionPerformed(evt);
            }
        });

        txtLimpiar.setBackground(new java.awt.Color(255, 196, 0));
        txtLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });

        txtSalir.setBackground(new java.awt.Color(255, 196, 0));
        txtSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSalir.setText("Salir");
        txtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalirActionPerformed(evt);
            }
        });

        tbDatosMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idMateria", "nombre de la materia"
            }
        ));
        jScrollPane1.setViewportView(tbDatosMateria);

        lblCodigoEstudiante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodigoEstudiante.setText("Código materia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNombresEstudiante)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblCodigoEstudiante)
                                .addGap(39, 39, 39)
                                .addComponent(txtCodigoMateria)))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txtLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresEstudiante)
                            .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoEstudiante)
                            .addComponent(txtCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSalir)
                        .addGap(37, 37, 37)
                        .addComponent(btnRegistrarMateria)
                        .addGap(32, 32, 32)
                        .addComponent(txtLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMateriaKeyTyped

        //Validando que solo permita entrada de letras.
        char validar = evt.getKeyChar();
        if ((Character.isDigit(validar)) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreMateriaKeyTyped

    private void btnRegistrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMateriaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnRegistrarMateriaActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed

        //Invocamos la funcion limpiar.
        limpiar();
    }//GEN-LAST:event_txtLimpiarActionPerformed

    private void txtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalirActionPerformed

        //Funcion para salir del programa.
       Window w = SwingUtilities.getWindowAncestor(PnlMateria.this);
        JOptionPane.showMessageDialog(this, "Feliz Dia!");
    }//GEN-LAST:event_txtSalirActionPerformed

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
            java.util.logging.Logger.getLogger(PnlMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PnlMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PnlMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PnlMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMateria().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoEstudiante;
    private javax.swing.JLabel lblNombresEstudiante;
    private javax.swing.JTable tbDatosMateria;
    private javax.swing.JTextField txtCodigoMateria;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtNombreMateria;
    private javax.swing.JButton txtSalir;
    // End of variables declaration//GEN-END:variables
}
