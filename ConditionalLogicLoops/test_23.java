package Mylearning_Java.ConditionalLogicLoops;

// Confirming Perfect Numbers Through Sum Of Proper Divisors

public class test_23 {
    public static void main (String[] args){
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber (int number){

        int tempNumber = 0;

        for (int i= 1; i< number; i++ ){
            if (number % i == 0){
                tempNumber += i;
            }
        }

        return (number > 1) && (tempNumber == number);
    }
}
