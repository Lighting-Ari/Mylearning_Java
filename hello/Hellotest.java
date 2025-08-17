package Mylearning_Java.hello;

public class Hellotest {

    public static void main (String[] arg ){

        double fristVariable , secondVariable , total, result;

        fristVariable = 20.00d;
        secondVariable = 80.00d;
        total = ( fristVariable + secondVariable ) * 100.00;

        result = total % 40.00;

        boolean checkVariable = result == 0 ? true : false ;

        if (!checkVariable) {
            System.out.println("got some remainder");            
        }
        



    }
}
