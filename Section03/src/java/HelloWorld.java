package java;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Luis");
        System.out.println("");
        int myFirstNumber = 54;
        /** int: type (Data type)
         *  myFirstNumber: name variable
         *  54: assigning or initializing the variable*/

        String myName; /** initializing could be omitted because it could be assigning later */

        // CHALLENGE: display myFirstNumber value:
        System.out.println("myFirstNumber");
        System.out.println(myFirstNumber);
        System.out.println("myFirstNumber" + myFirstNumber);
        System.out.println("the new variable named myFirstNumber is: " + myFirstNumber);
    }
}