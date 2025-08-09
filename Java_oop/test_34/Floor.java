package Mylearning_Java.Java_oop.test_34;

public class Floor {
    private double width , length;

    public Floor (double width, double length){

        if (width<= 0){
            this.width=0;
            this.length = length;
        } else if (length <= 0) {
            this.width = width;
            this.length = 0;
        } else {
            this.width =width;
            this.length = length;
        }
    }

    public double getArea(){
        return width*length;
    }

}
