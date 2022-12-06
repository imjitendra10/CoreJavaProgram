import java.util.Scanner;

public class FindCube {
   public static void main(String args[]){
      int a = 5;
      System.out.println("Enter any number :");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("Cube of the given number is "+(n*n*n));
   }
}