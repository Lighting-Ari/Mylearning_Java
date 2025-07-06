package Mylearning_Java.ConditionalLogicLoops;

public class challange_62 {
    public static void main (String[] args) {
        int count = 0;

        for (int i = 10; count < 3 && i <= 50; i++){
            if (isItPrime(i)){
                System.out.println("number " + i + " is a prime number");
                count ++;
            }
        }

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
