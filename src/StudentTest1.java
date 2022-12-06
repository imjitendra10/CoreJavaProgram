// Parametrized constructor

class StudentTest1 {
	int id;
		String name;
		int rollno;
		void insert(int i, String n, int r) {
			id = i;
			name = n;
			rollno = r;
		}
			void display() {
			System.out.println(id+" "+name+" "+rollno);
			}
// class Test1{
			 public static void main(String[] args) {
				 StudentTest1 s1= new StudentTest1();
				 StudentTest1 s2= new StudentTest1();
				
				 s1.insert(1,"Jitendra",10);
				 s2.insert(2,"Sk",20);
				 s1.display();
				 s2.display();
			 
				
			}
		 }
 

