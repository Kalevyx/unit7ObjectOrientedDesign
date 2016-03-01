import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
 
public class Square extends Shape{
    public Square(Point2D.Double center, double radius, Color color){
        super(center, radius, color);}
    
    public void draw(Graphics2D g2){
        g2.setColor(Color.BLUE);}}
        //one more method