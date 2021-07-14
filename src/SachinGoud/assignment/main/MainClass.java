package SachinGoud.assignment.main;

import SachinGoud.assignment.data.*;
import SachinGoud.assignment.singleton.*;

public class MainClass {
	public static void main(String args[]) {
		//First Task
		InstanceLocalVariablesDisplay instanceLocalVariablesDisplay = new InstanceLocalVariablesDisplay();
		instanceLocalVariablesDisplay.displayInstanceVariables();
		instanceLocalVariablesDisplay.displayLocalVariables();
		
		//Second Task
		//This throws an error as static methiod cannot refer to non static variable.
		//Static method deal with classes hence it cannot return an object. Hence it throws an error.
		
		
		//VariableClass vc = VariableClass.initializeString("Sachin");
		//vc.displayStringVariable();
	}
}
