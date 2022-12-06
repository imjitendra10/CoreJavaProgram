// Types of Inheritance example

class Animal {
	void eat() {
		System.out.println("Dog is eating.");
	}
}
	class Dog extends Animal{ // Single level
		void bark() {
			System.out.println("Dog is barking.");
		}
	}
	class Tiger extends Dog{  // Multilevel 
		void roar(){
			System.out.println("Tiger is roaring.");
		}
	}
		class User1{
			public static void main(String[] args) {
				Tiger d= new Tiger();
				
				d.eat();
				d.bark();
				d.roar();
				System.out.println("Behaviour of Dog.");
				
				
			}
		}
		
	


