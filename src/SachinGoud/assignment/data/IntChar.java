package SachinGoud.assignment.data;

public class InstanceLocalVariablesDisplay {
	int intanceIntegerVariable;
	char instanceCharacterVariable;
	
	//Function to display Uninitialized Instance Variables.
	public void displayInstanceVariables() {
		System.out.println("Value of unintialised Instance Integer variable: "+intanceIntegerVariable);
		System.out.println("Value of unintialised Instance Character variable: "+instanceCharacterVariable);
	}
	
	//Function to display uninitialized Local variables.
	public void displayLocalVariables() {
		int localIntegerVariable;
		char localCharacterVariable;
		System.out.println("Value of unintialised Local Integer variable: "+localIntegerVariable);
		System.out.println("Value of unintialised Local Character variable: "+localCharacterVariable);
	}
}
