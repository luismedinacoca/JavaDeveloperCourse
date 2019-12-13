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


    }
}
