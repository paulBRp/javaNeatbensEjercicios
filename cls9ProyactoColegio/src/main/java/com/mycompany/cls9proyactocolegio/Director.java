/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls9proyactocolegio;

/**
 *
 * @author paul
 */
public class Director extends Persona{
    private  double valoracion;
    
    public Director(){
    }
    
    public Director(double valoracion ,String nombre, String apellido, String DNI){
        super(nombre, apellido,DNI);
        this.valoracion=valoracion;
    }
    
    public double getValoracion(){
        return valoracion;
        
    }
    
    public void setValoracion(double valoracion){
        this.valoracion=valoracion;
    }
}
