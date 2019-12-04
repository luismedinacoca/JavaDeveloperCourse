public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Luis");
        System.out.println("");
        int myFirstNumber = (10 + 5) + (2 * 10);

        //CHALLENGE LECTURE 023
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("myFirstNumber: " + myFirstNumber);
        System.out.println("mySecondNumber: " + mySecondNumber);
        System.out.println("myThirdNumber: " + myThirdNumber);
        System.out.println("the total = myFirstNumber + mySecondNumber + myThirdNumber : " + myTotal);

        //2ND CHALLANGE FOR LECTURE 023
        int myLastOne = 1000 - myTotal;
        System.out.println("my last one is: " + myLastOne);
    }
}