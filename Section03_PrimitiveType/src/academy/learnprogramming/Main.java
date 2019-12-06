package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        /** Integer and int: Maximun and minimum */
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

        int myMaxIntTest = 2_147_483_647;
        //int myMaxIntTestValue = 2147483648;

        /** byte: Maximun and minimum */
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte Minimum Value = " + myMinByteValue);
        System.out.println("byte Maximum Value = " + myMaxByteValue);

        /** short: Maximun and minimum */
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value = " + myMinShortValue);
        System.out.println("short Maximum Value = " + myMaxShortValue);

        /** Long: Maximun and minimum */
        long myLongValue = 100L;
        System.out.println("A long value");
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        //long bigLongLiteralValue = 2_147_483_647_234; (it considered as a integer... letter L is missing)
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        // byte myNewByteValue = (myMinByteValue / 2); ===> it's considered as a integer
        byte myNewByteValue = (byte)(myMinByteValue / 2);  /** casting process*/
        System.out.println(myNewByteValue);

        // short myNewShortValue = (myMinShortValue / 2); ===> it's considered as a integer
        short myNewShortValue = (short)(myMinShortValue / 2);  /** casting process*/
        System.out.println(myNewShortValue);

        //Challenge - Section03_Lecture027
        /**Your challenge is to create a byte variable and set it to any valid byte number, it doesn't matter.
         * Create a short variable and set it yo any valid short number.
         * Create an int variable and set it to any valid int number.
         * Lastly, create a variable of type long and make it equal to 50000 plus
         * 10 times the sum of the byte plus the short plus the integer values.*/
        byte  newByteNumber = -122;
        short newShortNumber = 30760;
        int newIntNumber = 45689;
        long newLongNumSum = 50000L + 10L * (newByteNumber + newShortNumber + newIntNumber);
        System.out.println("the long number which is sum: " + newLongNumSum);
    }
}