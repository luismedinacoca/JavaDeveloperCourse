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
    }
}
