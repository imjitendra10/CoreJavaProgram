import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		/*
		 * Arithmetic, Logical, Relational, Bitwise, Increment/Decrement
		 */

		int a, b, c, d, e, f, g;

		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the number :");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b; // Arithmetic operator
			d = a - b;
			e = a * b;
			f = a / b;

			System.out.println("Addition of number is:" + c);
			System.out.println("Subtraction of number is:" + d);
			System.out.println("Multiplication of number is:" + e);
			System.out.println("Division of number is:" + f);

		}

	}

}
