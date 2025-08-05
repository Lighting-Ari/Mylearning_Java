package Mylearning_Java.ConditionalLogicLoops;

public class test_13 {
    public static void main (String[] args) {

       printNumberInWord(1);
       printNumberInWord(9);
       printNumberInWord(10);
       printNumberInWord(-1);

    }

    public static void printNumberInWord (int number){
        String result = switch (number){
            case 0-> "ZERO" ;
            case 1 -> "ONE" ;
            case 2 -> "TWO" ;
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER" ;
        };
        System.out.println(result);

    }
}
