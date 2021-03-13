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
public class Delegado extends Alumno{
    double valoracion;
    
    public Delegado(){
    }
    
    public Delegado(double valoracion, String curso,double notamedia,String nombre, String apellido, String DNI){
    super(curso,notamedia, nombre,apellido, DNI);
    this.valoracion=valoracion;
    
    }
    public double getValoracion(){
    return valoracion;
    }
    
    public void setValoracion(double valoracion){
        this.valoracion=valoracion;
    }
}
