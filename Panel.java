
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import javax.swing.*;

public class Panel extends JPanel implements KeyListener{

    
    public Panel()
    {
        this.addKeyListener(this);     
        this.setFocusable(true); 
        this.setBackground(Color.BLACK); //change background colour
    }
    
    public void paint(Graphics g)
    {
        //need to implement
    }


    @Override
    public void keyTyped(KeyEvent ke) {
        //not required
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //need to implement
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //need to implement
    }    
}
