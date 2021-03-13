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
public class Manager extends Persona{
    private int popularidad;

    public Manager() {
    }

    public Manager(int popularidad) {
        this.popularidad = popularidad;
    }

    
    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
    
    
}
