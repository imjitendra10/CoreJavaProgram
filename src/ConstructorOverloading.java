class B {
	int num1;
	int num2;
	float num3;
	int add;

	B() {
		num1 = 3;

	}

	B(int a) {
		
	}

	B(int a, int b) {
		num1 = a;
		num2 = b;
		

	}

	B(int a, int b, float f) {
		num1 = a;
		num2 = b;
		num3 = f;
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		B obj = new B(5,4);
	System.out.println(obj.num2);

	}

}
