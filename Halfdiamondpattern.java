// 2. Write a Program to Display below pattern
              *
	    * * *
	  * * * * *
	* * * * * * *
      * * * * * * * * *

Logic: 

package JavaTasks;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        int n = 5; // height

        // Upper half only
        for (int i = 1; i <= n; i++) {
            
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




/* Output:

              *
	    * * *
	  * * * * *
	* * * * * * *
      * * * * * * * * *

+/