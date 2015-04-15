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
    int dx, dy;
    Graphics gj; 
   
    public Jugador() {
        lib = new LibreriaGrafica();
        dx=5;
        dy=80;
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
    
    public void dibujerseRelleno( int xp, int yp, int c, Graphics g){
    int dx1, dy1;
    dx1=dx; dy1=dy;
     posX= xp;
     posY=yp;
     color=c;
     gj = g;
    for(int i = dx;i>=0;i--){
     lib.dibujarLinea(posX, posY, posX+dx1, posY, color,gj);
        lib.dibujarLinea(posX, posY, posX, posY+dy1, color, gj);
        lib.dibujarLinea(posX, posY+dy1, posX+dx1, posY+dy1, color, gj);
        lib.dibujarLinea(posX+dx1, posY, posX+dx1, posY+dy1, color, gj);
        dx1--; dy1--;
        posX++; posY++;
    
    }
        
        
    
    }
    
}
