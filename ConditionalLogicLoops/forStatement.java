package Mylearning_Java.ConditionalLogicLoops;

public class forStatement {
    public static void main (String[] args){

        for ( double rate = 7.5; rate <= 10; rate++){
            double interestAmount = calculateInterest(100.0,rate);
            //System.out.println("10,000 at " + (rate/4) + "% interest = " + interestAmount);
        }

        for (double i =7.5; i < 10; i += 0.25 ){
            double interestAmount = calculateInterest(100.0,i);

            if (interestAmount > 8.5){ break; }

            System.out.println("100 at " + i + "% interest = $ " + interestAmount);


        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

}
