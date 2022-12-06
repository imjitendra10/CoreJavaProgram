// If else Statement

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If-else Statement taking input from the user
		/*
		 * int num; Scanner sc = new Scanner(System.in); {
		 * System.out.println("Enter the number"); num =sc.nextInt();
		 * 
		 * }
		 */

		int num = 50;
		if (num == 0) {
			System.out.println("If-else concept");
		}

		else if (num % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

}
