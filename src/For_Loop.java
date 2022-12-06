import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args)
	{
		//int num =2;
		
		int num;    // Taking Input from the user
		System.out.println("Enter the number... ");
		Scanner s = new Scanner(System.in);
		
		 num = s.nextInt(); 
		 for(int i=1; i<=10; i++)
		 {
			System.out.println(num*i);
		 }
		 
		
	}

}
