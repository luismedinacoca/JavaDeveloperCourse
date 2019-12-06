package academy.learprogramming;

public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        System.out.println();

        int myIntValue = 5;
        //float myFloatValue = 5.25; >>>> it's getting an error
        float myFloatValue = 5f;
        double myDoubleValue = 5.0;

        float myNewFloatValue2 = (float) 5.25;  //casting to float with the letter 'f' after the number
        System.out.println(myNewFloatValue2);
        System.out.println("");

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyIntValue / 3 = " + myIntValue / 3);
        System.out.println("Non precision: 0 decimal digit");
        System.out.println();

        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyFloatValue / 3 = " + myFloatValue/3);
        System.out.println("Simple precision: 7 decimal digits");
        System.out.println();

        System.out.println("MyDoubleValue = " + myDoubleValue);
        System.out.println("MyDoubleValue / 3 = " + myDoubleValue/3);
        System.out.println("Double precision: 16 decimal digits");


        /**CHALLENGE - Section 03 Lecture 029:
         *
         * Convert a given number of pounds to kilograms:
         * STEPS:
         * 1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms
         * 2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store
         *    the result in a 2nd appropriate variable.
         * 3. Print out the result
         *
         * HINT: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.*/

        double numberOfPounds = 154.5d;
        double convertedKilograms = numberOfPounds * 0.45359237f;
        System.out.println(numberOfPounds + " pounds is equal to " + convertedKilograms + " kilograms");
    }
}
