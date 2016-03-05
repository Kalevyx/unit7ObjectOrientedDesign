import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Sets up panel and buttons
 * Extends JPanel
 * 
 * @author crli
 * @date March 4, 2016
 */
public class ControlPanel extends JPanel{
    //Creates canvas variable
    private DrawingPanel canvas;
    //Creates colorButton variable
    private JButton colorButton;
    //Create circleButton variable
    private JButton circleButton;
    //Creates squareButton variable
    private JButton squareButton;
    //Creates panel variable
    private JPanel panel;
    
    //Sets up canvas and adds buttons
    public ControlPanel(DrawingPanel c){
        canvas = c;
        this.colorButton = new JButton("Pick Color");
        add(colorButton);
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        add(panel);
        this.circleButton = new JButton("Add Circle");
        add(circleButton);
        this.squareButton = new JButton("Add Square");
        add(squareButton);
        
        ClickListener listener = new ClickListener();
        this.colorButton.addActionListener(listener);
        this.circleButton.addActionListener(listener);
        this.squareButton.addActionListener(listener);}
    
    //Each button with its respective abilities
    //Chooses color or adds square or circle
    public class ClickListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==colorButton){
                canvas.pickColor();
                panel.setBackground(canvas.getColor());}
            else if(event.getSource()==circleButton){
                canvas.addCircle();
            }
            else{
                canvas.addSquare();
            }}}}
