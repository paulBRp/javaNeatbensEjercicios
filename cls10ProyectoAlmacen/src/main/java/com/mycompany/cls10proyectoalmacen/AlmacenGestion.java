/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cls10proyectoalmacen;

import java.util.ArrayList;

/**
 *
 * @author paul
 */
public class AlmacenGestion {
    Producto[] almacen;
    
    public AlmacenGestion(){
    }
    
    public AlmacenGestion(Producto[] almacen){
    this.almacen=almacen;
    }
    
    public Producto[] getAlmacen(){
        return almacen;
    }
    
    public void setAlmacen(Producto[] almacen){
        this.almacen=almacen;
    }
    
    public void OrdenarAlmacenPorValor(){
        Producto aux=new Producto();
        for(int i=0;i<this.getAlmacen().length-1;i++){
            for(int j=0;j<almacen.length-i-1;j++){
               
                if(almacen[j].getValor()>almacen[j+1].getValor()){
                    aux=almacen[j];
                    almacen[j]=almacen[j+1];
                    almacen[j+1]=aux;
                }
            }
        }
    }
    
    
     public void OrdenarAlmacenPorPeso(){
        Producto aux=new Producto();
        for(int i=0;i<this.getAlmacen().length-1;i++){
            for(int j=0;j<almacen.length-i-1;j++){
               
                if(almacen[j].getPeso()>almacen[j+1].getValor()){
                    aux=almacen[j];
                    almacen[j]=almacen[j+1];
                    almacen[j+1]=aux;
                }
            }
        }
    }
     
     public Producto BuscarProducto(String id){
         Producto p=new Producto ();
         for(int i=0;1<almacen.length-1;i++){
              if(almacen[i].getID().compareTo(id)==0){
                  p=almacen[i];
              }
          }
            return p;
     }
    public Producto BuscarProductoBinaria(String id){
      int inf=0;
        int sup=almacen.length-1;
        boolean encontrado=false;
        while((encontrado==false)&&(sup>=inf)){
            int central=(inf+sup)/2;
            if(almacen[central].getID()==id){
                encontrado=true;
                return almacen[central];  
            }
            else if(id.compareTo(almacen[central].getID())>0){
                inf=central+1;
            }
            else{
            sup=central-1;
            
            }
        }
        
        return null;
     }
    
    public void imprimeListaProductos(){
        for(int i=0;1<almacen.length-1;i++){
            almacen[i].imprime();
        }
    }
    
    public Producto[] prepararPedidoTC(int n){
        this.OrdenarAlmacenPorValor();
        ArrayList<Producto> lstock= new ArrayList<Producto>();
        int i=almacen.length-1;
        int j=0;
        while()
        
    }
    
    
}
