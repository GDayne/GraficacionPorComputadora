/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Saul
 */
public class FrameDibujo extends JFrame {
    
    JPanel panel = new PanelPingPong();
    
    public FrameDibujo(){
     this.add(panel);
     this.setVisible(true);
     this.setBounds(200, 50, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     
    }

    
   
    
        
    
  
}
