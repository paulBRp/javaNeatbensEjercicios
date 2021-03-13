/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls5clasesii;

/**
 *
 * @author paul
 */
public class Plataforma {
    private String nombre;
    private double dineropropio;
    private static double dinerototal=0.0;
    
    
    public Plataforma(String nombre){
    this.nombre=nombre;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public double getDineropropio(){
        return dineropropio;
    }
    
    public static double getDinerototal(){
        return dinerototal; 
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;    
    }
    
    public void setDineropropio(double dineropropio){
        this.dineropropio=dineropropio;               
    }

    public static void setDinerototal(double dinerototal) {
        Plataforma.dinerototal = dinerototal;
    }
    
    public void asignarDinero(double cantidaddinero){
        dinerototal=dinerototal-cantidaddinero;
        this.dineropropio=cantidaddinero;   
    }
    
    public static void recogerDinero(double dinero){
       Plataforma.dinerototal+=dinero;
    }
    
    public static void imprimeDineroTotal(){
        System.out.println("El dinero total del que se dispone es de "+dinerototal);
    }
                
}
