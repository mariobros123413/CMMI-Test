/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Instancia implements Serializable{
public int id;
     public int id_evaluacion_practica;
    public String nombre_instancia;
    public  ArrayList<Observacion> listaObservaciones;
    
    
    
    public Instancia(int id, int id_evaluacion_practica, String nombre_instancia, ArrayList<Observacion> listaObservaciones) {
        this.id = id;
        this.id_evaluacion_practica = id_evaluacion_practica;
        this.nombre_instancia = nombre_instancia;
        this.listaObservaciones = listaObservaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_evaluacion_practica() {
        return id_evaluacion_practica;
    }

    public void setId_evaluacion_practica(int id_evaluacion_practica) {
        this.id_evaluacion_practica = id_evaluacion_practica;
    }

    public String getNombre_instancia() {
        return nombre_instancia;
    }

    public void setNombre_instancia(String nombre_instancia) {
        this.nombre_instancia = nombre_instancia;
    }

    public ArrayList<Observacion> getListaObservaciones() {
        return listaObservaciones;
    }

    public void setListaObservaciones(ArrayList<Observacion> listaObservaciones) {
        this.listaObservaciones = listaObservaciones;
    }
    
    
}
