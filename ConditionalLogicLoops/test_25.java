package Mylearning_Java.ConditionalLogicLoops;

// Managing Flour Pack Requirements With Limited Bucket Sizes

public class test_25 {
    public static void main(String[] args){
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(5,3,24));
        System.out.println(canPack(6,2,17));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int maxBigBagsUsable = Math.min(goal / 5, bigCount);
        int remaining = goal - (maxBigBagsUsable * 5);
        return smallCount >= remaining;
    }
}
