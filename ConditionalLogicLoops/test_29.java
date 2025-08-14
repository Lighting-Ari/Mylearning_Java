package Mylearning_Java.ConditionalLogicLoops;

//Efficient Paint Job Planning With Bucket Calculations

public class test_29 {

    public static void main(String[] args){
        System.out.println(getBucketCount(0.75, 0.75,0.5, 0));
        System.out.println(getBucketCount(3.4, 2.1,1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25,2.5, 1));

        System.out.println(" ");

        System.out.println(getBucketCount(-3.4,2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

    }

    public static int getBucketCount (double width, double height, double areaPerBuckets, int extraBuckets){

        if ( width <= 0 || height <= 0|| areaPerBuckets<= 0 || extraBuckets < 0 ){
            return -1;
        }
        int requiredBuckets = getBucketCount(width, height, areaPerBuckets);

        return requiredBuckets-extraBuckets;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        if ( width <= 0 || height <= 0|| areaPerBucket<= 0 ){
            return -1;
        }

        return getBucketCount((width*height), areaPerBucket) ;

    }

    public static int getBucketCount (double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        return (int) (Math.ceil(area/areaPerBucket));

    }


}
