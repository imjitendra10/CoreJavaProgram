import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		 int a[] = new int[5];
		 System.out.println("Enter array elements :");
		 Scanner s= new Scanner(System.in);
		 for(int i=0;i<5;i++) 
		 {
		 a[i] = s.nextInt();
	}
		 Arrays.sort(a);
		 System.out.print("Sorted Array elements:\n"); // To sort the element 
		// System.out.print("Array elements"+" "); // To print all elements taken by the user
		 
        for(int b:a) {
		System.out.println(b+" ");
        }
	}
}
	


