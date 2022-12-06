public class SwapTwoNumbers {

	public static void main(String[] args) {
	int a=10,b=20;
		
		System.out.println("Number before swapping :"+a+" "+b );
		
		/*int t=a; // with third variable
		a=b;
		b=a; */
		
		a=a+b; // without third variable
		b=a-b;
		a=a-b;
		System.out.println("Number after Swapping :"+a+" "+b);
		
	}

}
