/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls10proyectoalmacen;

/**
 *
 * @author paul
 */
public class Producto {
   private String ID;
   private double valor;
   private double peso;
   boolean asignado;
   String clase;
   
   public Producto(){
   
   }
   public Producto(String ID, double valor, double peso, boolean asignado, String clase){
   this.ID=ID;
   this.valor=valor;
   this.peso=peso;
   this.asignado=asignado;
   this.clase=clase;
   
   }
   
   public String getID(){
       return ID;
   }
   public double getValor(){
       return valor;
   }
   public double getPeso(){
       return peso;
   }
   public boolean getAsignado(){
       return asignado;
   }
   public String getClase(){
       return clase;
   }
   
   public void setID(String ID){
       this.ID=ID;
   }
   public void setValor(double valor){
       this.valor=valor;
   }
   public void setPeso(double peso){
       this.peso=peso;
   }
   public void getAsignado(boolean asignado){
       this.asignado=asignado;
   }
   public void getClase(String clase){
       this.clase=clase;
   }
   
   public void imprime(){
       System.out.println("ID: "+this.getID()+"valor: "+this.getValor()+"clases: "+this.getClase()+"peso: "+this.getPeso()+"asignado: "+this.getAsignado());
   }
}
