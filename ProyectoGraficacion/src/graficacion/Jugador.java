/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

import java.awt.Graphics;

/**
 *
 * @author Saul
 */
public class Jugador extends Componente{
    int posX;
    int posY;
    int color;
    Graphics gj; 
   
    public Jugador( int xp, int yp, int c, Graphics g) {
        lib = new LibreriaGrafica();
        posX= xp;
        posY=yp;
        color=c;
        gj = g;
    }
  
         
    
    public void reDibujarJugador(int x, int y, int color){
        lib.dibujarLinea(x, y, x, y, color, null);
        
    }
    @Override
    public void dibujarse(){
        lib.dibujarLinea(posX, posY, posX+5, posY, color,gj);
        lib.dibujarLinea(posX, posY, posX, posY+70, color, gj);
        lib.dibujarLinea(posX, posY+70, posX+5, posY+70, color, gj);
        lib.dibujarLinea(posX+5, posY, posX+5, posY+70, color, gj);
    
    }
    
}
