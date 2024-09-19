
package com.jmrh.ejerciciojava06;

import java.util.Random;                                                // 1 paso

/**
 *
 * Andrey Felipe Pinto Uribe         192177
 * Angel Alfredo Urrego Olivera      192179
 */
public class Tablero {                                                  // 1 paso
    
    public static final int FIL = 4;                                    // 1 paso
    public static final int COL = 4;                                    // 1 paso
    private final int[][] tablero;                                      // 1 paso
    
    public Tablero() {                                                  // 1 paso
        tablero = new int[FIL][COL];                                    // 1 paso                           
        for(int f=0;f<FIL;f++) {                                        // n + 1
            for(int c=0;c<COL;c++) {                                    // (n + 1) * n -> n**2 + n
                tablero[f][c] = 0;                                      // n**2
            }                                                           // n**2
        }                                                               // n**2   
        
        ponerDos();                                                     //8n+7
        ponerDos();                                                     //8n+7
        
               
    }                                                                   //1
    //4n**2
    
    
    private int vaciasEnFila(int f) {                                    // 1 paso 
        int n=0;                                                         // 1 paso
        for(int c=0;c<COL;c++) {                                         // n + 1
            if(tablero[f][c]==0) {                                       // n
                n++;                                                     // n
            }                                                            // n
        }                                                                // n
        return n;                                                        // 1 paso
    }                                                                    // 1 paso
    //5n+5
    
    private int vaciasEnColumna(int c) {                                // 1 paso   
        int n=0;                                                        // 1 paso
        for(int f=0;f<FIL;f++) {                                        // n + 1
            if(tablero[f][c]==0) {                                      // n
                n++;                                                    // n
            }                                                           // n
        }                                                               // n
        return n;                                                       // 1 paso
    }                                                                   // 1 paso
    //5n+5
    
    private int vacias() {                                              // 1 paso
        int n=0;                                                        // 1 paso
        for(int f=0;f<FIL;f++) {                                        // n + 1
            for(int c=0;c<COL;c++) {                                    // (n+1)n -> n**2 + n
                if(tablero[f][c]==0) {                                  // n**2
                    n++;                                                // n**2
                }                                                       // n**2
            }                                                           // n**2
        }                                                               // n**2
        return n;                                                       // 1 paso
    }                                                                   // 1 paso
    //6n**2+2n+5
    
    
    private void ponerDos() {                                           // 1 PASO
        int f;                                                          // 1 PASO
        int c;                                                          // 1 PASO
        
        Random random = new Random();                                   // 1 PASO
        
        do {                                                            // n
            f = random.nextInt(FIL);                                    // n
        }                                                               // n
         while(vaciasEnFila(f) == 0);                                   // n + 1
        
        do {                                                            // n
            c = random.nextInt(COL);                                    // n
        }                                                               // n
         while(tablero[f][c] != 0);                                     // n + 1
        
        tablero[f][c] = 2;                                              // 1 paso
        
    } 
    //8n+7                                                                  // 1 paso
    
    
    public void mostrar() {                                             // 1 paso
        for(int f=0;f<FIL;f++) {                                        // n + 1 
            dibujaLineaHorizontal();
            dibujaEspacioHorizontal();
            System.out.print("|");                                      //1
            for(int c=0;c<COL;c++) {                                    //n**2+n
                System.out.print("    ");                               //n**2                        
                if(tablero[f][c]>=1000)                                 //n**2
                    System.out.print(tablero[f][c]);                    //n**2
                else if(tablero[f][c] >= 100)                           //n**2
                    System.out.print(" "+tablero[f][c]);                //n**2
                else if(tablero[f][c] >= 10)                            //n**2
                    System.out.print(" "+tablero[f][c]+" ");            //n**2
                else if(tablero[f][c] > 0)                              //n**2
                    System.out.print("  "+tablero[f][c]+" ");           //n**2
                else if(tablero[f][c] == 0)                             //n**2
                    System.out.print("    ");                           //n**2
                System.out.print("    |");                              //n**2
            }                                                           //n**2
            System.out.print("\n");                                     //n
            dibujaEspacioHorizontal();                                  //
        }                                                               //1
        dibujaLineaHorizontal();                                        //
    }                                                                   // 1 paso  
    
    private void dibujaLineaHorizontal() {                              // 1 paso
        
        System.out.print("|");                                          // 1 paso
        for(int c=0;c<COL;c++) {                                        // n + 1
            for(int i=0;i<12;i++) {                                     // (n + 1) * n -> n**2 + n
                System.out.print("-");                                  // n**2
            }                                                           // n**2
            System.out.print("|");                                      // n
        }                                                               // n
        System.out.print("\n");                                         // 1 paso
            
        }                                                               // 1 paso
    
    private void dibujaEspacioHorizontal() {                            // 1 paso
         System.out.print("|");                                         // 1 paso
        for(int c=0;c<COL;c++) {                                        // n + 1
            for(int i=0;i<12;i++) {                                     // (n + 1) * COL -> n**2 + n
                System.out.print(" ");                                  // n **2
            }                                                           //n **2                                             
            System.out.print("|");                                      // n
        }                                                               // n
        System.out.print("\n");                                         // 1 paso
    }                                                                   // 1 paso
    
    public boolean ganador() {                                          // 1 paso
        for(int f=0;f<FIL;f++) {                                        // (n + 1)
            for(int c=0;c<COL;c++) {                                    // (n+1)*n -> n**2 + n
                if(tablero[f][c]==2048) return true;                    // n**2
            }                                                           // n**2
        }                                                               // n
        return false;                                                   // 1 paso
    }                                                                   // 1 paso
    
    public boolean finPartida() {                                       // 1 paso
        return (ganador() || vacias()==0);                              // 
    }                                                                   // 1 paso
    
    public void moverArriba() {                                         // 1 paso
        for(int c=0; c<COL; c++) {                                      // n + 1
            moverArribaColumna(c);                                      // 
        }                                                               //  
        if(!finPartida())                                               // 1 paso
            ponerDos();                                                 // 
    }                                                                   // 1 paso
    
    private void moverArribaColumna(int c) {                            // 1 paso
        colocarArriba(c);                                               // 
        sumarArriba(c);                                                 //
        colocarArriba(c);                                               //
    }                                                                   //1 paso
     
    private void colocarArriba(int c) {                                 // 1 paso
        
        if(vaciasEnColumna(c) < COL) {                                  // 1 paso
            for(int veces = 0;veces < COL-1;veces++) {                  // n + 1
                for(int f=0;f<FIL-1;f++) {                              // (n+1) * n -> n**2 + n
                    if(tablero[f][c]==0) {                              // n**2
                        tablero[f][c] = tablero[f+1][c];                // n**2
                        tablero[f+1][c] = 0;                            // n**2
                    }                                                   // n**2
                }                                                       // n**2
            }                                                           // n
        }                                                               // 1 paso
        
    }                                                                   // 1 paso
    
    
    private void sumarArriba(int c) {                                   // 1 paso
        if(vaciasEnColumna(c)<FIL-1) {                                  // 1 paso
            for(int f=0;f<FIL-1;f++) {                                  // n + 1
                if(tablero[f][c] == tablero[f+1][c]) {                  // n
                    tablero[f][c] *= 2;                                 // n
                    tablero[f+1][c] = 0;                                // n
                }                                                       // n
            }                                                           // n
        }                                                               // 1 paso
    }                                                                   // 1 paso
    
    
    
    
    
    public void moverAbajo() {                                          // 1 paso
        for(int c=0; c<COL; c++) {                                      // n + 1
            moverAbajoColumna(c);                                       // n
        }                                                               // n
        if(!finPartida())                                               // 1 paso
                ponerDos();                                             // 1 paso
    }                                                                   // 1 paso
    
    private void moverAbajoColumna(int c) {                             // 1 paso
        colocarAbajo(c);                                                // 1 paso
        sumarAbajo(c);                                                  // 1 paso
        colocarAbajo(c);                                                // 1 paso
    }                                                                   // 1 paso

    private void colocarAbajo(int c) {                                  // 1 paso
        
        if(vaciasEnColumna(c) < COL) {                                  // 1 paso
            for(int veces = 0;veces < COL-1;veces++) {                  // n + 1
                for(int f=FIL-1;f>0;f--) {                              // (n+1)*n -> n**2 + n
                    if(tablero[f][c]==0) {                              // n**2
                        tablero[f][c] = tablero[f-1][c];                // n**2
                        tablero[f-1][c] = 0;                            // n**2
                    }                                                   // n**2
                }                                                       // n**2
            }                                                           // n
        }                                                               // 1 paso

    }                                                                   // 1 paso
    
    
    private void sumarAbajo(int c) {                                    // 1 paso
        if(vaciasEnColumna(c)<FIL-1) {                                  // 1 paso
            for(int f=FIL-1;f>0;f--) {                                  // n + 1
                if(tablero[f][c] == tablero[f-1][c]) {                  // n
                    tablero[f][c] *= 2;                                 // n
                    tablero[f-1][c] = 0;                                // n
                }                                                       // n
            }                                                           // n
        }                                                               // 1 paso
    }                                                                   // 1 paso
    
    
    
    public void moverDerecha() {                                        // 1 paso
        for(int f=0; f<COL; f++) {                                      // n + 1
            moverDerechaFila(f);                                        // 
        }                                                               // n
        if(!finPartida())                                               // 1 paso
                ponerDos();                                             // 1 paso
    }                                                                   //  1 paso
    
    private void moverDerechaFila(int f) {                              // 1 paso
        colocarDerecha(f);                                              // 1 paso
        sumarDerecha(f);                                                // 1 paso
        colocarDerecha(f);                                              // 1 paso
    }                                                                   // 1 paso
    
    private void colocarDerecha(int f) {                                // 1 paso

        if(vaciasEnFila(f) < FIL) {                                     // 1 paso
            for(int veces = 0;veces < COL-1;veces++) {                  // (n + 1 )
                for(int c=COL-1;c>0;c--) {                              // (n + 1) * n -> n**2 + n
                    if(tablero[f][c]==0) {                              // n **2
                        tablero[f][c] = tablero[f][c-1];                // n **2
                        tablero[f][c-1] = 0;                            // n **2
                    }                                                   // n **2
                }                                                       // n **2
            }                                                           // n
        }                                                               // 1 paso
        
    }                                                                   // 1 paso
    
    
    private void sumarDerecha(int f) {                                  // 1 paso
        if(vaciasEnFila(f)<FIL-1) {                                     // 1 paso
            for(int c=COL-1;c>0;c--) {                                  // n + 1
                if(tablero[f][c] == tablero[f][c-1]) {                  // n
                    tablero[f][c] *= 2;                                 // n
                    tablero[f][c-1] = 0;                                // n
                }                                                       // n
            }                                                           // n
        }                                                               // 1 paso
    }                                                                   // 1 paso
    
    
    public void moverIzquierda() {                                      //  1 paso
        for(int f=0; f<FIL; f++) {                                      // n + 1
            moverIzquierdaFila(f);                                      // n
        }                                                               // n
        if(!finPartida())                                               // 1 Paso
                ponerDos();                                             // 1 paso
    }                                                                   // 1 paso
    
    private void moverIzquierdaFila(int f) {                            // 1 paso
        colocarIzquierda(f);                                            // 
        sumarIzquierda(f);                                              // 
        colocarIzquierda(f);                                            // 
    }                                                                   // 1 paso
    
    private void colocarIzquierda(int f) {                              // 1 paso

        if(vaciasEnFila(f) < FIL) {                                     // 1 paso
            for(int veces = 0;veces < COL-1;veces++) {                  // n + 1
                for(int c=0;c<COL-1;c++) {                              // (n + 1)*n -> n**2 + n
                    if(tablero[f][c]==0) {                              // n**2
                        tablero[f][c+1] = 0;                            // n**2
                        tablero[f][c] = tablero[f][c+1];                // n**2
                    }                                                   // n**2
                }                                                       // n**2
            }                                                           // n
        }                                                               // 1 paso
        
    }                                                                   // 1 paso
    
    
    private void sumarIzquierda(int f) {                                // 1 paso
        if(vaciasEnFila(f)<FIL-1) {                                     // 1 paso
            for(int c=0;c<COL-1;c++) {                                  // n + 1
                if(tablero[f][c] == tablero[f][c+1]) {                  // n
                    tablero[f][c] *= 2;                                 // n
                    tablero[f][c+1] = 0;                                // n
                }                                                       // n
            }                                                           // n
        }                                                               // 1 paso
    }                                                                   // 1 paso
      
}                                                                       // 1 paso
