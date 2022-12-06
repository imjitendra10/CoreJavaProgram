import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter a number...");
		Scanner s = new Scanner(System.in); // To take input from user
		a = s.nextInt();
		b = s.nextInt();
		c=a+b;
		System.out.println("Sum of two number is "+c);   // To produce output
	}

}
