package Mylearning_Java;
import java.util.Date;

//inheritance

abstract class Account4262025 {



public String ac_no,ach_name;
Date dob;
double amt;
 
    public Account(String an,String achn,Date db,double amt) {
     ac_no=an;
    ach_name= achn;
    dob=db;
    this.amt=amt;
    }


void close_acc(){}
void check_balance(){}
abstract void withdral();
void deposit(double amt){this.amt=this.amt+amt;}

}


class SavingsAcc extends Account{    
    SavingsAcc(String an,String achn,Date db,double amt)
    {
    super(an, achn, db, amt);
    }
    double cal_int,amt;
void int_calculate(){


}
void withdral(){}
}




public class Inheritance25 {

    public static void main(String[] args) {

        
       // SavingsAcc obj=new SavingsAcc(); // passing account details value
    }
}

