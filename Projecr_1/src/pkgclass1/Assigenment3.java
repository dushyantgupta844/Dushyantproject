package pkgclass1;

import java.util.Scanner;

public class Assigenment3 
{
public int mul(int a,int b)
{
	int c;
	c=a*b;
	return c;
}
public int sub(int a1,int b1)
{
	int c1;
	c1=a1-b1;
	return c1;
}
public int sum(int x,int y)
{
	int z;
	z=x+y;
	return z;
}
public void div(int x1,int y1)
{
	int z1;
	z1=x1/y1;
	System.out.println("Final Result is " +z1);
}
public static void main(String[] args) 
{
 Assigenment3 abc=new Assigenment3();
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the value of x1");
 int x1=s.nextInt();
 System.out.println("Enter the value of x2");
 int x2=s.nextInt();
 System.out.println("Enter the value of x3");
 int x3=s.nextInt();
 System.out.println("Enter the value of x4");
 int x4=s.nextInt();
 System.out.println("Enter the value of x5");
 int x5=s.nextInt();
 System.out.println("Enter the value of x6");
 int x6=s.nextInt();
 int mulresult=abc.mul(x1, x2);
 int subresult=abc.sub(mulresult, x3);
 int mul1=abc.mul(subresult, x4);
 int sumresult=abc.sum(mul1, x5);
 abc.div(sumresult, x6);
}
}

