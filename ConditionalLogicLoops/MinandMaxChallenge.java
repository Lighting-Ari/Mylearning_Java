package Mylearning_Java.ConditionalLogicLoops;

import java.util.Scanner;

public class MinandMaxChallenge {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double minimumNumber = 0;
        double maximumNumber = 0;

        while (true){
            System.out.println("Please Enter Number to Continue " +
                    "or Enter character to quite");
            String userInput= scanner.nextLine();

            try {
                double inputNumber= Double.parseDouble(userInput);

                if (inputNumber< minimumNumber){
                    minimumNumber = inputNumber;
                } else if (inputNumber > maximumNumber) {
                    maximumNumber = inputNumber;
                }

            } catch (NumberFormatException nfx){
                break;
            }


        }

        System.out.println("User Entered Minimum Number " +
                minimumNumber+ " User Entered Maximum Number "+ maximumNumber);
    }
}
