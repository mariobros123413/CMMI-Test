/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Negocio.CustomIconTreeCellRenderer;
import Negocio.Evaluacion_Practica;
import Negocio.Instancia;
import Negocio.Observacion;
import Negocio.Practica;
import Negocio.VariablesGoblales;
import static Paneles.Pnl_Evaluacion_Instancia.jComboBox_valoracion_elegida;
import Presentacion.Frm_Observacion;
import Presentacion.Frm_Principal;
import static Presentacion.Frm_Principal.archivo;
import Presentacion.Frm_Vinculacion_observacion;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Usuario
 */
public class Pnl_Evaluacion_Practica extends javax.swing.JPanel {
 public Practica p;
  public Frm_Vinculacion_observacion frm_Vinculacion_observacion;
  public ArrayList<Observacion> listaObservacion = null;
    public Evaluacion_Practica ep;
    /**
     * Creates new form Pnl_home
     */
    public Pnl_Evaluacion_Practica() {
       
        initComponents();
        
        
         try {
              ArrayList<Observacion> listaObservaciones = p.getListaObservaciones();
              System.out.println("ssssdddddd:"+listaObservaciones.size());
            DefaultTableModel modelo = (DefaultTableModel) jTable_observaciones.getModel();
            cargarTablaObservaciones(listaObservaciones, modelo);

        } catch (Exception e) {
        }
       
    }
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_descripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_artefactos_directos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_artefactos_indirectos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_justificaicon = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_observaciones = new javax.swing.JTable();
        jButton_vincular = new javax.swing.JButton();
        jButton_desvincular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_valoracion_sugerida = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Evaluacion  de Practica");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 8, 194, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

        jLabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_titulo.setText("Practica# : titulo");
        jPanel1.add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 320, -1));

        jTextArea_descripcion.setColumns(20);
        jTextArea_descripcion.setRows(5);
        jScrollPane1.setViewportView(jTextArea_descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 100));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Artefactos indirectos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jComboBox_artefactos_directos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "APROPIADOS", "NO APROPIADOS", "NO SE SABE" }));
        jPanel1.add(jComboBox_artefactos_directos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 140, 30));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 475, 110, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Artefactos directos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jComboBox_artefactos_indirectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONFIRMAN", "SUGIEREN", "NO SE SABE" }));
        jPanel1.add(jComboBox_artefactos_indirectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 140, 30));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Justificacion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jTextArea_justificaicon.setColumns(20);
        jTextArea_justificaicon.setRows(5);
        jScrollPane2.setViewportView(jTextArea_justificaicon);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 430, 50));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Valoracion elegida:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jTable_observaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO", "IMPACTO", "DESCRIPCION"
            }
        ));
        jScrollPane3.setViewportView(jTable_observaciones);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 360, 80));

        jButton_vincular.setText("Vincular");
        jButton_vincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vincularActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_vincular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 100, -1));

        jButton_desvincular.setText("Desvincular");
        jPanel1.add(jButton_desvincular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 100, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Observaciones");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Valoracion sugerida:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jComboBox_valoracion_sugerida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPLETAMENTE IMPLENETADA", "AMPLIAMENTE IMPLEMENTADA", "PARCIALMENTE IMPLEMENTADA", "NO IMPLEMENTADA" }));
        jPanel1.add(jComboBox_valoracion_sugerida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 350, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPLETAMENTE IMPLENETADA", "AMPLIAMENTE IMPLEMENTADA", "PARCIALMENTE IMPLEMENTADA", "NO IMPLEMENTADA" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 350, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        int canttt = p.getListaInstancia().size();
        System.out.println("cantidad = "+canttt);
        for (int i = 0; i < p.getListaInstancia().size(); i++) {
            Instancia instancia =  p.getListaInstancia().get(i);
            if(instancia.id_evaluacion_practica == 0){
                  String message = "Tiene elementos pendiente de evaluacion.";
        JOptionPane.showMessageDialog(null, message, "Toast", JOptionPane.INFORMATION_MESSAGE);
        return;
            }
        }
        int cant = Frm_Principal.archivo.getListaEvaluacionesPracticas().size();
        int AD = jComboBox_artefactos_directos.getSelectedIndex();
        int AI = jComboBox_artefactos_indirectos.getSelectedIndex();
        int VS = jComboBox_valoracion_sugerida.getSelectedIndex();
        int VE = jComboBox_valoracion_elegida.getSelectedIndex();
        String justificacion = jTextArea_justificaicon.getText();
        ep = new Evaluacion_Practica(cant + 1, jLabel_titulo.getText(), jTextArea_descripcion.getText(), AD, AI, VS, VE, justificacion);
        Frm_Principal.archivo.getListaEvaluacionesPracticas().add(ep);
        p.setId_evaluacion_practica(cant + 1);

        System.out.println("INNN:" + p.getId_evaluacion_practiva());
        System.out.println("pu:" + (VariablesGoblales.puntero - 1));
        marcarNodoRecursivamente(p.getNombre_practica());
       // DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) Frm_Principal.jTree_Arbol.getModel().getRoot();
       // DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) rootNode.getChildAt(VariablesGoblales.puntero - 1);
        //nodo.setUserObject("* " + nodo.getUserObject());
        //((DefaultTreeModel) Frm_Principal.jTree_Arbol.getModel()).nodeChanged(nodo);
         
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_vincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vincularActionPerformed
     System.out.println("nombre:" + archivo.getNombre_organizacion());
        try {
            if (archivo.getListaObservaciones() != null) {
                System.out.println("enn:" + archivo.getListaObservaciones().size());
                listaObservacion = archivo.getListaObservaciones();
            } else {
                listaObservacion = new ArrayList();
                try {
                    System.out.println("enn2:" + archivo.getListaObservaciones().size());
                } catch (Exception e) {
                }

            }
        } catch (Exception e) {
        }
        frm_Vinculacion_observacion = new Frm_Vinculacion_observacion(p,listaObservacion);
        frm_Vinculacion_observacion.setLocationRelativeTo(null);
        frm_Vinculacion_observacion.setVisible(true);
        frm_Vinculacion_observacion.setTitle("Vinculacion de Observaciones");
    }//GEN-LAST:event_jButton_vincularActionPerformed
 private void marcarNodoRecursivamente(String textoNodo) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) Frm_Principal.jTree_Arbol.getModel().getRoot();
        DefaultMutableTreeNode nodo = buscarNodo(raiz, textoNodo);
        if (nodo != null) {
            System.out.println("encontro:" + nodo.getPath());
            nodo.setUserObject("✅" + nodo.getUserObject());
           
            ((DefaultTreeModel) Frm_Principal.jTree_Arbol.getModel()).nodeChanged(nodo);
        }
    }

    private DefaultMutableTreeNode buscarNodo(DefaultMutableTreeNode raiz, String textoNodo) {
        TreePath selectedPath = new TreePath(raiz.getPath());
         boolean isSelected = Frm_Principal.jTree_Arbol.isPathSelected(selectedPath);
         System.out.println("sw="+isSelected);
        
     if ((raiz.getUserObject().toString().equals(textoNodo))  && isSelected) {
            return raiz;
        } else {
            for (int i = 0; i < raiz.getChildCount(); i++) {
                DefaultMutableTreeNode encontrado = buscarNodo((DefaultMutableTreeNode) raiz.getChildAt(i), textoNodo);
                if (encontrado != null) {
                    return encontrado;
                }
            }
            return null;
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_desvincular;
    private javax.swing.JButton jButton_vincular;
    public static javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JComboBox<String> jComboBox_artefactos_directos;
    public static javax.swing.JComboBox<String> jComboBox_artefactos_indirectos;
    public static javax.swing.JComboBox<String> jComboBox_valoracion_sugerida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable_observaciones;
    public static javax.swing.JTextArea jTextArea_descripcion;
    private javax.swing.JTextArea jTextArea_justificaicon;
    // End of variables declaration//GEN-END:variables
}
