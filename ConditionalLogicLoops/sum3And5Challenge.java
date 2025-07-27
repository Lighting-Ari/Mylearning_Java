package Mylearning_Java.ConditionalLogicLoops;

public class sum3And5Challenge {
    public static void main (String[] args){
        int totalSum=0;
        int count = 0;
        for (int i = 1; i<= 1000; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print( i +" ");
                totalSum += i;
                count++;
            }

            if (count>4) {
                break;
            }

        }

        System.out.println(" ");
        System.out.println("Total Sum of the numbers that met the condition is " + totalSum);


    }
}
