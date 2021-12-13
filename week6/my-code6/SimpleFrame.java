import javax.swing.JFrame;

public class SimpleFrame extends JFrame {
    
    public SimpleFrame() {
        setTitle("This is the title of your SimpleFrame.");
        // more settings
        setSize(800, 600);
    }

    public static void main(String[] args) {
        JFrame jFrame = new SimpleFrame();
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
