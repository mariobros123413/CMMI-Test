/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Observacion implements Serializable{
    public int id; // Atributo numero
     public  int Tipo ; //DEBILIDAD,FORTALEZA
      public  int Impacto;  // SIGNIFICATIVO,NO_SIGNIFICATIVO
      public  String descripcion;
      
  public Observacion(int id, int Tipo, int Impacto, String descripcion) {
        this.id = id;
        this.Tipo = Tipo;
        this.Impacto = Impacto;
        this.descripcion = descripcion;
    }
  
   public Observacion() {
        this.id = 0;
        this.Tipo = 0;
        this.Impacto = 0;
        this.descripcion = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public int getImpacto() {
        return Impacto;
    }

    public void setImpacto(int Impacto) {
        this.Impacto = Impacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
   }

   

