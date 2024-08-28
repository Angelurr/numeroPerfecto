/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomatriz;

import java.util.Random;




public class EjercicioMatriz {

    
    public static void main(String[] args) {
        
        long empiezaTiempo = System.currentTimeMillis();
        Random ale = new Random();
        int m =1000;
        int matriz[][] = new int[m][m];
        
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                matriz[i][j] = ale.nextInt(100);
                
            }  
        }
        System.out.println("MATRIZ");
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.print("|" +matriz[i][j]);
                
            } 
            System.out.println();
        }
        long finTiempo = System.currentTimeMillis();
        
        
        long duracion = finTiempo - empiezaTiempo;
        
       
        
        
        System.out.println("Tiempo de ejecucion: " + duracion + " ms");
        
     
        
        
        
    }
    
}
