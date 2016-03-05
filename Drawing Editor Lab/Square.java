import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Draws Square
 * Extends Shape
 * 
 * @author crli
 * @date March 4, 2016
 */
public class Square extends Shape{
    //Passes center, radius, and color back to Shape
    public Square(Point2D.Double center, double radius, Color color){
        super(center, radius, color);}
    
    //Returns true if the point lies inside this shape, false otherwise
    public boolean isInside(Point2D.Double point){
        if(getCenter().getX()-getRadius()<point.getX()&&getCenter().getX()+getRadius()>point.getX()&&getCenter().getY()-getRadius()<point.getY()&&getCenter().getY()+getRadius()>point.getY()){
            return true;}
        else{
            return false;}}
        
    //Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise
    public void draw(Graphics2D g2, boolean filled){
        Rectangle2D.Double square = new Rectangle2D.Double(getCenter().getX()-getRadius(), getCenter().getY()-getRadius(), 2*getRadius(), 2*getRadius());
        g2.setColor(super.getColor());
        if(filled==true){
            g2.fill(square);}
        else{
            g2.draw(square);}}}
