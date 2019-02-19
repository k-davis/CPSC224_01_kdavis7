import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class LatinTranslator extends JFrame{
	private JLabel messageLabel;

	private JButton sinButton;    
	private JButton dexButton;    
	private JButton medButton;    
	
	private final int WINDOW_WIDTH = 320;  // Window width
	private final int WINDOW_HEIGHT = 200; // Window height

	public LatinTranslator(){
		setTitle("Latin Translator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		setVisible(true);
		setLayout(new BorderLayout());
	}

	private void buildPanel()
	{
	   // Create a label to display instructions.
	   messageLabel = new JLabel("Translate");
	   
	   sinButton = new JButton("Sinister");
	   dexButton = new JButton("Dexter");
	   medButton = new JButton("Medium");
	   
	   sinButton.addActionListener(new LatinButtonListener());
	   dexButton.addActionListener(new LatinButtonListener());
	   medButton.addActionListener(new LatinButtonListener());
	   
	   
	   // Add the label, text field, and buttons
	   add(messageLabel, BorderLayout.NORTH);
	   add(sinButton, BorderLayout.WEST);
	   add(dexButton, BorderLayout.CENTER);
	   add(medButton, BorderLayout.EAST);
	}

	private class LatinButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == sinButton){
				messageLabel.setText("Left");
			} else if(e.getSource() == dexButton){
				messageLabel.setText("Right");
			} else if(e.getSource() == medButton){
				messageLabel.setText("Center");
			}
		}
	}

	public static void main(String [] args){
		new LatinTranslator();
	}
}