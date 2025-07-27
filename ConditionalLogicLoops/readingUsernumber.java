package Mylearning_Java.ConditionalLogicLoops;

import java.util.Scanner;

public class readingUsernumber {
    public static void main(String[] args){

        System.out.println(userInputAndOutput("5"));

    }

    public static String userInputAndOutput(String number){

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int totalSum = 0;

        do {

            try {
                System.out.println("Hi, Please Enter the Value for #" + (count));
                int variableValue = Integer.parseInt(scanner.nextLine());
                totalSum += variableValue;
                count++;
            } catch (Exception e){
                System.out.println("Invalid Number, please try again");
            }

        } while (count <= 5);


        return "Sum of Five Numbers " + totalSum ;
    }


}
