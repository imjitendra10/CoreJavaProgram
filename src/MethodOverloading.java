class Adder {
	/*
	 * static int add(int a, int b) // MethodOverloading with different number of
	 * arguments { return(a+b);
	 * 
	 * } static int add(int a, int b, int c) { return(a+b+c);
	 * 
	 * }
	 * }
	 */
	static int add(int a, int b) // MethodOverloading with changing data type of parameter
	{
		return a + b;
	}

	static double add(double a, double b)
	{
		return a + b;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {

		/*
		 * System.out.println(Adder.add(10,20));
		 * System.out.println(Adder.add(10,20,30));
		 */

		System.out.println(Adder.add(10, 20));
		System.out.println(Adder.add(10.2, 20.8));
	}
}
