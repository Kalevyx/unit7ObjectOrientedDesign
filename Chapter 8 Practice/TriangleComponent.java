import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent{
    private int count;
    private Line2D line;
    
    public TriangleComponent(){
        count = 0;}
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;}}