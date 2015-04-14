/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author Saul
 */
public class LibreriaGrafica {
    
  public void drawPixel(int x, int y, int color, Graphics2D g) {
        if (color==0) g.setColor(Color.blue);
        else if(color==1) g.setColor(Color.black);
         
        else if(color==2) g.setColor(Color.red);
                g.drawLine(x, y, x, y);

        
    }
    
    
    public void dibujarLinea(int x,int y,int x2, int y2, int color, Graphics g) {
    int distX = x2 - x ;
    int distY = y2 - y ;
    int dx1 = 0;
    int dy1 = 0;
    int dx2 = 0;
    int dy2 = 0 ;
    
    if (distX<0) {dx1 = -1 ;
                  dx2 = -1 ;}  
        else if (distX>0) {dx1 = 1 ;
                           dx2 = 1 ; }
    if (distY<0) dy1 = -1 ;
        else if (distY>0) dy1 = 1 ;
    //if (distX<0) dx2 = -1 ;
      //  else if (distX>0) dx2 = 1 ;
    
    int largoX = Math.abs(distX) ;
    int largoY = Math.abs(distY) ;
    
    if (!(largoX>largoY)) {
        largoX = Math.abs(distY) ;
        largoY = Math.abs(distX) ;
        if (distY<0) dy2 = -1 ; else if (distY>0) dy2 = 1 ;
        dx2 = 0 ;            
    }
    int numerator = largoX/2 ;
    for (int i=0;i<=largoX;i++) {
        drawPixel(x,y,color, (Graphics2D) g) ;
        numerator += largoY ;
        if (!(numerator<largoX)) {
            numerator -= largoX ;
            x += dx1 ;
            y += dy1 ;
        } else {
            x += dx2 ;
            y += dy2 ;
        }
    }
}
    public void dibujarCirculo(int xi, int yi, int r, int color, Graphics g){  
    // calculate radius of circle  
   // int radius=(int)(Math.sqrt((xf-xi)*(xf-xi)+(yf-yi)*(yf-yi)));  
    int radio =r; 
    int x = 0;
    int y = radio;  
    int d1 = 3 - (2 * radio);  
    
    int x1=xi;
    int y1=yi;
  
    
    boolean condicion=true;  
  
    // for one eights, while x is not >= y  
    // mientras x no sea mayor o igual a y
    while (condicion){  
        if (x>=y){condicion=false;}  
        if (d1 < 0) 
        { d1 = d1 + (4 * x) + 6; }  
        else{ d1 = d1 + 4 * (x - y) + 10; // (1)  
            y = y - 1;  
        }  
      
        // draw following circle points   
        drawPixel((x1+x),(y1+y),color, (Graphics2D) g);  
        drawPixel((x1+x),(y1-y),color, (Graphics2D) g);  
       drawPixel((x1-x),(y1+y),color, (Graphics2D) g);  
         drawPixel((x1-x),(y1-y),color, (Graphics2D) g);  
          
         drawPixel((x1+y),(y1+x),color, (Graphics2D) g);  
         drawPixel((x1+y),(y1-x),color, (Graphics2D) g);  
         drawPixel((x1-y),(y1+x),color, (Graphics2D) g);  
        drawPixel((x1-y),(y1-x),color, (Graphics2D) g);  
        x++;  
    }  
}  
    
    
}
