package Mylearning_Java.ConditionalLogicLoops;
// Deriving The Greatest Common Divisor (GCD) Efficiently


public class test_22 {
    public static void main (String[] args){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }
    public static int getGreatestCommonDivisor(int first, int second){

        int tempThree = 0;
        if ((first < 10) || (second <10)){
            return  -1;
        }

        for (int i = 1; i<= first/2; i++){
            if (first % i == 0){

                for (int j = 1; j<= second; j++ ){
                    if (second % j == 0){

                        if (i==j){
                            tempThree = j;

                        }

                    }


                }
            }
        }


        return tempThree;

    }

}
