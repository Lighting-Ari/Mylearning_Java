package Mylearning_Java.ConditionalLogicLoops;

public class neClass2 {
    public static void main (String[] args){

        printOfTheDay(0);
        printOfTheDay(1);
        printOfTheDay(2);
        printOfTheDay(3);
        printOfTheDay(4);
        printOfTheDay(5);
        printOfTheDay(6);
        printOfTheDay(7);

        System.out.println(" ");

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(-1);


    }

    public static void printOfTheDay(int day){

        String dayOfTheWeek;

        dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " is " + dayOfTheWeek);
    }

    public static void printWeekDay(int day){
        String dayOfTheWeek;



        if (day == 0){
            dayOfTheWeek = "Sunday";
        } else if (day == 1){
            dayOfTheWeek = "Monday";
        } else if (day == 2) {
            dayOfTheWeek = "Tuesday";
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
        } else if (day == 4) {
            dayOfTheWeek = "Thursday";
        } else if (day == 5) {
            dayOfTheWeek = "Friday";
        } else if (day == 6) {
            dayOfTheWeek ="Saturday";
        } else {
            dayOfTheWeek = "Invalid Day";
        }
        System.out.println(day + " is " + dayOfTheWeek);

    }


}
