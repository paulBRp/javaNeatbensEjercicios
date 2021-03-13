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
public class Colegio {
    private Aula[] aula;
    Director director;
    String nombre;

    
    public Colegio(){
    }
    
    public Colegio( Aula[] aula, Director director, String nombre){
    this.aula=aula;
    this.director=director;
    this.nombre=nombre;
    
    }
    
    public Aula[] getAula(){
    return aula;
   
    }
    public String getNombre(){
        return nombre;
    }
    public Director getDirector(){
        return director;
    }
    
    public void setAula(Aula[] aula){
        this.aula=aula;        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDirector(Director sirector){
        this.director=director;    
    }
    
    public double getNotaMedia(){
        double sumatotal=0.0;
        for(int i=0;i<aula.length;i++){
        sumatotal=sumatotal+aula[i].getNotamediaAula();
        
    }
     return (sumatotal/aula.length)*(this.getDirector().getValoracion()*0.3);   
    }
    public Alumno getMejorAlumnoColegio(){
        for(int i=0;i<aula.length;i++){
        
        }
    }
    
}
