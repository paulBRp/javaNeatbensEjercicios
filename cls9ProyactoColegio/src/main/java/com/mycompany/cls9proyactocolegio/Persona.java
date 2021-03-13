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
abstract public class Persona {//<editor-fold defaultstate="collapsed" desc="comment">
    
    private String nombre;
    private String apellido;
    private String DNI;
    
public Persona(){

}
    public Persona(String nombre , String apellido ,String DNI  ){
        this.nombre=nombre;
        this.apellido=apellido;
        this.DNI=DNI;
    }
    
    public String getNombre(){
        return nombre;        
    }
    
    public String getApellido(){
        return apellido;   
    }
    
    public String getDNI(){
        return DNI;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public void setDNI(String DNI){
        this.DNI=DNI;
     
    }
    
    public void imprime(){
        System.out.println("Nombre: "+this.getNombre()+"Apellido: "+this.getApellido()+"DNI: "+this.getDNI());
        
}

}
