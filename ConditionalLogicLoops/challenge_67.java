package Mylearning_Java.ConditionalLogicLoops;

public class challenge_67 {
    public static void main(String[] args) {

        System.out.println(sumDigit(125));
        System.out.println(sumDigit(1000));
        System.out.println(sumDigit(5));
        System.out.println(sumDigit(-125));

    }

//    public static int sumDigit (int number) {
//
//        int sumOfDigit=0;
//
//        if (number < 0){
//            return  -1;
//        }
//        while (number > 9) {
//            sumOfDigit += (number % 10);
//            number = number / 10;
//
//        }
//        sumOfDigit += number;
//        return sumOfDigit;
//    }


  public static int sumDigit (int number) {

        int sumOfDigit=0;
        int calculation = number;

        if (number < 0){
            return  -1;
        } else if (number <= 9){
            return number;
        } else {

            while (calculation > 0) {
                sumOfDigit += (calculation % 10);
                calculation = calculation / 10;

            }
        }

        return sumOfDigit;
    }
}
