package Mylearning_Java.ConditionalLogicLoops;

public class test_16 {
    public static void main (String[] args){

        System.out.println("The number 121 is Palindrome ? : " + isPalindrome(121) );
        System.out.println("The number -707 is Palindrome ? : " + isPalindrome(-707) );
        System.out.println("The number 11212 is Palindrome ? : " + isPalindrome(11212) );
        System.out.println("The number -121 is Palindrome ? : " + isPalindrome(-121) );

    }

    public static boolean isPalindrome (int number){

        boolean returnValue = false;
        int reverse = 0;
        int numberValue = number;

        if (number > 0){
            while (number> 0){

                int lastDigit = number % 10;
                reverse = reverse *10;
                reverse += lastDigit;
                number = number / 10;

            }

        } else {
            while (number < 0){

                int lastDigit = number % 10;
                reverse = reverse *10;
                reverse += lastDigit;
                number = number / 10;

                if (number == 0){
                    break;
                }
            }
        }

        if (numberValue == (-reverse)) {
            returnValue = true;

        } else if (numberValue == reverse) {
            returnValue = true;
        }


        return returnValue;

    }

}
