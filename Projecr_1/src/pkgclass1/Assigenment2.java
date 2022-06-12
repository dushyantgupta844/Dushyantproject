package pkgclass1;

import java.util.Scanner;

public class Assigenment2 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int mul(int x1,int y1)
	{
		int z1;
		z1=x1*y1;
		return z1;
	}
	public void div(int a1,int b1)
	{
		int c1;
		c1=a1/b1;
		System.out.println("Final Result is " + c1);
		}
	public static void main(String[] args) 
	{
		Assigenment2 obj= new Assigenment2();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Value of x1");
		int x1=s.nextInt();
		System.out.println("Enter the Value of x2");
		int x2=s.nextInt();
		System.out.println("Enter the value of x3");
		int x3=s.nextInt();
		System.out.println("Enter the value of x4");
		int x4=s.nextInt();
		System.out.println("Enter the value of x5");
		int x5=s.nextInt();
		System.out.println("Enter the value of x6");
        int x6=s.nextInt();
        int sumresult=obj.sum(x1, x2);
        int subresult=obj.sub(sumresult, x3);
        int sum1=obj.sum(subresult, x4);
        int mulresult=obj.mul(sum1, x5);
        obj.div(mulresult, x6);
       
        
	}

}
