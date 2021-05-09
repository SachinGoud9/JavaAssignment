import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class JavaAssignment6 {
	//Task 1 - Vampire Numbers.
	//Function to return Number of Digits in the Number.
    private static int numDigits(long num) {
        return Long.toString(Math.abs(num)).length();
    }
    
    private static boolean checkVampire(long org, long part1, long part2) {
        //If there are trailing zeroes in both the parts then return false.
    	if (Long.toString(part1).endsWith("0") && Long.toString(part2).endsWith("0")) {
        	return false;
        }

        int origLen = numDigits(org);
        // If length of any part not equal to total length/2 then return false
        if (numDigits(part1) != origLen / 2 || numDigits(part2) != origLen / 2) {
        	return false;
        }
        // Compare the bytes of Original Given Number and the bytes of the parts. If they are not equal then return false.
        // else return true.
        byte[] origBytes = Long.toString(org).getBytes();
        byte[] fangBytes = (Long.toString(part1) + Long.toString(part2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }

    //Driver Code
    public static void main(String[] args) {
    	//Task1 - Vampire Numbers.
    	//Driver Code to print 1st 100 Vampire Numbers.
    	int count = 0;
        int  sNo = 1;
        for (long i = 100; count < 100; i++) {
            //If the length of the number is odd then it can't be a Vampire Number.
        	if ((numDigits(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for (long part1 = 2; part1 <= Math.sqrt(i) + 1; part1++) {
                if (i % part1 == 0) {
                    long part2 = i / part1;
                    //CHeck if both the parts can form a single number.
                    if (checkVampire(i, part1, part2) && part1 <= part2) {
                    	//vampireNumbers.add(i);
                        System.out.println(sNo + ")" + i);
                        sNo++;
                        count++;
                    }
                }
            }
        }
        System.out.println();
        //Task 2 - to perform overloading constructors.
        System.out.println("Task - 2");
        Overload or = new Overload(10);
        
        System.out.println();
        //Task 3 - Array of objects creation.
        System.out.println("Task - 3");
        ArrayOfObjects aob[] = new ArrayOfObjects[8];
        for(int i=0;i<8;i++) {
        	aob[i] = new ArrayOfObjects(randomAlphaNumeric((i+4)%10+1));
        }
    }
    
    //Preprocessing to generate random strings
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length())%36;
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}


//Task 2 - Overloaded Constructors

class Overload {
	Overload(int a){
		this(a,20);
		System.out.println("Only 1 parameter a = 10 was called while creating an object.");
	}
	Overload(int a,int b){
		System.out.println("Constructor called with 2 arguments a = 10 and b =20 was called in the constructor.");
		System.out.println("a + b = "+(a+b));
	}
}

// Task 3 - Array of Objects Creation
class ArrayOfObjects{
	ArrayOfObjects(String temp){
		System.out.println(temp);
	}
}