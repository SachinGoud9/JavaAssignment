package JavaAssignment2;

import java.util.*;
import java.util.regex.*;

public class JavaAssignment2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String str = "([a-z]|[A-Z])";
		Pattern pattern = Pattern.compile(str);
		Matcher matcher = pattern.matcher(input);
		if(matcher.find()) {
			System.out.println("Input contains a-z.");
		}
		else {
			System.out.println("Pattern Not Found.");
		}
	}
}
