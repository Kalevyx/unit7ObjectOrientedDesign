import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * The frame of the program
 * 
 * @author crli
 * @date March 4, 2016
 */
public class DrawingEditor extends JFrame{
    //Sets frame width
    private static final int FRAME_WIDTH = 500;
    //Sets frame height
    private static final int FRAME_HEIGHT = 500;
    //Creates frame variable
    private JFrame frame;
    //Creates canvas variable
    private DrawingPanel canvas;
    //Creates controls variable
    private ControlPanel controls;
    
    //Creates frame with controls and canvas
    public DrawingEditor(){
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        add(canvas, BorderLayout.CENTER);
        add(controls, BorderLayout.PAGE_END);
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Drawing Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);}

    //Creates visible frame and canvas where shapes are added
    public static void main(String[]args){
        DrawingEditor viewer = new DrawingEditor();}}
