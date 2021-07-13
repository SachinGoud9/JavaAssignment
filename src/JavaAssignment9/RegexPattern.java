package JavaAssignment9;

import java.util.Scanner;
import java.util.regex.*;

public class RegexPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//Regex Patterns
		String regex = "[A-Z][A-Za-z0-9_!@#\\$%\\^\\&*\\)\\(+=.\\s+]*[.]$";
		Pattern pattern = Pattern.compile(regex);
        	Matcher matcher = pattern.matcher(input);
        	boolean matchFound = matcher.find();
        	if (matchFound) {
            		System.out.println("Match found");
        	} else {
            		System.out.println("Match not found");
        	}
	}
}
