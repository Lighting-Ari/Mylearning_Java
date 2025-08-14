package Mylearning_Java.ConditionalLogicLoops;

import java.util.Scanner;

// Interactive Summation And Average Calculator From User Input

public class test_28 {

    public static void main (String[] args){
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double temp = 0;

        while (true){

            String userInput= scanner.nextLine();

            try {
                temp += Double.parseDouble(userInput);
                sum += Integer.parseInt(userInput);
                count ++;
            } catch (NumberFormatException nfx){
                break;
            }

        }

        System.out.println("SUM = " + (sum) + " AVG = " + (long) ( Math.round (temp/count)));

    }
}
