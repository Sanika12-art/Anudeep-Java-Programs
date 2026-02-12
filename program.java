// 1. Write a program for Default Constructor.

Logic:

package project1;

public class Main {
	
	// Default Constructor
	Main() {
		System.out.println("Default Constructor");
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
	}
}

/* Output:
  
   Default Constructor
*/


// 2. Write a program for parameterized Constructor.

Logic: 

package project1;

public class Student {
	
	// Parameterized Constructor
	Student(int id, String name) {
		System.out.println("ID:" + id);
		System.out.println("Name:" + name);
	}
	
	public static void main(String[] args) {
		Student s = new Student(101, "Sanika");
		
	}

}

/* Output: 

   ID:101
Name:Sanika

*/

