package myproject2025_2;
import java.util.Scanner;
import java.util.*;

class Example2DArray
{
    
    int a[][]; //data member

    void Arrayinitialize(int [][]x)
    {
        a=x;     
    }
        void display()
        {
        
        System.out.println("\n the element are");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++)
            System.out.print(" "+a[i][j]);
        
        System.out.println();
        }
       
        }
}




public class Myproject2025_2 {

    public static void main(String[] args) {

        int i,n;
        System.out.println("\n enter the size of array");
        
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       
      int [][]y=new int[n][n];  
       
        System.out.println("\n enter the value of array ");
        for(i=0;i<y.length;i++){
            for(int j=0;j<y[0].length;j++)
            y[i][j]=in.nextInt();
        }
       /* System.out.println("\n the element are");
        for(i=0;i<n;i++)
            System.out.print(" "+a[i]);*/
        
        Example2DArray aobj=new Example2DArray();
        aobj.Arrayinitialize(y)
;
        //aobj.bubblesort();
        aobj.display();
        
        /*System.out.println("\n the element are");
        for(i=0;i<n;i++)
            System.out.print(" "+y[i]);*/
        
    }
}




package myproject2025_1;

import java.util.*;



class Calculator
{   
    
    int res; //data member
    int a,b;
    void Sum(int x,int y) // member function
    { 
        a=x;
        b=y;
    res=x+y;
    }
    void Sum(int x,float y){}
     void Sum(float x,float y){}
      void Sum(float x,int y){}
      void Sum(int x,int y,int z){}
    void sub(int x,int y)// member function
    {
        a=x;
        b=y;
    res=x-y;
    }
    void mult(int x,int y)// member function
    {  
        a=x;
        b=y;
res=x*y;
    }
    
    void div(int x,int y) // member function
    {
       a=x;
        b=y;
   res=x/y;
    }
    void result(int ch)
    {
    switch(ch)
    {
        case 1: System.out.println(a+"+"+b+"="+res);
                break;
        case 2:System.out.println(a+"-"+b+"="+res);
              break;
        case 3:System.out.println(a+"*"+b+"="+res);
                break;
        case 4:System.out.println(a+"/"+b+"="+res);
               break;
    }
    }
}


//5+12=27
//5-12=-7



public class Myproject2025_1 {
    
    
    
    
    public static void main(String[] args) {
    
        int a=0,b=0,ch;
        float x=(float)4.5,y=(float)3.5;
        Scanner in=new Scanner(System.in);
        
        Calculator obj=new Calculator();          
       
        while(true){
        System.out.println("\n =====Menu:======");
        System.out.println("\n 1: Sum \n 2: sub \n 3: mult \n 4: div \n 5: exit \n Enter your choice");
        ch=in.nextInt();
        
        if(ch>0&&ch<5){
         System.out.println("\n enter the two no");
         System.out.println(" "+4+5);
       a= in.nextInt();
       b= in.nextInt();
        }
  
 switch(ch)
 {
     case 1:    obj.Sum(a, b);
                obj.Sum((float)5.5,4 );
                obj.Sum(x,y);
                obj.result(ch);
                break;
     case 2: obj.sub(a, b);
             obj.result(2);
             break;
             
     case 3:  obj.mult(a, b);
             obj.result(3);
              break;
     case 4:obj.div(a,b);
           obj.result(4);
       break;
     case 5: System.exit(0);
 
 default:System.out.println("\n your choice is wrong");
 }
    }
    }
}