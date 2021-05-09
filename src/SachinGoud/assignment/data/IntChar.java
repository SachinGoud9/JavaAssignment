package SachinGoud.assignment.data;

public class IntChar {
	int instanceInt;
	char instanceChar;
	
	//Function to display Uninitialized Instance Variables.
	public void displayInstanceVariables() {
		System.out.println("Value of unintialised Instance Integer variable: "+instanceInt);
		System.out.println("Value of unintialised Instance Character variable: "+instanceChar);
	}
	
	//Function to display uninitialized Local variables.
	public void displayLocalVariables() {
		int localInt;
		char localChar;
		System.out.println("Value of unintialised Local Integer variable: "+instanceInt);
		System.out.println("Value of unintialised Local Character variable: "+instanceChar);
	}
}
