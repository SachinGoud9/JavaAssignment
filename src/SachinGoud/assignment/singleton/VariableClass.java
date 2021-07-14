package SachinGoud.assignment.singleton;

public class VariableClass {
	String variableString;
	//public static VariableClass initializeString(String temp) {
		//You cannot refer non static variables or methods from static method. 
		//Here "variableString" is a static variable hence it cannot be refered.
		//variableString = temp;
		
		//Static methods deal with classes not objects. Hence, you cannot return an object from a static method.
		//return this;		
	//}
	//Function to print the String.
	public VariableClass display() {
		System.out.println(variableString);
		return this;
	}
}
