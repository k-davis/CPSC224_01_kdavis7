public class ConverionProgram{
	public static void main(String[] args){
		Scanner scn = new Scanner();
		String input;
		int selection;
		double meters;
		boolean running = true;

		while(running){
			System.out.print("Enter a distance in meters: ");
			input = scn.nextLine();
			meters = String.parseDouble(input);

			if(meters > 0){
				menu();
				input = scn.nextLine();
				selection = String.parseInt(input);

				if(selection == 1){
					showKilometers(meters);
				}else if(selection == 2){

				} else if(selection == 3){

				} else if(selection == 4){

				} else {

				}
			} else {
				System.out.println("Negative distances are inavlid. Please try again.");
			}

		}

		
	}

	public static void showKilometers(double meters){
		double km = 0.001 * meters;
		System.out.println("" + meters + " meters is " + km + " kilometers.");
	}

	public static void showInches(double meters){
		double inches = 39.37 * meters;
		System.out.println("" + meters + " meters is " + inches + " inches.");		
	}

	public static void showFeet(double meters){
		double feet = 3.281 * meters;
		System.out.println("" + meters + " meters is " + feet + " feet.");			
	}

	public static void menu(){
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convery to inches");
		System.out.println("3. Convert to inches");
		System.out.println("4. Quit the program");

		System.out.print("\nEnter your choice: ");
	}
}