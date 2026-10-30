import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Screen {
   public static void main(String[] args) {
   JFrame frame = new JFrame("Screen");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(500,400);
   frame.setLocationRelativeTo(null);
   
   JLabel label = new JLabel("Hello", 10, 20);
   frame.add(label);
   label.setText("Hi");
   frame.setVisible(true);
   }
   
}