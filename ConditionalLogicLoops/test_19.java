package Mylearning_Java.ConditionalLogicLoops;

//Checking For A Shared Digit Between Two Numbers

public class test_19 {
    public static void main (String[] args){
        System.out.println(hasSharedDigit(100, 10));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(10, 13));
        System.out.println(hasSharedDigit(-12, 0));
        System.out.println(hasSharedDigit(0, 0));


    }

    public static boolean hasSharedDigit (int firstNumber, int secondNumber){
        if ((firstNumber< 10 || firstNumber > 99) || (secondNumber < 10 ||secondNumber > 99) ){
            return false;
        }
        int digitOne = firstNumber / 10;
        int digitTwo = firstNumber % 10;

        int digitThree = secondNumber/10;
        int digitFour = secondNumber % 10;

        if ((digitOne == digitThree) || (digitTwo == digitFour)){
            return true;
        } else if ((digitOne == digitFour) || (digitTwo == digitThree)) {
            return true;
        } else {
            return false;
        }

    }


}
