package pkgclass1;

public class Class2Assignment2 
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
	   System.out.println("final Result is " +c1);
	}
	public static void main(String[] args) 
	{
		Class2Assignment2 abc=new Class2Assignment2();
		int subresult=abc.sub(10, 2);
		int sumresult=abc.sum(subresult, 2);
		int sub1=abc.sub(sumresult, 2);
		int mul=abc.mul(sub1, 2);
		abc.div(mul, 2);
		
		
	}
}
