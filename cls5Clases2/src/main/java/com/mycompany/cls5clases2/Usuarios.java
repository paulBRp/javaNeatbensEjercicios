/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls5clasesii;

/**
 *
 * @author paul
 */
public class Usuarios {
    private String nombre;
    private double ddisponibles;
    private int idUsuario;
    private static int numUsuario;

    public Usuarios(String nombre, double ddisponibles) {
        this.nombre = nombre;
        this.ddisponibles = ddisponibles;
        this.idUsuario = Usuarios.getNumUsuario();
        numUsuario=numUsuario+1;
    }



    
    
    public String getNombre() {
        return nombre;
    }

    public double getDdisponibles() {
        return ddisponibles;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public static int getNumUsuario() {
        return numUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDdisponibles(double ddisponibles) {
        this.ddisponibles = ddisponibles;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public static void setNumUsuario(int numUsuario) {
        Usuarios.numUsuario = numUsuario;
    }
    
    public static void imprimeNumUsuario(){
        System.out.println("El numero de usuario es "+Usuarios.getNumUsuario());
    }
    
    public void donarTodoDinero(){
        Plataforma.recogerDinero(this.ddisponibles);
        this.setDdisponibles(0.0);
    
    }


    
}
