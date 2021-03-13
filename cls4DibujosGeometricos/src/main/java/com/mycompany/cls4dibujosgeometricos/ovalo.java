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
public class ovalo {
    int x;
    int y;
    int ancho;
    int alto;

public ovalo(){

}

public ovalo(int x, int y, int ancho ,int alto){
this.x=x;
this.y=y;
this.ancho=ancho;
this.alto=alto;
}
    


public int getX(){
    return x;
}
public int getY(){
    return y;
}    
public int getAncho(){
    return ancho;
}
public int getAlto(){
    return alto;
}


public void setX(int x){
    this.x=x;
}
public void setY(int y){
    this.y=y;
}
public void setAncho(int ancho){
    this.ancho=ancho;
}
public void setAlto(int alto){
    this.alto=alto;
}


}
