package Mylearning_Java.ConditionalLogicLoops;

public class test_15 {
    public static void main (String[] args){

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

            }

    public static boolean isOdd(int number){
        return ( number >0 && number % 2 != 0);
    }

    public static int sumOdd(int startingNumber, int endingNumber) {
        int sumOfOddNumber = 0;

        if (startingNumber <= 0 || endingNumber <= 0 || endingNumber < startingNumber) {
            return -1;
        } else {
            for (int i = startingNumber; i <= endingNumber; i++) {
                if (isOdd(i)) {
                    sumOfOddNumber += i;
                }
            }
        }

        return sumOfOddNumber;
    }


}
