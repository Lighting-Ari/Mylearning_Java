package Mylearning_Java.ConditionalLogicLoops;

import java.util.Scanner;

public class getUserInput {
    public static void main (String[] args){

        try {
            System.out.println(getInputFromConsole(2025));
        } catch (Exception e) {
            System.out.println(getInputFromScaner(2025));
        }

    }
    public static String getInputFromConsole(int currentYear){
        String userName = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + userName + " , Thanks for sharing your name");

        String dateOfBirth = System.console().readLine("What year you are born ? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScaner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name+ ", Thanks for sharing your name");

        System.out.println("What year your are born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Year of birth should be >= " + (currentYear-125) + " and <= " + currentYear );

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = (age< 0) ? false: true;
            } catch (Exception e) {
                System.out.println("Invalid Input. Characters are not allowed");
            }


        } while (!validDOB);

        return "So you are " + age + " year old";

    }

    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear- 125;

        if ((dob< minimumYear) || (dob > currentYear)){
            return -1;
        }

        return  (currentYear - dob);
    }


}
