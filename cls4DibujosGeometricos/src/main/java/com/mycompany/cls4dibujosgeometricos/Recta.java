/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls4dibujosgeometricos;

/**
 *
 * @author paul
 */
public class Recta {
    
    private Punto pint;
    private Punto pfinal;

    public Recta(){
        }
    public Recta(Punto p1,Punto p2 ){
        this.pint=p1;
        this.pfinal=p2;
        }
    
    
    public Punto getPint() {
        return pint;
    }

    public Punto getPfinal() {
        return pfinal;
    }


    
    public void setPint(Punto pint) {
        this.pint = pint;
    }

    public void setPfinal(Punto pfinal) {
        this.pfinal = pfinal;
    }
    
    
    
}
