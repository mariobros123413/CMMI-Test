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
public class Practica implements Serializable{
     public  int id;
      public  int id_evaluacion_practica;
       public  String nombre_practica;
        public  String descripcion_practica;
      public  ArrayList<Observacion> listaObservaciones;
       public  ArrayList<Instancia> listaInstancia;

       
        public Practica() {
        this.id = 0;
        this.id_evaluacion_practica = 0;
        this.nombre_practica = "";
        this.descripcion_practica = "";
        this.listaObservaciones = new ArrayList();
        this.listaInstancia = new ArrayList();
    }
        
    public Practica(int id, int id_evaluacion_practica,String nombre_practica,String descripcion_practica,  ArrayList<Instancia> listaInstancia,ArrayList<Observacion> listaObservaciones) {
        this.id = id;
        this.id_evaluacion_practica = id_evaluacion_practica;
        this.nombre_practica = nombre_practica;
        this.descripcion_practica = descripcion_practica;
        this.listaObservaciones = listaObservaciones;
        this.listaInstancia = listaInstancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_evaluacion_practiva() {
        return id_evaluacion_practica;
    }

    public void setId_evaluacion_practica(int id_evaluacion_practica) {
        this.id_evaluacion_practica = id_evaluacion_practica;
    }
    
    public String getNombre_practica() {
        return nombre_practica;
    }

    public void setNombre_practica(String nombre_practica) {
        this.nombre_practica = nombre_practica;
    }
    
     public String getDescripcion_practica() {
        return descripcion_practica;
    }

    public void setDescripcion_practica(String descripcion_practica) {
        this.descripcion_practica = descripcion_practica;
    }

    public ArrayList<Observacion> getListaObservaciones() {
        return listaObservaciones;
    }

    public void setListaObservaciones(ArrayList<Observacion> listaObservaciones) {
        this.listaObservaciones = listaObservaciones;
    }

    public ArrayList<Instancia> getListaInstancia() {
        return listaInstancia;
    }

    public void setListaInstancia(ArrayList<Instancia> listaInstancia) {
        this.listaInstancia = listaInstancia;
    }
    
      
}
