import javax.swing.JOptionPane;

public class PetTester{
	public static void main(Stirng [] args){
		Pet myPet = new Pet();
		String input;

		input = JOptionPane.showInputDialog("What kind of pet?");
		myPet.setAnimal(input);

		input = JOptionPane.showInputDialog("What is its name?");
		myPet.setAnimal(input);

		input = JOptionPane.showInputDialog("How old is " + myPet.getName() + "?");
		myPet.setAge(Integer.parseInt(input));

		JOptionPane.showMessageDialog(null, "Your pet is " + )




	}
}