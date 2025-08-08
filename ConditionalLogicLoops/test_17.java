package Mylearning_Java.ConditionalLogicLoops;

// Adding The First And Last Digits Of An Integer

public class test_17 {
    public static void main(String[] args){

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int  sumFirstAndLastDigit (int number){
        if (number < 0){
            return -1;
        }

        int lastDigit = number % 10;

        while (true){
            if (number< 10){
                break;
            }

            number = number/10;

        }

        return lastDigit + number;
    }

}
