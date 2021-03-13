/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls5clases2;

/**
 *
 * @author paul
 */
public class cls5ClasesII {
    public static void main(String[] args){
             
        Usuarios u1= new Usuarios("Juan",300.0);
        Usuarios u2= new Usuarios("Luis",2.0);
        Usuarios u3= new Usuarios("Sam",50.0);
        Usuarios.imprimeNumUsuario();
        System.out.println("El usuario 2 tiene el ID  "+u2.getIdUsuario());
        Plataforma p1=new Plataforma("Save the Whales");
        Plataforma p2=new Plataforma("save sun");
        u1.donarTodoDinero();
        u3.donarTodoDinero();
        u2.donarTodoDinero();
        Plataforma.imprimeDineroTotal();
        p1.asignarDinero(100.0);
        p2.asignarDinero(2.0);
        Plataforma.imprimeDineroTotal();
    }
}
