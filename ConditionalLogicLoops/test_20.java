package Mylearning_Java.ConditionalLogicLoops;
// Evaluating The Last Digit For Multiple Integer Comparisons

public class test_20 {
    public static void main (String[] args){
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(15, 9, 20));
        System.out.println(hasSameLastDigit(22, 23, 34));
        System.out.println(hasSameLastDigit(10, 10, 10));
        System.out.println(hasSameLastDigit(1000, 1000, 1000));

    }

    public static boolean isValid(int number){

        return (number > 9 && number < 1001);

    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree){

        boolean validation = (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree));
        if (!validation){
            return false;
        }

        return (numberOne% 10 == numberTwo % 10) || (numberOne % 10 == numberThree % 10) || (numberTwo % 10 == numberThree % 10);
    }
}
