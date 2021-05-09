package JavaAssignment7;

import JavaAssignment7.Bicycle;
import JavaAssignment7.Unicycle;

public class MainClass {
	public static void main(String args[]) {
		Cycle cu1 = new Unicycle();
		
		// cu1.balance(); By Calling this method it will through an error as there is no balance method in Unicycle class.
		
		Cycle cb1 = new Bicycle();
		
		//cb1.balance();   By Calling this method it will through an error as there is no balance method in Bicycle class.
		
		Unicycle cu2 = new Unicycle();
		
		cu2.balance();
		
		Bicycle cb2 = new Bicycle();
		
		cb2.balance();
	}
}
