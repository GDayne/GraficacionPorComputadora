/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Saul
 */
public class PingPongGame extends JFrame{
    
    int x,y;
    int j1x, j1y;
    int j2x, j2y;
    Jugador j1;
    Jugador j2;
    private Image dbImage;
    private Graphics dbg;
    
public class AL extends KeyAdapter {
public void keyPressed(KeyEvent e){
     int keyCode = e.getKeyCode();
     if(keyCode == e.VK_S){
         j2y++;     
     }
     if(keyCode == e.VK_UP){
        j1y--;
     }
     if(keyCode == e.VK_W){
         j2y--;     
     }
     if(keyCode == e.VK_DOWN){
         j1y++;
     }
}
public void keyReleased(KeyEvent e){
}
} 

public PingPongGame(){
    addKeyListener(new AL());
    setTitle("ping pong");
     setBounds(100, 50, 900, 600);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    x=150;
    y=150;
    j1x=30;
    j1y =250;
    j2x=870;
    j2y=300;
    
    j1= new Jugador();
    j2 = new Jugador();

}

public void paint(Graphics g){
    dbImage = createImage(getWidth(), getHeight());
    dbg = dbImage.getGraphics();
    paintComponent(dbg);
    g.drawImage(dbImage, 0, 0, this);
}

public void paintComponent(Graphics g){
   // g.fillOval(x, y, 15, 15);
    j1.dibujerseRelleno(j1x, j1y, 1, g);
    j2.dibujerseRelleno(j2x, j2y, 1, g);
    
    repaint();
}



}
