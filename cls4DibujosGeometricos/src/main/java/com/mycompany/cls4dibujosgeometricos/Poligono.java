/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls4dibujosgeometricos;

import java.awt.Polygon;

/**
 *
 * @author paul
 */
public class Poligono {
    private int npuntos;
    private int [] coordx;
    private int[] coordy;

    
public Poligono(){

}    

public Poligono(int npuntos, int[] coordx, int[]coordy){
    this.npuntos=npuntos;
    this.coordx=coordx;
    this.coordy=coordy;
        
}

public Polygon PrepararPoligono(){
    return new Polygon(this.getCoordx(),this.getCoordy(),this.getNpuntos());
}
    
    
public int getNpuntos(){
return npuntos;
}

public int[] getCoordx(){
return coordx;
}

public int[] getCoordy(){
return coordy;
}

public void setNpuntos(int npuntos){
this.npuntos=npuntos;
}

public void setCoordx(int[] coordx){
this.coordx=coordx;
}

public void setCoordy(int[] coordy){
this.coordy=coordy;
}

}