/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls4dibujosgeometricos;

import javax.swing.JFrame;

/**
 *
 * @author paul
 */
public class DibujosGeometricos {
    
    public static void main(String[] arg){
    
        JFrame marco;
        marco = new JFrame("Nuevo dibujo");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dibujo paneldeDibujo=new dibujo();
        marco.add(paneldeDibujo);
        marco.setSize(400, 400);
        marco.setVisible(true);
    }
    
}
