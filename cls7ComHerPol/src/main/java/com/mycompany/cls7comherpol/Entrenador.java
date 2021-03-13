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
public class Entrenador extends Persona{
    private int duracion;

    public Entrenador() {
    }

    public Entrenador(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
}
