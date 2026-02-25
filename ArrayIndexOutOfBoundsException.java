/* 1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
[Hint: Use array and loop and try to access the element beyond the last index.] */

Logic:

package JavaTasks;

public class ArrayIndexOutOfBoundException {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Loop goes beyond last index
        for (int i = 0; i <= arr.length; i++) {   
            System.out.println("Element: " + arr[i]);
        }
    }
}

/* Output:

Element: 10
Element: 20
Element: 30
Element: 40
Element: 50
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at project1/JavaTasks.ArrayIndexOutOfBoundException.main(ArrayIndexOutOfBoundException.java:11)
*/