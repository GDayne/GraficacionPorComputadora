/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

/**
 *
 * @author Saul
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class TestProgram extends JFrame implements KeyListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Image TestImage;
    private BufferedImage bf;
    private int cordX = 100;
    private int cordY = 100;

    public TestProgram() {
        setTitle("Testing....");
        setSize(500, 500);
        imageLoader();
        setVisible(true);
    }



    public void imageLoader() {
        try {
            String testPath = "imagen/a.png";
            TestImage = ImageIO.read(getClass().getResourceAsStream(testPath));
           // Balon b= new Balon(100, 100, g);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        addKeyListener(this);
    }

    public void update(Graphics g){
           paint(g);
    }

    public void paint(Graphics g){

        bf = new BufferedImage( this.getWidth(),this.getHeight(), BufferedImage.TYPE_INT_RGB);

    try{
    animation(bf.getGraphics());
    g.drawImage(bf,0,0,null);
    Balon b= new Balon();
    b.dibujarseRelleno(cordX, cordY, g);
    g.fillOval(cordX, cordY, cordX+50, cordY+50);
    }catch(Exception ex){

    }
}

    public void animation(Graphics g) {
        super.paint(g);
        g.drawImage(TestImage, cordX, cordY, this);
    }

    public static void main(String[] args) {
        new TestProgram();
    }

    public void keyPressed(KeyEvent ke) {
        switch (ke.getKeyCode()) {
        case KeyEvent.VK_RIGHT: {
            cordX += 5;
        }
            break;
        case KeyEvent.VK_LEFT: {
            cordX -= 5;
        }
            break;
        case KeyEvent.VK_DOWN: {
            cordY += 5;
        }
            break;
        case KeyEvent.VK_UP: {
            cordY -= 3;
        }
            break;
        }
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyReleased(KeyEvent ke) {
    }
}