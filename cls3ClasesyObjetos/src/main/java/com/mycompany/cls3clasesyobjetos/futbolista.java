
package com.mycompany.cls3clasesyobjetos;


public class futbolista {
    String nombre="Sam";
    String apellido;
    String CI;
    String Posicion;
    double valor;
    
    public futbolista(){
        
    }
    public futbolista (String nuevonombre, String napellido, String nCI, String nposicion, double nvalor){
        this.nombre=nuevonombre;
        this.apellido=napellido;
        this.CI=nCI;
        this.Posicion=nposicion;
        this.valor=nvalor;
        
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCI() {
        return CI;
    }

    public String getPosicion() {
        return Posicion;
    }

    public double getValor() {
        return valor;
    }
    public void setNombre(String nuevonombre){
        this.nombre=nuevonombre;
    }

    public void setApellido(String napellido) {
        this.apellido = napellido;
    }

    public void setCI(String nCI) {
        this.CI = nCI;
    }

    public void setPosicion(String nPosicion) {
        this.Posicion = nPosicion;
    }

    public void setValor(double nvalor) {
        this.valor = nvalor;
    }
    
    public double multiplicador2(){
        return valor*2;
    }
    
}
