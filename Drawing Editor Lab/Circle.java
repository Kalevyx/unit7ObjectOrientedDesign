import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Draws Circle
 * Extends Shape
 * 
 * @author crli
 * @date March 4, 2016
 */ 
public class Circle extends Shape{
    //Passes center, radius, and color back to Shape
    public Circle(Point2D.Double center, double radius, Color color){
        super(center, radius, color);}
      
    //Returns true if the point lies inside this shape, false otherwise
    public boolean isInside(Point2D.Double point){
        if(Math.sqrt(Math.pow(getCenter().getX()-point.getX(),2)+Math.pow(getCenter().getY()-point.getY(),2))<getRadius()){
            return true;}
        else{
            return false;}}
       
    //Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise
    public void draw(Graphics2D g2, boolean filled){
        Ellipse2D.Double circle = new Ellipse2D.Double(getCenter().getX()-getRadius(), getCenter().getY()-getRadius(), 2*getRadius(), 2*getRadius());
        g2.setColor(super.getColor());
        if(filled==true){
            g2.fill(circle);}
        else{
            g2.draw(circle);}}}
