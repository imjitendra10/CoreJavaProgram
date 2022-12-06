class A {
	int a = 10, b = 20, res;

	A() {
		res = a + b;
		System.out.println("Calling constructor");
	}

	public A(int n) {
		a = n;
		b = n;

	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		A obj = new A(5);

		System.out.println(obj.a);
		
	}

}
