package SachinGoud.assignment.data;

public class IntChar {
	int intanceIntegerVariable;
	char instanceCharacterVariable;
	
	//Function to display Uninitialized Instance Variables.
	public void displayInstanceVariables() {
		System.out.println("Value of unintialised Instance Integer variable: "+intanceIntegerVariable);
		System.out.println("Value of unintialised Instance Character variable: "+instanceCharacterVariable);
	}
	
	//Function to display uninitialized Local variables.
	public void displayLocalVariables() {
		int localInt;
		char localChar;
		System.out.println("Value of unintialised Local Integer variable: "+intanceIntegerVariable);
		System.out.println("Value of unintialised Local Character variable: "+instanceCharacterVariable);
	}
}
