import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
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

/**
 * Controls shapes and keeps track of mouse and shapes' movements
 * Extends JComponent
 * 
 * @author crli
 * @date March 4, 2016
 */
public class DrawingPanel extends JComponent{
    //Creates shapes ArrayList
    ArrayList<Shape> shapes;
    //Creates currentColor variable
    private Color currentColor;
    //Creates activeShape variable
    private Shape activeShape;
    
    //Sets the background color to white and the initial drawing color to a color of your choice
    public DrawingPanel(){
        shapes = new ArrayList<Shape>();
        setBackground(Color.WHITE);
        currentColor = Color.BLUE;
        activeShape = null;
        addMouseListener(new MousePressListener());
        addMouseMotionListener(new MousePressListener());}
    
    //Returns the current drawing color
    public Color getColor(){return currentColor;}
    
    //Overrides JCompoent’s getPreferredSize method to return a size large enough to encapsulate a reasonable drawing canvas
    public Dimension getPreferredSize(){return new Dimension(500,500);}
    
    //Called from ControlPanel when the “Pick Color” button is clicked. Brings up a JColorChooser and sets the chosen color as the new drawing color. Leaves the drawing color unchanged if the user clicks “Cancel”
    public void pickColor(){
        Color newColor = JColorChooser.showDialog(this, "Choose a color", currentColor);
        if(newColor!=null){
            currentColor=newColor;}
        else{
            currentColor=this.currentColor;}}
            
    //Called from ControlPanel when the "Add Circle" button is clicked. Adds a new circle to the list. The new circle has its center at the center of the drawing panel, a random radius (within a reasonable range) and the current drawing color. The new circle is designated as the “active shape”
    public void addCircle(){
        shapes.add(new Circle(new Point2D.Double(250,250),Math.random()*100,currentColor));
        repaint();}
    
    //Called from ControlPanel when the "Add Square" button is clicked. Adds a new square to the list. The new square has its center at the center of the drawing panel, a random radius (within a reasonable range) and the current drawing color. The new square is designated as the “active shape”
    public void addSquare(){
        shapes.add(new Square(new Point2D.Double(250,250),Math.random()*100,currentColor));
        repaint();}
    
    //Draws all the shapes in the list. The shapes should be drawn in reverse from the order in which they were added to the list. However, if one of the shapes is “picked,” then this “active shape” should be drawn last, in outline only
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Shape shape: shapes){
            if(activeShape==shape){
                shape.draw(g2,false);}
            else{
                shape.draw(g2,true);}
            repaint();}}
    
    //Does everything concerning the mouse
    public class MousePressListener implements MouseListener, MouseMotionListener{
        //Chooses activeShape
        public void mousePressed(MouseEvent event){
            Point2D.Double currentEvent = new Point2D.Double(event.getX(),event.getY());
            for(int i = shapes.size()-1;i>=0;i--){
                if(activeShape!=null&&!shapes.get(i).isInside(currentEvent)){
                    activeShape=null;}
                else if(shapes.get(i).isInside(currentEvent)){
                    activeShape=shapes.get(i);
                    shapes.remove(i);
                    shapes.add(activeShape);
                    break;}}}
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        //Moves shape to new (x,y)
        public void mouseDragged(MouseEvent event){
            for(int i = shapes.size()-1;i>=0;i--){
                if(activeShape!=null){
                    activeShape.move(event.getX(),event.getY());}}}
        public void mouseMoved(MouseEvent event){}}}
