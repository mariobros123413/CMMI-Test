/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Evaluacion_Practica {
     public  int id;
  
      public  String descripcion_evaluacion_practica;
    public int Artefactos_Directos;// {  APROPIADOS,NO_APROPIADOS,NO_SE_SABE}
    public int Artefactos_InDirectos;// {  CONFIRMAN,SUGIEREN,NO_SE_SABE}
    public int Valoracion_Sugerida;// {  COMPLETAMENTE_IMPLENETADA,AMPLIAMENTE_IMPLEMENTADA,PARCIALMENTE_IMPLEMENTADA,NO_IMPLEMENTADA}
      public  int Valoracion_Elegida;// {  COMPLETAMENTE_IMPLENETADA,AMPLIAMENTE_IMPLEMENTADA,PARCIALMENTE_IMPLEMENTADA,NO_IMPLEMENTADA}
      public  String justificacion;

      
      
   
      
      
    public Evaluacion_Practica(int id, String nombre_evaluacion_practica, String descripcion_evaluacion_practica, int Artefactos_Directos, int Artefactos_InDirectos, int Valoracion_Sugerida, int Valoracion_Elegida, String justificacion) {
        this.id = id;
        this.Artefactos_Directos = Artefactos_Directos;
        this.Artefactos_InDirectos = Artefactos_InDirectos;
        this.Valoracion_Sugerida = Valoracion_Sugerida;
        this.Valoracion_Elegida = Valoracion_Elegida;
        this.justificacion = justificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 

    public String getDescripcion_evaluacion_practica() {
        return descripcion_evaluacion_practica;
    }

    public void setDescripcion_evaluacion_practica(String descripcion_evaluacion_practica) {
        this.descripcion_evaluacion_practica = descripcion_evaluacion_practica;
    }

    public int getArtefactos_Directos() {
        return Artefactos_Directos;
    }

    public void setArtefactos_Directos(int Artefactos_Directos) {
        this.Artefactos_Directos = Artefactos_Directos;
    }

    public int getArtefactos_InDirectos() {
        return Artefactos_InDirectos;
    }

    public void setArtefactos_InDirectos(int Artefactos_InDirectos) {
        this.Artefactos_InDirectos = Artefactos_InDirectos;
    }

   

    public int getValoracion_Sugerida() {
        return Valoracion_Sugerida;
    }

    public void setValoracion_Sugerida(int Valoracion_Sugerida) {
        this.Valoracion_Sugerida = Valoracion_Sugerida;
    }

    public int getValoracion_Elegida() {
        return Valoracion_Elegida;
    }

    public void setValoracion_Elegida(int Valoracion_Elegida) {
        this.Valoracion_Elegida = Valoracion_Elegida;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
      
}