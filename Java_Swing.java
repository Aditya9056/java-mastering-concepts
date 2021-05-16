
/**
 * Java_Swing
 */
import javax.swing.JFrame;
import javax.swing.JLabel;

class Display extends JFrame{

    public Display() {
        JLabel j = new JLabel("Portala IDE");
        add(j);
        
        setVisible(true);
        setSize(500, 600);
    }
}
public class Java_Swing {

    public static void main(String[] args) {
        Display ob1 = new Display();
    }
}