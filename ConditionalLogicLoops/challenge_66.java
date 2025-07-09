package Mylearning_Java.ConditionalLogicLoops;

public class challenge_66 {
    public static void main(String[] args){
        int startingNumber = 4;
        int endingNumber =20;

        int i = startingNumber;
        int countEvenNumbers = 0;
        int countOddNumbers = 0;

        while (true) {

            if (isEvenNumber(i)){
                System.out.println(i+ " Is a Even Number");
                countEvenNumbers ++;
            } else {
                countOddNumbers ++;
            }
            if (countEvenNumbers > 5){
                break;
            }
            i ++;

        }

        System.out.println("Total number of Even is " +countEvenNumbers + " and total number of Odd is " + countOddNumbers);

    }
    public static boolean isEvenNumber (int checkNumber){

        return checkNumber%2 ==0;
    }
}
