// package Java_language.Mylearning_Java;

// public class MyCode {
    
// }


// avarage of 4 numbers
// class MyCode
// {
// public static void main(String []arg)
// 	{ 
// 	int a, b, c, d, e;
// 	a = Integer.parseInt(arg[0]);
// 	b = Integer.parseInt(arg[1]);
// 	c = Integer.parseInt(arg[2]);
// 	d = Integer.parseInt(arg[3]);
	
// 	e=(a+b+c+d)/4;
	

// 	System.out.println("\n Avarage of 4 Number is = "+e);
	
	
//     }
// }


// //  Swap 2 numbers without using  3rd variable 
// class MyCode

// {
//     public static void main(String arg[])
//     {
//         int a, b;
//         a = Integer.valueOf(arg[0]);
//         b = Integer.valueOf(arg[1]);

//         System.out.println(a);
//         System.out.println(b);

//         a= a+b; 
//         b=a-b; 
//         a=a-b;

//         System.out.println(a);
//         System.out.println(b);


    
//     }

// }



// // Print numbers up to n
// class MyCode
// {
//     public static void main(String arg[])
//     {
//         int i, n, s;
//         n = Integer.valueOf(arg[0]);
//         i= 1;
//         s = 0;

//         while (i<=n) 
//         {
//             System.out.println(i);
//             i++;
//         }


//     }
// }

// // Print even numbers up to n
// //  Sum of even numbers up to n
// class MyCode
// {
//     public static void main(String arg[])
//     {
//     int i, n, s;

//     n = Integer.valueOf(arg[0]);
//     i = 1;
//     s= 0;

//     while (i<=n) 
//     {
//         if (i%2==0) 
//         {
//             s=s+i;
//             i++;     }

//         else
//         i++;
//                     }
//     System.out.println(s);

//     }

// }


// //  Factorial of a number 
// class MyCode{
//     public static void main(String arg[])
//     {
//         int i, n, s;

//         n= Integer.valueOf(arg[0]);
//         i= 1;
//         s= 1;

//         while (i<=n) {
//             s = i*s;
//             i++;            
//         }
//         System.out.println(s);


//     }

// }


// //  Factorial of a number 
// // Sum of divisor of a number  
// class MyCode{
//     public static void main(String arg[])
//     {
//         int i, n, t;

//         n= Integer.valueOf(arg[0]);
//         i= 1;
//         t= 0;
        
//         while (i<=n/2) {
            
//             if (n%i==0) {
//                 t=t+i;
//                 System.out.print("Factorial of a number " +n);
//                 System.out.println(" is = " +i);
//                 i++;                
//             }
//             else
//             i++;
//         }
//         System.out.println("Sum of divisor of a number = " +t);
//     }
// }






// class MyCode{
//     public static void main(String arg[])
//     {
//         int i, n, s;

//         n= Integer.valueOf(arg[0]);
//         i= 1;
//         s= 0;
        
//         while (i<=n) {
            
//                 s=s+i;
                
//                 System.out.print(i +"+");
//                 i++;
//         }
//         System.out.println("= " +s);
//     }
// }



/*// partten
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
class MyCode{
    public static void main(String arg[])
    {
        int i, n, j;

        n= Integer.valueOf(arg[0]);
        i= 1;
        j= 1;
        
       for (i=1;i<=n;i++) {

            for (j=1;j<n;j++) {
                System.out.print(" "+j);
                
                
            }
            System.out.println();
        }
    }
}*/

/*
// pattren
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

class MyCode{
    public static void main(String arg[])
    {
        int i, n, j;

        n= Integer.valueOf(arg[0]);
        
       for (i=1;i<=n;i++) {

            for (j=1;j<=i;j++) {
                System.out.print(" "+j);
                
                
            }
            System.out.println();
        }
    }
}
     */
 

/*
// pattren
*
**
***
****
*****
class MyCode{
    public static void main(String arg[])
    {
        int i, n, j;

        n= Integer.valueOf(arg[0]);
        i= 1;
        j= 1;
        
       for (i=1;i<=n;i++) {

            for (j=1;j<=i;j++) {
                System.out.print("*");             
            }
            System.out.println();
        }
    }
}
     */



// pattren
// 2
// 44
// 666
// 8888
// 1010101010
// 121212121212
/*class MyCode{
    public static void main(String arg[])   
    {
        int i, n, j;

        n= Integer.valueOf(arg[0]);
        
       for (i=1;i*2<=n;i++) {


            for (j=1;j<=i;j++) {
                
                    System.out.print(" "+i*2); 
                
            }
            System.out.println();
        }
    }
}*/


/*
1
12
123
1234
12345
class MyCode{
    public static void main(String arg[])   
    {
        int i, n, j;

        n= Integer.valueOf(arg[0]);
        
       for (i=1;i<=n;i++) {


            for (j=1;j<=n-i;j++) 
                
                    System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print(j);    
            System.out.println();
        }
    }
}
     */


/*
1
12
123
1234
12345
 
import java.io.DataInputStream;
class MyCode{
    public static void main(String arg[])  throws Exception 
    {
        int i, n, j;
DataInputStream in=new DataInputStream(System.in);
      
System.out.println("enter the number");
n=Integer.parseInt(in.readLine());
        
       for (i=1;i<=n;i++) {


            for (j=1;j<=n-i;j++) 
                
                    System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print(j);    
            System.out.println();
        }
    }
}
    */

/* 

    1
    12
   123
  1234
 12345


import java.io.DataInputStream;
class MyCode{
    public static void main(String arg[])  throws Exception 
    {
        int i, n, j,p;
DataInputStream in=new DataInputStream(System.in);
      
System.out.println("enter the number");
n=Integer.parseInt(in.readLine());
        
       for (i=1;i<=n;i++) {


            for (j=1;j<=n-i;j++) 
                
                    System.out.print(" ");
            for(p=1;p<=i;p++)
            System.out.print(p);    
            System.out.println();
        }
    }
}
*/




//      *
//     ***
//    *****
//   *******
//  *********

/*
    import java.io.DataInputStream;
    class MyCode{
        public static void main(String arg[])  throws Exception 
        {
            int i, n, j,s;
    DataInputStream in=new DataInputStream(System.in);
          
    System.out.println("enter the number");
    n=Integer.parseInt(in.readLine());

           for (i=1;i<=n;i++) {              // for the row
                for (j=1;j<=n-i;j++) // for priting space
                        System.out.print(" ");

                for(s=1;s<=(2*i-1);s++) // Printing stars
                System.out.print("*");    

                System.out.println();
            }
        }
    }

*/



// Pattren 
// ****
// ****
// ****
// ****
/*
    import java.io.DataInputStream;
    class MyCode {
    public static void main(String arg[]) throws Exception
        {
    int i,j, n , s;
    DataInputStream in = new DataInputStream(System.in);

    System.out.println("Please  Enter an Input");
        n = Integer.valueOf(in.readLine());

        for (i=1; i<=n;i++ ) {

            for (j=1; j<=n; j++)
            System.out.print("*");


            // for (s=1; s<=n; s++){   
            // System.out.print("*");

            //   for (j=2; j<=i; j=j+2)                              // for space
            //   {  System.out.print(" ");        
            // }
            System.out.println();
        }

    }
        
    } */


    /*
    import java.io.DataInputStream;
    class MyCode {
    public static void main(String arg[]) throws Exception
        {
    int i,j, n , s;
    DataInputStream in = new DataInputStream(System.in);

    System.out.println("Please  Enter an Input");
        n = Integer.valueOf(in.readLine());
        s= 0;

        for (i=1; i<=n; i++ ) {

            
            for (j=1; j<=(n-s); j++){
            System.out.print("*");
                s++;
            

        }


            // for (s=1; s<=n; s++){   
            // System.out.print("*");

            //   for (j=2; j<=i; j=j+2)                              // for space
            //   {  System.out.print(" ");        
            // }
            System.out.println();
        }

    }
        
    }
     */



     /*
     11111
     22222
     33333
     44444
     55555


    import java.io.DataInputStream;
    class MyCode {
    public static void main(String arg[]) throws Exception
        {
    int i,j, n , s;
    DataInputStream in = new DataInputStream(System.in);

    System.out.println("Please  Enter an Input");
        n = Integer.valueOf(in.readLine());
        s= 0;

        for (i=1; i<=n; i++ ) {  // row when i is less than or equal to n it will be true.

            for (j=1; j<=n; j++) // collum when j is less than or equal to n it will be true.
            System.out.print(""+i); // print the row number

            System.out.println(); // print new line
        }

    }
        
    }
 */



// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE

/*   

    import java.io.DataInputStream;
    class MyCode {
    public static void main(String arg[]) throws Exception
        {
    int i,j, n , s;
    DataInputStream in = new DataInputStream(System.in);

    System.out.println("Please  Enter an Input");
        n = Integer.valueOf(in.readLine());
        s= 0;

        for (i=1; i<=n; i++ ) {

            for (j=1; j<=n; j++)
            System.out.print(""+j);

            System.out.println();
        }

    }
        
    }

     */



/*
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE

import java.io.DataInputStream;
class MyCode {
public static void main(String arg[]) throws Exception
    {
int i,j, n , s;
DataInputStream in = new DataInputStream(System.in);

System.out.println("Please  Enter an Input");
    n = Integer.valueOf(in.readLine());
    s= 0;

    for (i=1; i<=n; i++ ) {

        for (j=1; j<=n; j++)
        System.out.print("");

        System.out.println();
    }

}
    
}
 */



/*

// 55555
// 44444
// 33333
// 22222
// 11111

    

import java.io.DataInputStream;
class MyCode {
public static void main(String arg[]) throws Exception
    {
int i,j, n ;
DataInputStream in = new DataInputStream(System.in);

System.out.println("Please  Enter an Input");
    n = Integer.valueOf(in.readLine()); 5


    for (i = n; i >= 1; i--) // Loop for rows  i = 5 ; 5>=1; 
     { 
        for (j = 1; j <= n; j++) { // Loop for columns 1<=5; 
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line
    }



    }
}
 */

 /*

import java.io.DataInputStream;

class MyCode {
    public static void main(String[] args) {
    int i, j, n;

        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter a number");

        n = Integer.valueOf(System.)


    }

    
}
     */


/*
import java.io.DataInputStream;
class MyCode {
public static void main(String arg[]) throws Exception
    {
int i,j, n ;
DataInputStream in = new DataInputStream(System.in);

System.out.println("Please  Enter an Input");
    n = Integer.valueOf(in.readLine()); 5


    for (i = n; i >= 1; i--) // Loop for rows  i = 5 ; 5>=1; 
     { 
        for (j = 1; j <= n; j++) { // Loop for columns 1<=5; 
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line
    }



    }
}
     */




import java.io.DataInputStream;
class MyCode {
public static void main(String arg[]) throws Exception
    {
int i,j, n ;
DataInputStream in = new DataInputStream(System.in);

System.out.println("Please  Enter an Input");
    n = Integer.valueOf(in.readLine()); 
    
    j= 1;
    System.out.println(n);
    for (i=n-1; i>=1;i-=2) {
      
        System.out.println(i);
       }
        

    } 
    }
