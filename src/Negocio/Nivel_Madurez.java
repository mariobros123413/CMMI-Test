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
public class Nivel_Madurez implements Serializable{
     public int id;
        public int id_evaluacion_nivel_madurez ;
    public  String nombre_nivel_madurez;
    public  String descripcion_nivel_madurez;
    public ArrayList<Area_Proceso> area_proceso;

    public Nivel_Madurez(int id, int id_evaluacion_nivel_madurez, String nombre_nivel_madurez,String descripcion_nivel_madurez, ArrayList<Area_Proceso> area_proceso) {
        this.id = id;
        this.id_evaluacion_nivel_madurez = id_evaluacion_nivel_madurez;
        this.nombre_nivel_madurez = nombre_nivel_madurez;
         this.descripcion_nivel_madurez = descripcion_nivel_madurez;
        this.area_proceso = area_proceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_evaluacion_nivel_madurez() {
        return id_evaluacion_nivel_madurez;
    }

    public void setId_evaluacion_nivel_madurez(int id_evaluacion_nivel_madurez) {
        this.id_evaluacion_nivel_madurez = id_evaluacion_nivel_madurez;
    }

    public String getNombre_nivel_madurez() {
        return nombre_nivel_madurez;
    }

    public void setNombre_nivel_madurez(String nombre_nivel_madurez) {
        this.nombre_nivel_madurez = nombre_nivel_madurez;
    }

     public String getDescripcion_nivel_madurez() {
        return descripcion_nivel_madurez;
    }

    public void setDescripcion_nivel_madurez(String descripcion_nivel_madurez) {
        this.descripcion_nivel_madurez = descripcion_nivel_madurez;
    }
    
    public ArrayList<Area_Proceso> getArea_proceso() {
        return area_proceso;
    }

    public void setArea_proceso(ArrayList<Area_Proceso> area_proceso) {
        this.area_proceso = area_proceso;
    }
  
}