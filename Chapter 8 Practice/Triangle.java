import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangle{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 200;
    
    private JFrame frame;
    
    class MousePressListener implements MouseListener{
        public void mousePressed(MouseEvent event){
            int x = event.getX();
            int y = event.getY();}
        
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}}}
    