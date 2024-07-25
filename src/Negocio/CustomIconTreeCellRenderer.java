/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.awt.Component;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author Usuario
 */

  public class CustomIconTreeCellRenderer extends DefaultTreeCellRenderer {
    private URL Checked; // Icono para celdas que empiezan con ✅
    private URL Unchecked; // Icono para celdas que empiezan con x
    private URL defaul; // Icono por defecto para otras celdas
    private Icon iconChecked;
     private Icon iconUnChecked;
     private Icon iconDefaultChecked;

    public CustomIconTreeCellRenderer() {
        // Cargar los iconos desde archivos o recursos
        // Reemplazar las rutas de los archivos según sea necesario
         Checked =CustomIconTreeCellRenderer.class.getResource("/img/bien.png");
        Unchecked =CustomIconTreeCellRenderer.class.getResource("/img/mal.png");
        defaul =  CustomIconTreeCellRenderer.class.getResource("/img/blank.png");
        
           iconChecked = new ImageIcon(Checked);
            iconUnChecked = new ImageIcon(Unchecked);
             iconDefaultChecked= new ImageIcon(defaul);
        
    }

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected,
                                                  boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

        // Obtener el texto de la celda
        String text = value.toString();

        // Verificar el texto de la celda y establecer el icono correspondiente
        if (text.startsWith("✅") && selected || text.startsWith("✅")) {
            setIcon(iconChecked);
        } else if (text.startsWith("x") && selected || text.startsWith("x")) {
            setIcon(iconUnChecked);
        } else {
            setIcon(iconDefaultChecked);
        }

        return this;
    }
}
