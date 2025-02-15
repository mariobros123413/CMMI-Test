/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Negocio.Observacion;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Frm_Observacion extends javax.swing.JFrame {

    public ArrayList<Observacion> listaObservaciones = new ArrayList<Observacion>();

    /**
     * Creates new form Frm_Observacion
     */
    public Frm_Observacion(ArrayList<Observacion> listaObservacion) {
        listaObservaciones = listaObservacion;
        System.out.println("lista:" + listaObservacion.size());

        initComponents();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable_observaciones.getModel();
            cargarTablaObservaciones(listaObservaciones, modelo);

        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_observaciones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_tipo_observacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_impacto_observacion = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_observacion = new javax.swing.JTextArea();
        jButton_agregar_observacion = new javax.swing.JButton();
        jButton_modificar_observacion = new javax.swing.JButton();
        jButton_eliminar_observacion = new javax.swing.JButton();
        jButton_cerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_observaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO", "IMPACTO", "DESCRIPCION"
            }
        ));
        jScrollPane1.setViewportView(jTable_observaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 417, 89));

        jLabel1.setText("Tipo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jComboBox_tipo_observacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEBILIDAD", "FORTALEZA" }));
        jPanel1.add(jComboBox_tipo_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, -1));

        jLabel2.setText("Impacto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jComboBox_impacto_observacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIGNIFICATIVO", "NO SIGNIFICATIVO" }));
        jPanel1.add(jComboBox_impacto_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 140, -1));

        jTextArea_observacion.setColumns(20);
        jTextArea_observacion.setRows(5);
        jScrollPane2.setViewportView(jTextArea_observacion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 390, 80));

        jButton_agregar_observacion.setText("Agregar");
        jButton_agregar_observacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_observacionActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_agregar_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jButton_modificar_observacion.setText("Modificar");
        jPanel1.add(jButton_modificar_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jButton_eliminar_observacion.setText("Eliminar");
        jPanel1.add(jButton_eliminar_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jButton_cerrar.setText("Cerrar");
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel3.setText("Descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar_observacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_observacionActionPerformed
        int id = jTable_observaciones.getRowCount();
        int tipo = jComboBox_tipo_observacion.getSelectedIndex();
        int impacto = jComboBox_impacto_observacion.getSelectedIndex();
        String descripcion = jTextArea_observacion.getText();
        System.out.println("ID:" + id);
        Observacion observacion = new Observacion(id + 1, tipo, impacto, descripcion);
        listaObservaciones.add(observacion);
        DefaultTableModel modelo = (DefaultTableModel) jTable_observaciones.getModel();
        Vector vector = new Vector();
        vector.add(observacion.getId());
        if (observacion.getTipo() == 0) {
            vector.addElement("DEBILIDAD");
        } else {
            vector.addElement("FORTALEZA");
        }

        if (observacion.getImpacto() == 0) {
            vector.addElement("SIGNIFICATIVO");
        } else {
            vector.addElement("NO SIGNIFICATIVO");
        }
        vector.add(observacion.getDescripcion());
        modelo.addRow(vector);
        jTextArea_observacion.setText("");
    }//GEN-LAST:event_jButton_agregar_observacionActionPerformed

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    public static void cargarTablaObservaciones(ArrayList<Observacion> lista, DefaultTableModel modelo) {

        for (int i = 0; i < lista.size(); i++) {
            Observacion o = lista.get(i);
            Vector vector = new Vector();
            vector.addElement(o.getId());
            if (o.getTipo() == 0) {
                vector.addElement("DEBILIDAD");
            } else {
                vector.addElement("FORTALEZA");
            }

            if (o.getImpacto() == 0) {
                vector.addElement("SIGNIFICATIVO");
            } else {
                vector.addElement("NO SIGNIFICATIVO");
            }
            vector.addElement(o.getDescripcion());
            System.out.println("id:" + o.getId());
            System.out.println("tipo:" + o.getTipo());
            System.out.println("impacto:" + o.getImpacto());
            System.out.println("desc:" + o.getDescripcion());
            modelo.addRow(vector);
        }
    }

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Frm_Observacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Observacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Observacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Observacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Observacion(listaObservaciones).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton_agregar_observacion;
    public static javax.swing.JButton jButton_cerrar;
    public static javax.swing.JButton jButton_eliminar_observacion;
    public static javax.swing.JButton jButton_modificar_observacion;
    public static javax.swing.JComboBox<String> jComboBox_impacto_observacion;
    public static javax.swing.JComboBox<String> jComboBox_tipo_observacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_observaciones;
    public static javax.swing.JTextArea jTextArea_observacion;
    // End of variables declaration//GEN-END:variables
}
