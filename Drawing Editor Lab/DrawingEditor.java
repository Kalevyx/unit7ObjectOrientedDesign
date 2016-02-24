import javax.swing.JFrame;
import java.awt.BorderLayout;

public class DrawingEditor extends JFrame{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    
    private JFrame frame;
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    public DrawingEditor(){
        controls = new ControlPanel(canvas);
        add(controls, BorderLayout.PAGE_END);
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Drawing Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);}
        
    public static void main(String[]args){
        DrawingEditor viewer = new DrawingEditor();}}