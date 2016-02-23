import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel{
    private JPanel panel;
    private JButton colorButton;
    private JButton circleButton;
    private JButton squareButton;
    private JLabel label;
    
    public ControlPanel(DrawingEditor controls){
        this.panel = new JPanel();
        
        this.colorButton = new JButton("Pick Color");
        this.panel.add(colorButton);
        //this.panel.add();
        this.circleButton = new JButton("Add Circle");
        this.panel.add(circleButton);
        this.squareButton = new JButton("Add Square");
        this.panel.add(squareButton);
        
        /*this.label = new JLabel();
        this.panel.add(this.label);*/}
        
    public class ClickListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            label.setText("Button "+event.getActionCommand()+" was clicked");}}}