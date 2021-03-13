/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls4dibujosgeometricos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author paul
 */
public class dibujo  extends JPanel{
    
public dibujo(Graphics g){
super.paintComponent(g);
//Dibujar fachada
Poligono p1=new Poligono();
p1.setNpuntos(4);
int[] coxs={150,220,220,150};
int[] coys={300,300,200,200};


p1.setCoordx(coxs);
p1.setCoordy(coys);
g.setColor(Color.MAGENTA);
g.drawPolygon(p1.PrepararPoligono());




}    

    dibujo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
