import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.util.ArrayList;

public class DrawingPanel{
    
    public DrawingPanel(){}
    
    public void getColor(){}
    
    public Dimension getPreferredSize(){}
    
    public void pickColor(){}
    
    public void addCircle(){}
    
    public void addSquare(){}
    
    public void painComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;}
    class MousePressListener implements MouseListener, MouseMotionListener{
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}}}
        