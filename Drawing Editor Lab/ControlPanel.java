import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel{
    private DrawingPanel canvas;
    private JButton colorButton;
    private JButton circleButton;
    private JButton squareButton;
    private JLabel label;
    private JPanel panel;
    
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
        
    public class ClickListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==colorButton){
                canvas.pickColor();
                panel.setBackground(canvas.getColor());}
            else if(event.getSource()==circleButton){
                //add circle
            }
            else{
                //add square
            }}}}