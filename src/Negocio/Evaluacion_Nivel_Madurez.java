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
public class Evaluacion_Nivel_Madurez {
public  int id;
   public  String nombre_evaluacion_nivel_madurez;
   public  String descripcion_evaluacion_nivel_madurez;
      public int Valoracion_Concluida;// {  ALCANZADO,NO_ALCANZADO}
      
      
    public Evaluacion_Nivel_Madurez(int id, String nombre_evaluacion_nivel_madurez, String descripcion_evaluacion_nivel_madurez, int Valoracion_Concluida) {
        this.id = id;
        this.nombre_evaluacion_nivel_madurez = nombre_evaluacion_nivel_madurez;
        this.descripcion_evaluacion_nivel_madurez = descripcion_evaluacion_nivel_madurez;
        this.Valoracion_Concluida = Valoracion_Concluida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_evaluacion_nivel_madurez() {
        return nombre_evaluacion_nivel_madurez;
    }

    public void setNombre_evaluacion_nivel_madurez(String nombre_evaluacion_nivel_madurez) {
        this.nombre_evaluacion_nivel_madurez = nombre_evaluacion_nivel_madurez;
    }

    public String getDescripcion_evaluacion_nivel_madurez() {
        return descripcion_evaluacion_nivel_madurez;
    }

    public void setDescripcion_evaluacion_nivel_madurez(String descripcion_evaluacion_nivel_madurez) {
        this.descripcion_evaluacion_nivel_madurez = descripcion_evaluacion_nivel_madurez;
    }

    public int getValoracion_Concluida() {
        return Valoracion_Concluida;
    }

    public void setValoracion_Concluida(int Valoracion_Concluida) {
        this.Valoracion_Concluida = Valoracion_Concluida;
    }
     
}
