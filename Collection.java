/* 	
1.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
*/

Logic:

package JavaTasks;


	import java.util.ArrayList;

	public class SumOfEvenNumbers {
	    public static void main(String[] args) {
	        
	        // Create ArrayList
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);
	        numbers.add(30);

	        int sum = 0;

	        // Calculate sum of even numbers
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                sum += num;
	            }
	        }

	        System.out.println("Sum of even numbers: " + sum);
	    }
	}

/* 

Output:

Sum of even numbers: 60

*/



