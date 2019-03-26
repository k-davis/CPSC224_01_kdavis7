// Kasey Davis
// ICA 6

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;


public class DrawBoxes extends JFrame
{
    private int currentX = 0; // Mouse cursor's X position
    private int currentY = 0; // Mouse cursor's Y position
    private int width = 0;    // The rectangle's width
    private int height = 0;   // The rectangle's height
    private Random rand = new Random();
                
    /**
         init method
    */
    public DrawBoxes(){
        setTitle("Draw boxes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        createListeners();

        setVisible(true);

    }

    public void createListeners()
    {
        // Add a mouse listener and a mouse motion listener.
        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseMotionListener());
    }

    /**
         paint method
        @param g The applet's Graphics object.
    */

    public void paint(Graphics g)
    {
        // Call the superclass's paint method.
        super.paint(g);

        // Set a random color to use
        g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
        
        // Draw a filled rectangle.
        g.fillRect(currentX, currentY, width, height);
    }

    /**
         Mouse listener class
    */

    private class MyMouseListener
                        implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            // Get the mouse cursor coordinates.
            currentX = e.getX();
            currentY = e.getY();
        }

        //
        // The following methods are unused, but still
        // required by the MouseListener interface.
        //

        public void mouseClicked(MouseEvent e)
        {
            // Reassign the box's center to the mouse position
            currentX = e.getX() - width / 2;
            currentY = e.getY() - height / 2;
            repaint();
        }

        public void mouseReleased(MouseEvent e)
        {
        }

        public void mouseEntered(MouseEvent e)
        {
        }

        public void mouseExited(MouseEvent e)
        {
        }
    }

/**
     Mouse Motion listener class
*/

    private class MyMouseMotionListener
                    implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {
            // Calculate the size of the rectangle.
            width = e.getX() - currentX;
            height = e.getY() - currentY;
            
            // Repaint the window.
            repaint();
        }
        
        /**
             The mouseMoved method is unused, but still
            required by the MouseMotionListener interface.
        */
        
        public void mouseMoved(MouseEvent e)
        {
        }
    }

    public static void main(String[] args){
        new DrawBoxes();
    }
}