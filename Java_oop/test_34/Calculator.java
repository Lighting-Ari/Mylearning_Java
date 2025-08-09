package Mylearning_Java.Java_oop.test_34;

public class Calculator {

    Floor floor;
    Carpet carpet;

    public Calculator (Floor floor, Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost (){
        double area = floor.getArea();
        double cost = carpet.getCost();
        return area * cost ;
    }

}
