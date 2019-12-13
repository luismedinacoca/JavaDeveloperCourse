public class Main {
    public static void main(String[] args) {
        /** always in simple quotes and accept just only one character*/
        // char myChar = 'LM'    ===> there will be an error
        // char myChar = "L"     ===> there will be an error
        char myChar = 'L'; //unicode: 0040C
        char myUnicode = '\u004C';
        System.out.println("My char is: " + myChar);
        System.out.println("My unicode is: " + myUnicode);
        // look for unicode-table.com
        char myCopyrightChar = '\u00A9';
        System.out.println("My copyright char is: " + myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        /**
         * We have seen byte, short, int, long, float, double, char and boolean and also STRING
         */

        String myString = "This is a string";
        System.out.println("myString is equal to "+ myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to "+ myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to "+ myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("There is not any calculation " + numberString);
        int myInt = 50;
        String lastString = "10";
        //lastString = lastString + myInt;
        System.out.println("myInt is equal to " + myInt);
        System.out.println("LastString is equal to " + lastString);
        System.out.println( lastString + myInt);
        System.out.println(myInt + lastString);

        int result = 1 + 2; //1 + 2 = 3
        /**
         * '=' assignment operator
         * '+' sum operator
         */
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("result: 3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

    }
}
