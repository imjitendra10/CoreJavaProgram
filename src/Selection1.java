import java.util.Scanner;

public class Selection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the number");
			age = sc.nextInt();

			if (age == 20) {
				System.out.println("Eligible for vote");
			} else {
				System.out.println("Not eligible for vote");
			}

		}

	}
}
