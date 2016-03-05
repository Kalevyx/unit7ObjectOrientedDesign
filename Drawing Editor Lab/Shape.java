import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;

/**
 * Implements shape with given center, radius, and color
 * 
 * @author crli
 * @date March 4, 2016
 */
public abstract class Shape{
    //Creates center variable
    private Point2D.Double center;
    //Creates radius variable
    private double radius;
    //Creates color variable
    private Color color;
    
    //Creates a shape with the center at the specified point and with the specified radius and color
    public Shape(Point2D.Double ct, double r, Color c){
        this.center = ct;
        this.radius = r;
        this.color = c;}
    
    //Returns the center of the shape
    public Point2D.Double getCenter(){return center;}
    
    //Returns the radius
    public double getRadius(){return radius;}
    
    //Displaces the center of this shape by (x, y)
    public void move(double x, double y){this.center.setLocation(x,y);}
    
    //Sets the radius of this shape to r
    public void setRadius(double r){radius = r;}
    
    //Returns the color
    public Color getColor(){return color;}
    
    //Returns true if the point lies inside this shape, false otherwise
    public abstract boolean isInside(Point2D.Double point);
    
    //Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise
    public abstract void draw(Graphics2D g2, boolean filled);}
