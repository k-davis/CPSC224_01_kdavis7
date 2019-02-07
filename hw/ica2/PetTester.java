/**
ICA 2
Due Date: 2/8/19
Kasey Davis
**/

import javax.swing.JOptionPane;

public class PetTester{
	public static void main(String [] args){
		Pet myPet = new Pet();
		String input = "y";

		while(input.charAt(0) == 'y' || input.charAt(0) == 'Y'){
			input = JOptionPane.showInputDialog("What kind of pet?");
			myPet.setAnimal(input);

			input = JOptionPane.showInputDialog("What is its name?");
			myPet.setName(input);

			input = JOptionPane.showInputDialog("How old is " + myPet.getName() + "?");
			myPet.setAge(Integer.parseInt(input));

			input = JOptionPane.showInputDialog("Your pet is " + myPet.getName() + " the " + myPet.getAnimal() + ", aged " + myPet.getAge() + ".\n\n" + 
				"Do you want to change any of these values? (y/n)");
		}


	}
}