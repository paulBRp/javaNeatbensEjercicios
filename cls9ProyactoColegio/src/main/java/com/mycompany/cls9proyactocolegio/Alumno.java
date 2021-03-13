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
public class Alumno extends Persona{
   private String curso;
   private double notamedia;

   
    public Alumno(){
    
    }
    public Alumno(String curso,double notamedia,String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.curso=curso;
        this.notamedia=notamedia;
    }

   public String getCurso(){
       return curso;
   }
   
   public double getNotamedia(){
       return notamedia;
   }
    
   public void setCurso(String curso){
       this.curso=curso;
   }
   
   public void setNotamedia(double notamedia){
       this.notamedia=notamedia;       
   }
   
   public void imprimeAlumno(){
       super.imprime();
       System.out.print("Curso: "+this.getCurso()+"Nota media: "+this.getNotamedia());
       
   }
}
