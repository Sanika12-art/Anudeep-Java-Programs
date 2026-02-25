// 2.Create program for Custom Exception.

Logic:

package JavaTasks;

// Create Custom Exception class
class MyException extends Exception {

    // Constructor to pass message to parent Exception class
    MyException(String msg) {
        super(msg);
    }
}

// Main class
public class CustomException {

    public static void main(String[] args) {

        try {
            // Manually throw custom exception
            throw new MyException("This is my custom exception");
        } 
        catch (MyException e) {
            //  Catch and print exception message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/* Output:

Exception caught: This is my custom exception

*/
