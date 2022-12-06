//else if

import java.util.Scanner;

public class ControlStatement1 {

	public static void main(String[] args)
	{
		
	// int age = 10;
		
		int age; // Takin input from the user78
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enete the age ..");
		age = s.nextInt(); 
		if(age == 18) {
			System.out.println("Eligible for vote.");
			
		}
		else if(age<18) {
			System.out.println("Not eligible for vote");
		}
		else {
			System.out.println("Eligible for vote..");
		}

	}

}
