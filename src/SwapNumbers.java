
public class SwapNumbers {

	public static void main(String[] args) {
		int a=10, b=20, temp;
		System.out.println("Before Swapping :" +a+" "+b);
		/*temp =a; using third variable
		a=b;
		b=temp; */
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swapping :" +a+" "+b);
		
	}

}
