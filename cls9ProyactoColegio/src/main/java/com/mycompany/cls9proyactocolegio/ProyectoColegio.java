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
public class ProyectoColegio {
    public static void main(String[] args){
        Alumno a1=new Alumno("tercero",9.8,"Juan","Perez","123456");
        Alumno[]almacenalumno=new Alumno[1];
        almacenalumno[0]=a1;
        
        Profesor p1=null;
        Aula aula1=new Aula(almacenalumno,p1,"101");
        aula1.imprimeListadoAlumno();
    } 
    
}
