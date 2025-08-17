package Mylearning_Java.hello;

public class Hello1 {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposto happend");
        }

        if (isCar) { // This is short hand for checking if the isCar == true;
            System.out.println("This is not suppos to happen");
        }

        if (!isCar) { // This is a short hand for checking if the isCar != true;
            System.out.println("This is happend");
        }

        String makeOfCar = "Volkswagen" ;
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This Car is Domestic to our Country");
        }

        String s = (isDomestic) ? "This Car is Domestic" :"This Car is not Domestic";

        System.out.println(s);


        double myFristVariable = 20.00d;
        double mySecondVarible = 80.00d;
        double myValuesTotal = (myFristVariable + mySecondVarible) * 100;
        System.out.println("My value Total = " + myValuesTotal);

        double theRemainder = myValuesTotal % 40.00;
        System.out.println("My Remainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false ;
        System.out.println("is No Remainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("got some remainder");
        }

    }
    
}
