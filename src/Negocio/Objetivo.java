/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Objetivo implements Serializable{
    public  int id;
    public int id_evaluacion_objetivo;
    public  String nombre_objetivo;
     public  String descripcion_objetivo;
    public  ArrayList<Practica> listaPracticas;

    public Objetivo(int id, int id_evaluacion_objetivo, String nombre_objetivo,String descripcion, ArrayList<Practica> listaPracticas) {
        this.id = id;
        this.id_evaluacion_objetivo = id_evaluacion_objetivo;
        this.nombre_objetivo = nombre_objetivo;
        this.descripcion_objetivo = descripcion;
        this.listaPracticas = listaPracticas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_evaluacion_objetivo() {
        return id_evaluacion_objetivo;
    }

    public void setId_evaluacion_objetivo(int id_evaluacion_objetivo) {
        this.id_evaluacion_objetivo = id_evaluacion_objetivo;
    }

    public String getNombre_objetivo() {
        return nombre_objetivo;
    }

    public void setNombre_objetivo(String nombre_objetivo) {
        this.nombre_objetivo = nombre_objetivo;
    }
    
     public String getDescripcion_objetivo() {
        return descripcion_objetivo;
    }

    public void setDescripcion_objetivo(String descripcion_objetivo) {
        this.descripcion_objetivo = descripcion_objetivo;
    }

    public ArrayList<Practica> getListaPracticas() {
        return listaPracticas;
    }

    public void setListaPracticas(ArrayList<Practica> listaPracticas) {
        this.listaPracticas = listaPracticas;
    }
    
}
