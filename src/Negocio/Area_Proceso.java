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
public class Area_Proceso  implements Serializable{
    public  int id;
     public  int id_evaluacion_area_proceso;
    public  String nombre_area_proceso;
    public  String descripcion_area_proceso;
    public  ArrayList<Objetivo> listaObjetivosEspecificos;
     public  ArrayList<Objetivo> listaObjetivosGenericos;

    public Area_Proceso(int id, int id_evaluacion_area_proceso, String nombre_area_proceso, String descripcion_area_proceso, ArrayList<Objetivo> listaObjetivosEspecificos, ArrayList<Objetivo> listaObjetivosGenericos) {
        this.id = id;
        this.id_evaluacion_area_proceso = id_evaluacion_area_proceso;
        this.nombre_area_proceso = nombre_area_proceso;
        this.descripcion_area_proceso = descripcion_area_proceso;
        this.listaObjetivosEspecificos = listaObjetivosEspecificos;
        this.listaObjetivosGenericos = listaObjetivosGenericos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_evaluacion_area_proceso() {
        return id_evaluacion_area_proceso;
    }

    public void setId_evaluacion_area_proceso(int id_evaluacion_area_proceso) {
        this.id_evaluacion_area_proceso = id_evaluacion_area_proceso;
    }

    public String getNombre_area_proceso() {
        return nombre_area_proceso;
    }

    public void setNombre_area_proceso(String nombre_area_proceso) {
        this.nombre_area_proceso = nombre_area_proceso;
    }

    public String getDescripcion_area_proceso() {
        return descripcion_area_proceso;
    }

    public void setDescripcion_area_proceso(String descripcion_area_proceso) {
        this.descripcion_area_proceso = descripcion_area_proceso;
    }

    public ArrayList<Objetivo> getListaObjetivosEspecificos() {
        return listaObjetivosEspecificos;
    }

    public void setListaObjetivosEspecificos(ArrayList<Objetivo> listaObjetivosEspecificos) {
        this.listaObjetivosEspecificos = listaObjetivosEspecificos;
    }

    public ArrayList<Objetivo> getListaObjetivosGenericos() {
        return listaObjetivosGenericos;
    }

    public void setListaObjetivosGenericos(ArrayList<Objetivo> listaObjetivosGenericos) {
        this.listaObjetivosGenericos = listaObjetivosGenericos;
    }

}
