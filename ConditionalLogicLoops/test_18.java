package Mylearning_Java.ConditionalLogicLoops;

//Calculating The Sum Of All Even Digits In An Integer

public class test_18 {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(6));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(0));

    }

    public static int getEvenDigitSum(int number){
        int singleDigit = 0 ;
        int result = 0;

        if (number < 0){
            return -1;
        }

        while (true){
            if (number == 0){
                break;
            }

            singleDigit = number%10;
            if (singleDigit % 2 == 0){
                result += singleDigit;

            }

            number /= 10;
        }

        return result;

    }
}
