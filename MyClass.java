import java.util.Scanner;

class MyClass
{


void add(int x,int y)
{
int z;
z=x+y;
System.out.println("the result is "+z);
}


public static void main(String []arg)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int m=in.nextInt();

add(n,m);
}



}