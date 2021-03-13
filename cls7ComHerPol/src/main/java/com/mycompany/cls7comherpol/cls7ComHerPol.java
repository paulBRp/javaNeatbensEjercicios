/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls7comherpol;

/**
 *
 * @author paul
 */
public class cls7ComHerPol {
    public static void main(String[] args){
       // Persona p1=new Persona("Juan","Martinez","1235456");
        //Futbolista f1= new Futbolista();
       //conversion asendente
       //p1=f1;
      // p1.setDNI("5555555");
      // p1.imprime();
           
       //conversion descendente
                    //Futbolista f2;
         //    if (p1 instanceof Futbolista){
           //      f2=(Futbolista)p1;
             //    f2.imprime();
       //}
       
     /*  //CONVERSION ASCENDENTE
       Futbolista f1=new Futbolista("juan","martin","123456");
       f1.setPosicion("Portero");
       f1.setValor(500);
       Persona p1;
       
       p1=f1;
       f1.imprime();
     */  
     //polimorfismo
       Persona p1=new Futbolista("L1",40);
       p1.imprime();
       
       
}
    
}
