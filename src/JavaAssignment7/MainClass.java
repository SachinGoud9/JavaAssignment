package JavaAssignment7;

import JavaAssignment7.Bicycle;
import JavaAssignment7.Unicycle;

public class MainClass {
	public static void main(String args[]) {
		//Task1
		Rodent[] r=new Rodent[3];
		r[0]=new Mouse();
		r[0].show();
		r[1]=new Gerbil();
		r[1].show();
		r[2]=new Hamster();
		r[2].show();
		
		
		System.out.println();
		//Task2
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
