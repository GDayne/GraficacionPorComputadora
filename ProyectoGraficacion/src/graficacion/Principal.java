/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Saul
 */
public class Principal extends JFrame{
    
    Image buffer;
    Graphics pantallaPrincipal;
    
    Principal(){
        setTitle("Ping Pong Game");
        setBounds(100, 50, 900, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        buffer = createImage(getWidth(), getHeight());
        pantallaPrincipal = buffer.getGraphics();
        updatePaint(pantallaPrincipal);
        g.drawImage(buffer, 0, 0, this);
    }

    private void updatePaint(Graphics g) {
        
    }
    
    
}
