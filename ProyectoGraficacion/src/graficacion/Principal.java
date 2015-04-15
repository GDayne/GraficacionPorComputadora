/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Saul
 */
public class Principal extends JFrame implements Runnable{
    //implementamos runnable para animar una imagen
    Image buffer;
    Graphics pantallaPrincipal;
    Thread gameloop;
    Jugador j1;
   // LibreriaGrafica lib;
    
    Principal(){
       
        setTitle("Ping Pong Game");
        setBounds(100, 50, 900, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //gameloop=new Thread(this);
      //  gameloop.start();
        
        
        
        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e); //To change body of generated methods, choose Tools | Templates.
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                x+=5;
                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                x-=5;
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                y+=5;
                }
                if(e.getKeyCode()==KeyEvent.VK_UP){
                y-=5;
                }
                
            }
        //para escuchar teclado
           
            
        });
        
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        buffer = createImage(getWidth(), getHeight());
        pantallaPrincipal = buffer.getGraphics(); //vaciamos el contenido a la pantalla
        updatePaint(pantallaPrincipal); //r´pintado de los componetes
        g.drawImage(buffer, 0, 0, this);//pintamos la imagen del buffer
    }
    int x=50, y=60; //coordeadas de circulo
    private void updatePaint(Graphics g) {
        g.fillOval(x, y, 60, 60);
        j1=new Jugador();
        j1.dibujerseRelleno(x+50, y+50, 1, pantallaPrincipal);
                
    }

    public void run() {
       /* Thread t = Thread.currentThread();
        while(t==gameloop){
            try {
                repaint();
                Thread.sleep(20);
            } catch (Exception e) {
            }
        }*/
        
        
    
    while(true){
        repaint(100, 0, 0, getWidth(), getHeight());
        //System.out.println("entro");
        //repaint();
        
    
    }
    
    }
    
    
}
