package Mylearning_Java.ConditionalLogicLoops;

//Converting Digits Into Words And Handling Edge Casess

public class test_24 {
    public static void main(String[] args){

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(123));
        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(1450);
        numberToWords(900);







    }

    public static void numberToWords(int number){

        int lastNumber = 0;
        int temp = number;

        number = reverse(number);
        int difference = getDigitCount(temp)-getDigitCount(number);

        if (number<0){
            System.out.println("Invalid Value");
        }

        while (number>=0){

            lastNumber = number%10;

            switch (lastNumber){
                case 1 -> System.out.print("One");
                case 2 -> System.out.print("Two");
                case 3 -> System.out.print("Three");
                case 4 -> System.out.print("Four");
                case 5 -> System.out.print("Five");
                case 6 -> System.out.print("Six");
                case 7 -> System.out.print("Seven");
                case 8 -> System.out.print("Eight");
                case 9 -> System.out.print("Nine");

                default -> System.out.print("Zero");

            };

            System.out.print(" ");



            number /= 10;

            if (number == 0){
                if (difference!= 0){
                    while (difference >0){
                        System.out.print("Zero ");
                        difference--;
                    }
                }
                break;
            }

        }
        System.out.print(" ");

    }



    public static int getDigitCount(int number) {
        int countOfDigit = 0;

        if (number < 0) {
            return -1;
        }

        while (true){

            int lastDigit = number % 10;
            number /= 10;
            countOfDigit += 1;

            if (number == 0){
                break;
            }

        }

        return countOfDigit;
    }

    public static int reverse (int number){
        int numberValue = number;

        int reverse = 0;

        while (true){

            int lastDigit = number % 10;
            reverse = reverse *10;
            reverse += lastDigit;

            number /= 10;

            if (number == 0){
                break;
            }

        }


        if (numberValue == (-reverse)) {
            return -reverse;

        } else {
            return reverse;
        }


    }
}
