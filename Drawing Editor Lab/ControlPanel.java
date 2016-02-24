import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel{
    private JButton colorButton;
    private JButton circleButton;
    private JButton squareButton;
    private JLabel label;
    private JPanel panel;
    
    public ControlPanel(DrawingPanel canvas){
        this.colorButton = new JButton("Pick Color");
        add(colorButton);
        panel = new JPanel();
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
            label.setText("Button "+event.getActionCommand()+" was clicked");}}}