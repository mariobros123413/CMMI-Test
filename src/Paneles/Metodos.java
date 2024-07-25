/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Metodos {
      public static void cambiarPanel(JPanel container, JPanel content) {
        try {
            container.removeAll();
            container.revalidate();
            container.repaint();

            container.add(content);
            container.revalidate();
            container.repaint();
            System.out.println("cambiar");
        } catch (Exception e) {
            System.out.println(" error cambiar");
        }
    }
}
