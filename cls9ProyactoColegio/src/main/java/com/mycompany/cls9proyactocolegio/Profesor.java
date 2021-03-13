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
public class Profesor extends Persona{
    private String especialidad;

    
    public Profesor(){
    
    }

    
    public Profesor(String especialidad, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.especialidad=especialidad;
        }
    
 
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
}
