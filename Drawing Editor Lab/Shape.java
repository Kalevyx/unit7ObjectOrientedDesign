import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;

public abstract class Shape{
    private Point2D.Double center;
    private double radius;
    private Color color;
    public Shape(Point2D.Double ct, double r, Color c){
        this.center = ct;
        this.radius = r;
        this.color = c;}
    
    public Point2D.Double getCenter(){return center;}
    
    public double getRadius(){
        return radius;}
    
    public void move(double x, double y){}
    
    public void setRadius(double r){}
    
    public abstract boolean isInside(Point2D.Double point);
    
    //public boolean isOnBorder(Point2D.Double point){return false;}
    
    public abstract void draw(Graphics2D g2, boolean filled);}