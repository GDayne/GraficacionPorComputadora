/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import javax.swing.JPanel;

/**
 *
 * @author Saul
 */
import java.math.*;
class PanelPingPong extends JPanel implements KeyListener{
    
    
    LibreriaGrafica li;
    
    public PanelPingPong() {
        
        li=new LibreriaGrafica();
   // setFocusable(true);
     //   addKeyListener((KeyListener) this);
        
        
    }
    
    public void paint(Graphics g){
        Graphics2D gd2 = (Graphics2D)g;
         Jugador j1= new Jugador();
         Jugador j2= new Jugador();
         Balon b = new Balon();
         b.dibujarseRelleno(400, 300,g);
         j1.dibujerseRelleno(20, 275, 1, g);
         j2.dibujerseRelleno(850, 275, 0, g);
         
         
        
        
        /*li.dibujarLinea(300, 300, 450, 500, 1, g);
        
      li.dibujarLinea(15, 16, 300, 400, 0, gd2);
         li.dibujarLinea(1, 50, 1, 400, 1, gd2);
         li.dibujarLinea(80, 75, 40, 10, 0, gd2);
         li.dibujarLinea(300, 300, 100,600, 2, gd2);
         li.dibujarLinea(200, 300, 600, 300, 1, gd2);
         li.dibujarCirculo(300, 300,  100,1, g);
          li.dibujarCirculo(300, 300, 150,0, g);
          li.dibujarCirculo(450, 450, 50,2, g);*/
        
    }
   
  


   /* public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPressed = true;
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPressed = true;
        }
    }


    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPressed = false;
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPressed = false;
        }
    }*/

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
           
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            
        }
         if (e.getKeyCode() == KeyEvent.VK_W) {
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
