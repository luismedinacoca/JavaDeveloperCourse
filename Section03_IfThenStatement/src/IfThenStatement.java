public class IfThenStatement {
    public static void main(String[] args) {
        /** LECTURE 34 - If and Then statement*/
        boolean isAlien = false; //one single equal sign
        if (isAlien == false) { // there are two equal sign
            System.out.println("It's not an alien");
        }

        if (isAlien == true) ; // close the conditional or the logical assessment
        System.out.println("It's not an alien********** it displays this message!");

        if (isAlien == false) //it's not closed the conditional assessment
            System.out.println("It's not an alien**********");

        if (isAlien == true) //it's not closed the conditional assessment
            System.out.println("It's not an alien!!");

        if (isAlien == true) //it's not closed the conditional assessment
            System.out.println("It's not an alien!!!!!!!!!!");
        System.out.println("and I am scared of Aliens");

        if (isAlien == false){ //it's not closed the conditional assessment
            System.out.println("Alieeeeeeeeennnnnnnnnnssss");
            System.out.println("and I am scared of Aliens");
        }

        /** LECTURE 35 - Logical AND Operator*/
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        /** LECTURE 36. Logical OR Operator*/
        if ((topScore < 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        /**LECTURE 37 - Assigment Operator VS Equals to operator*/

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar =false;
        if (isCar = true){ //new assignment in this variable - On bolean variables only!
            System.out.println("This is not supposed to happen");
        }

        /** LECTURE 38 - Ternary Operator */

        //isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        int ageOfClient = 17;
        String isEightieeenOrOver = (ageOfClient == 20) ? "S/he is an adult" : "s/he is not an adult";
        System.out.println(isEightieeenOrOver);

        /** LECTURE 39 - Operator Challenge */

        /**
         1. Create a double variable with a value of 20.00.
         2. create a second variable of type double with the value 80.00.
         3. Add both numbers together and multiply by 100.00.
         4. Use the remainder operator to figure out what the reminder from the result of the operation in steps 3 and 40.00.
            we used the modulus or remainder operator on int's in the course, but we can also use it on a double.
         5. create a boolean variable that assign the value true if the remainder is #4 is 0, or false if its not zero.
         6. Output the boolean variable.
         7. Write an if-then statement that displays a message "Got some remainder" if the boolean is step 5 is not true.
            Don't be surprised if you see output for this step, where you might expect it not to show. I'll explain it in my solution.*/

        double myDoubleValue = 21;
        double mySecondDoubleValue = 80;
        double theDoubleValue = (myDoubleValue + mySecondDoubleValue) * 100;
        double remainder = theDoubleValue % 40;
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println(remainder);
        System.out.println("The result: " + isZero);
        if (isZero == false){
            System.out.println("Got some remainder!");
        }


    }
}
