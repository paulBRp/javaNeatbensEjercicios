/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls3clasesyobjetos;

/**
 *
 * @author paul
 */
public class cls3ClasesyObjetos {
   public static void main(String[]args)
   {
   futbolista nuevofutbolista=new futbolista();
  
   String nombref= nuevofutbolista.getNombre();
   
   System.out.println("El nombre del futbolista es "+ nombref);
   String nuevonombre="Juan"; 
   nuevofutbolista.setNombre(nuevonombre);
   
    System.out.println("El nombre del furbolista es " + nuevonombre);
    System.out.println("El nombre del futbolista por dos "+ nuevofutbolista.multiplicador2());
    
    String nombre="jose";
    String apellido="jimenes";
    String CI="000054";
    String Posicion="delantero";
    double valor=8.0;
    
    futbolista futbolista2=new futbolista(nombre,apellido,CI,Posicion,valor);
    System.out.println("datos futbolista2 "+futbolista2.getNombre()+futbolista2.getApellido()+futbolista2.getCI()+futbolista2.getPosicion()+futbolista2.getValor());
   
    
   }    
}
 