import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SimpleFrameWithQuitButton extends JFrame implements ActionListener  {

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
    private JButton quitButton;
    private JTextArea text;

    public SimpleFrameWithQuitButton() {
	setTitle("Simple frame with quit button");
	setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	Container contentPane = this.getContentPane();
	JPanel p = new JPanel();
	quitButton = new JButton("Quit");
	quitButton.addActionListener(this);
	p.add(quitButton);

	// output messages go here
	text = new JTextArea();
	contentPane.add(p, BorderLayout.NORTH);
	contentPane.add(text, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
	Object source = event.getSource();
	if (source == quitButton) {
	    System.exit(0);
	}
    }

    public static void main (String[] args) {
	JFrame frm = new SimpleFrameWithQuitButton();
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setVisible(true);
    }
}
