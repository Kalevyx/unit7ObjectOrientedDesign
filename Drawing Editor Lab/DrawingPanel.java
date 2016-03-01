import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JColorChooser;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

public class DrawingPanel extends JComponent{
    ArrayList<Shape> shapes;
    private Color currentColor;
    public DrawingPanel(){
        shapes = new ArrayList<Shape>();
        setBackground(Color.WHITE);
        currentColor = Color.BLUE;}
    
    public Color getColor(){return getBackground();}
    
    //public Dimension getPreferredSize(){}
    
    public void pickColor(){
        currentColor = JColorChooser.showDialog(this, "Choose a color", currentColor);}
    
    public void addCircle(){}
    
    public void addSquare(){}
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Shape shape: shapes){
            shape.draw(g2,true);}}
            
    abstract class MousePressListener implements MouseListener, MouseMotionListener{
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}}}