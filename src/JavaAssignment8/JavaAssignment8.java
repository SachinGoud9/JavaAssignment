package JavaAssignment8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaAssignment8 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter two numbers to add");
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = a / b;  // cannot divide by zero
            int arr[] = new int[]{a, b};
            System.out.print("Enter the index of the element you need in the array : ");
            int index = Integer.parseInt(br.readLine());
            System.out.println(arr[index]);
            String assign = null;
            System.out.println("enter the character index you need in the string " + assign);
            int i = Integer.parseInt(br.readLine());
            System.out.println(assign.charAt(i));
            System.out.println("Result = " + c);

        } catch (ArithmeticException | IOException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught is : " + e.getMessage());
        } finally {
            System.out.println("This block gets executed whatever the circumstances may be");
        }
    }
}
