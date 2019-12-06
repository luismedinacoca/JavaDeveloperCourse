package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int myValue = 10000;

        // minimun and maximun in integers:
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        //display in console:
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);

        //busted integer numbers:
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value: " + (myMinIntValue - 1));

         //int myMaxIntTestValue = 2147483648;
    }
}
