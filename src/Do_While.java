// Print natural number 1 to 10
import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter a number...");
		Scanner s = new Scanner(System.in);
				num = s.nextInt();
				
				do {
					System.out.println(num );
					++num;
				}
				while(num<=10);
		
		
		
		
		
		}

}
