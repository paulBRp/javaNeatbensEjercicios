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
public class Aula {
    private Alumno[] alumnos;
    private Profesor profesor;
    private String idaula;
    
    public Aula(){
    
    }
    public Aula(Alumno[] alumnos, Profesor profesor, String idaula ){
        this.alumnos=alumnos;
        this.profesor=profesor;
        this.idaula=idaula;
    }
    
    public Alumno[] getAlumno(){
        return alumnos;
    }
    public Profesor getProfesor(){
        return profesor;
    }
    public String getIdaula(){
        return idaula;
    }
    
    public void setAlumno(Alumno[] alumnos){
        this.alumnos=alumnos;        
    }
    public void setProfesor(Profesor profesor){
        this.profesor=profesor;
    }
    public void setIdaula(String idaula){
        this.idaula=idaula;
    }
    public double getNotamediaAula(){
       double sumatotal=0.0;
        
        for(int i=0;i<this.getAlumno().length;i++){
       //conversion descendente
            if(alumnos[i] instanceof Delegado){

                Delegado d1=(Delegado)alumnos[i];
                sumatotal=sumatotal+(0.1*d1.getValoracion());
                sumatotal=sumatotal+alumnos[i].getNotamedia();                                   
            }
            else{
               sumatotal=sumatotal+alumnos[i].getNotamedia();                
            }
        }
        return sumatotal/alumnos.length;
        
    }
    
    public void imprimeListadoAlumno(){
        System.out.println("-------------------"+this.getIdaula()+"--------------");
       for(int i=0;i<alumnos.length;i++){
           alumnos[i].imprimeAlumno();
           
       }
        
        System.out.println("----------------------------------------------------");
    }
    
    public Alumno getMejor(){
        Alumno mejor=new Alumno();
        double mejornota=0.0;
        for(int i=0;i<alumnos.length;i++)
        {
            if(alumnos[i].getNotamedia()>mejornota){
                mejornota=alumnos[i].getNotamedia();
                mejor=alumnos[i];
            }
        }
        return mejor;
    }
}
