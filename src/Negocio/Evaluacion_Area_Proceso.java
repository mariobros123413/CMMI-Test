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
public class Evaluacion_Area_Proceso {
     public  int id;
     public  String nombre_evaluacion_area_proceso;
      public  String descripcion_evaluacion_area_proceso;
      public  int Fuera_De_Alcance ;
       public  int Sin_Evidencia_Objetiva ;
     public int Valoracion_Sugerida;// {  SATISFECHA,INSATISFECHA,NO_APLICABLE, SIN_PUNTAJE}
      public int Valoracion_Elegida;// {  SATISFECHA,INSATISFECHA,NO_APLICABLE, SIN_PUNTAJE}

    public Evaluacion_Area_Proceso(int id, String nombre_evaluacion_area_proceso, String descripcion_evaluacion_area_proceso, int Fuera_De_Alcance, int Sin_Evidencia_Objetiva, int Valoracion_Sugerida, int Valoracion_Elegida) {
        this.id = id;
        this.nombre_evaluacion_area_proceso = nombre_evaluacion_area_proceso;
        this.descripcion_evaluacion_area_proceso = descripcion_evaluacion_area_proceso;
        this.Fuera_De_Alcance = Fuera_De_Alcance;
        this.Sin_Evidencia_Objetiva = Sin_Evidencia_Objetiva;
        this.Valoracion_Sugerida = Valoracion_Sugerida;
        this.Valoracion_Elegida = Valoracion_Elegida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_evaluacion_area_proceso() {
        return nombre_evaluacion_area_proceso;
    }

    public void setNombre_evaluacion_area_proceso(String nombre_evaluacion_area_proceso) {
        this.nombre_evaluacion_area_proceso = nombre_evaluacion_area_proceso;
    }

    public String getDescripcion_evaluacion_area_proceso() {
        return descripcion_evaluacion_area_proceso;
    }

    public void setDescripcion_evaluacion_area_proceso(String descripcion_evaluacion_area_proceso) {
        this.descripcion_evaluacion_area_proceso = descripcion_evaluacion_area_proceso;
    }

    public int getFuera_De_Alcance() {
        return Fuera_De_Alcance;
    }

    public void setFuera_De_Alcance(int Fuera_De_Alcance) {
        this.Fuera_De_Alcance = Fuera_De_Alcance;
    }

    public int getSin_Evidencia_Objetiva() {
        return Sin_Evidencia_Objetiva;
    }

    public void setSin_Evidencia_Objetiva(int Sin_Evidencia_Objetiva) {
        this.Sin_Evidencia_Objetiva = Sin_Evidencia_Objetiva;
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
     
}
