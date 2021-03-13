/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls2variables;

/**
 *
 * @author paul
 */
public class Variables {
    public static void main (String[] args)
    {
    
   double fuerza;
   double r=146600000;
   double m1=5.97e24;
   double m2=1.98e30;
   final double GRAVITACIONAL=63.67e-11;
   
   fuerza=(GRAVITACIONAL*m1*m2)/r*r;
    System.out.println("La fuerzade que atrae el sol a la tierra es " +fuerza+ "N" );
    
    }
    
}
