/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Usuario
 */
public class Evaluacion_Objetivo {
     public  int id;
    public  String nombre_evaluacion_objetivo;
      public  String descripcion_evaluacion_objetivo;
   
     public  int Valoracion_Sugerida;// {  SATISFECHA,INSATISFECHA}
      public  int Valoracion_Elegida;// {  SATISFECHA,INSATISFECHA}
       public  String justificacion_evaluacion_objetivo;

    public Evaluacion_Objetivo(int id, String nombre_evaluacion_objetivo, String descripcion_evaluacion_objetivo, int Valoracion_Sugerida, int Valoracion_Elegida, String justificacion_evaluacion_objetivo) {
        this.id = id;
        this.nombre_evaluacion_objetivo = nombre_evaluacion_objetivo;
        this.descripcion_evaluacion_objetivo = descripcion_evaluacion_objetivo;
      
        this.Valoracion_Sugerida = Valoracion_Sugerida;
        this.Valoracion_Elegida = Valoracion_Elegida;
        this.justificacion_evaluacion_objetivo = justificacion_evaluacion_objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_evaluacion_objetivo() {
        return nombre_evaluacion_objetivo;
    }

    public void setNombre_evaluacion_objetivo(String nombre_evaluacion_objetivo) {
        this.nombre_evaluacion_objetivo = nombre_evaluacion_objetivo;
    }

    public String getDescripcion_evaluacion_objetivo() {
        return descripcion_evaluacion_objetivo;
    }

    public void setDescripcion_evaluacion_objetivo(String descripcion_evaluacion_objetivo) {
        this.descripcion_evaluacion_objetivo = descripcion_evaluacion_objetivo;
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

    public String getJustificacion_evaluacion_objetivo() {
        return justificacion_evaluacion_objetivo;
    }

    public void setJustificacion_evaluacion_objetivo(String justificacion_evaluacion_objetivo) {
        this.justificacion_evaluacion_objetivo = justificacion_evaluacion_objetivo;
    }
       
}
