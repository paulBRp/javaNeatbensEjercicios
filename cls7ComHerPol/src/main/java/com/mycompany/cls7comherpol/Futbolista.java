/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls7comherpol;

/**
 *
 * @author paul
 */
public class Futbolista extends Persona{
    private String posicion;
    private double valor;

    public Futbolista() {
    }
    
    
    public Futbolista(String nombre, String apellido, String DNI){
    super(nombre,apellido,DNI);
    }

    public Futbolista(String posicion, double valor) {
        this.posicion = posicion;
        this.valor = valor;
    }

       
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void imprime(){
    
        super.imprime();     
   
        System.out.println("Posicion: "+this.getPosicion()+" Valor: "+this.getValor());
   
    
    }
    
    
    
    
}
