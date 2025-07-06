package Mylearning_Java.ConditionalLogicLoops;

public class calculatePrimeNumber {
    public static void main (String[] args){
        isPrinting(0);
        isPrinting(1);
        isPrinting(-2);
        isPrinting(2);
        isPrinting(3);
        isPrinting(8);
        isPrinting(17);

    }

    public static void isPrinting (int inputValue){
        System.out.println("The number " + inputValue + " is " +
             ( (isItPrime(inputValue))? "a Prime Number" : "Not a Prime Number" ) );
    }


    public static boolean isItPrime (int wholeNumber) {

        if ( wholeNumber <=0){
            return false;
        }

        if (wholeNumber <= 2){
            return wholeNumber == 2;
        }

        for (int divisor = 2; divisor <= wholeNumber/2; divisor++){

            if ( wholeNumber% divisor == 0){
                return false;
            }
        }


        return true ;
    }
}
