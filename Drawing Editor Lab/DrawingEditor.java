import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingEditor extends JFrame{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    
    private JFrame frame;
    private DrawingPanel canvas;
    private ControlPanel controls;
    private JPanel panel;
    /*private JButton colorButton;
    private JButton circleButton;
    private JButton squareButton;*/
    private JLabel label;
    
    public DrawingEditor(){
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        /*this.colorButton = new JButton("Pick Color");
        this.panel.add(colorButton);
        this.circleButton = new JButton("Add Circle");
        this.panel.add(circleButton);
        this.squareButton = new JButton("Add Square");
        this.panel.add(squareButton);*/
        
        this.label = new JLabel();
        this.panel.add(this.label);
        
        ControlPanel controls = new ControlPanel(canvas);
        
        this.frame.add(this.panel);
        
        ClickListener listener = new ClickListener();
        this.colorButton.addActionListener(listener);
        this.circleButton.addActionListener(listener);
        this.squareButton.addActionListener(listener);
        
        this.frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setTitle("Drawing Editor");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);}
        
    public static void main(String[]args){
        DrawingEditor viewer = new DrawingEditor();}}