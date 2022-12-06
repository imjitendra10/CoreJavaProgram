
// if else
import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		int pwd;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter number");
		pwd = s.nextInt();
		
		
		if(pwd==10) { // If condition
			System.out.println("This is Jitendra ");
			System.out.println("I'm from Mumbai");
		
			
		}
			else {      // If-else condition
				System.out.println("Condition is false because wrong password ");
			}
		}
	}


