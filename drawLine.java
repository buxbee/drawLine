
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class drawLine extends JPanel {
  public void paint(Graphics g) {
      int[] xs = {87, 322, 552, 555, 788, 1022};
      int[] ys = {337, 164, 166, 490, 487, 339};
      g.drawPolyline(xs, ys, 5);
      
  
  }

  public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.getContentPane().add(new drawLine());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);
    frame.setVisible(true);
    
    		
  }
  
}
     