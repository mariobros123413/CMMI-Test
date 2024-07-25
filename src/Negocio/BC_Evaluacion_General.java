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
public class BC_Evaluacion_General  implements  Serializable{
     public int id;
    public String nombre_organizacion;
   public int Alcance ;//{ AREA_PROCESO,OBJETIVO,PRACTICA}
public  ArrayList<Nivel_Madurez> niveles ;
public  ArrayList<Observacion> listaObservaciones ;
public  ArrayList<Evaluacion_Nivel_Madurez> listaEvaluacionesNivel ;
public  ArrayList<Evaluacion_Area_Proceso> listaEvaluacionesAreaProcesos ;
public  ArrayList<Evaluacion_Objetivo> listaEvaluacionesObjetivos ;
public  ArrayList<Evaluacion_Practica> listaEvaluacionesPracticas ;
 
public BC_Evaluacion_General() {
        this.nombre_organizacion = "";
        this.Alcance=0;
        this.niveles = new ArrayList<Nivel_Madurez>();
    }
    public BC_Evaluacion_General(int id, String nombre_organizacion, int Alcance, ArrayList<Nivel_Madurez> niveles, ArrayList<Observacion>listaObservaciones) {
        this.id = id;
        this.nombre_organizacion = nombre_organizacion;
        this.Alcance = Alcance;
        this.niveles = niveles;
         this.listaObservaciones = listaObservaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_organizacion() {
        return nombre_organizacion;
    }

    public void setNombre_organizacion(String nombre_organizacion) {
        this.nombre_organizacion = nombre_organizacion;
    }

    public int getAlcance() {
        return Alcance;
    }

    public void setAlcance(int Alcance) {
        this.Alcance = Alcance;
    }

    public ArrayList<Nivel_Madurez> getNiveles() {
        return niveles;
    }

    public void setNiveles(ArrayList<Nivel_Madurez> niveles) {
        this.niveles = niveles;
    }
    
    public ArrayList<Observacion> getListaObservaciones() {
        return listaObservaciones;
    }

    public void setListaObservaciones(ArrayList<Observacion> listaObservaciones) {
        this.listaObservaciones = listaObservaciones;
    }
    
     public ArrayList<Evaluacion_Nivel_Madurez> getListaEvaluacionNivelMadurez() {
        return listaEvaluacionesNivel;
    }

    public void setListaEvaluacionNivelMadurez(ArrayList<Evaluacion_Nivel_Madurez> listaEvaluacionesNivelMadurez) {
        this.listaEvaluacionesNivel = listaEvaluacionesNivelMadurez;
    }

    
     public ArrayList<Evaluacion_Area_Proceso> getListaEvaluacionAreaProcesos() {
        return listaEvaluacionesAreaProcesos;
    }

    public void setListaEvaluacionAreaProceso(ArrayList<Evaluacion_Area_Proceso> listaEvaluacionesAreaProcesos) {
        this.listaEvaluacionesAreaProcesos = listaEvaluacionesAreaProcesos;
    }
    
     public ArrayList<Evaluacion_Objetivo> getListaEvaluacionObjetivos() {
        return listaEvaluacionesObjetivos;
    }

    public void setListaEvaluacionesObjetivos(ArrayList<Evaluacion_Objetivo> listaEvaluacionesObjetivos) {
        this.listaEvaluacionesObjetivos = listaEvaluacionesObjetivos;
    }
    
     public ArrayList<Evaluacion_Practica> getListaEvaluacionesPracticas() {
        return listaEvaluacionesPracticas;
    }

    public void setListaEvaluacionesPracticas(ArrayList<Evaluacion_Practica> listaEvaluacionesPracticas) {
        this.listaEvaluacionesPracticas = listaEvaluacionesPracticas;
    }
}