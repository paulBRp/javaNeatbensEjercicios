/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDeAmacenamiento;

/**
 *
 * @author paul
 */
public class EstructurasDeAlmacenamiento {
    public static void main(String[] args){
       /* int[] vector1=new int[10];
        int[][] tablero=new int[8][8];
        int [] vector2={4,5,7,8,9};
        int[][]tablero2={{1,2},{1,3}};
        
    System.out.println("Dato->"+tablero2[0][0]);
        
        
         int[] vector2={3,4,7,8,4,2,1,20};
        */
       ordenacion o1=new ordenacion();
       metodoDeBusqueda b1=new metodoDeBusqueda();
       int[] a={6,5,2,8,4,9,4,7,1,5,8,45};
       
       System.out.println("El rsutlado es "+ b1.BusquedaSecNoOrd(8,a ));
       
       o1.BurbujaVreciente(a);
       for(int w=0;w<a.length;w++){
           System.out.print(a[w]+"|");
       }
       System.out.println();
      System.out.println("El rsutlado es "+ b1.BusquedaBinario(8,a ));
    }
}
