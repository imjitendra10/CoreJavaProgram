// Inheritance example 

class Emp {
	int bonus=20000;
	float salary=45000;
	void display() {
	System.out.println("Details of a user");
	}
}
	class User extends Emp{
		public static void main(String[] args) {
			User u= new User();
			u.display();

			System.out.println("Salary of a user:"+u.salary);
			System.out.println("Bonus of a user:"+u.bonus);
				}
	}

		
	
	
	
	


