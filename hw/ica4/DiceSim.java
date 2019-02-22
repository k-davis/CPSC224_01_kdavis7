import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class DiceSim extends JFrame {
	private JPanel leftDie;
	private JLabel leftLabel;
	private JPanel rightDie;
	private JLabel rightLabel;
	private JButton button;
	private Random rnd = new Random();

	public DiceSim(){
		setTitle("Dice Simulator");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		buildLeftPanel();
		buildRightPanel();
		buildButton();

		add(leftDie, BorderLayout.WEST);
		add(rightDie, BorderLayout.EAST);
		add(button, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	private void buildLeftPanel(){
		leftDie = new JPanel();
		leftLabel = new JLabel(getRandDieImage());
		leftDie.add(leftLabel);
	}

	private void buildRightPanel(){
		rightDie = new JPanel();
		rightLabel = new JLabel(getRandDieImage());
		rightDie.add(rightLabel);
	}

	private void buildButton(){
		button = new JButton("Roll dice");
		button.addActionListener(new RollDiceListener());
	}

	private class RollDiceListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			leftLabel.setIcon(getRandDieImage());
			rightLabel.setIcon(getRandDieImage());
		}
	}

	private ImageIcon getRandDieImage(){
		int roll = rnd.nextInt(6) + 1;			
		String path = "Dice/die" + roll + ".png";
		return new ImageIcon(path);
	}

	public static void main(String[] args){
		new DiceSim();
	}
}