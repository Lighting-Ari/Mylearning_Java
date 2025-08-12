package Mylearning_Java.ConditionalLogicLoops;

public class test_26 {
    public static void main (String[] args){

        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                if (number == 1) {
                    return i;
                }
            }
        }

        return -1;
    }

}
