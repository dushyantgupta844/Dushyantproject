package pkg4;

public class class2 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
		}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int mul(int x1, int x2)
	{
		int x3;
		x3=x1*x2;
		return x3;
	}
	public void div(int a1, int b1)
	{
		int c1;
		c1=a1/b1;
		System.out.println("final result"+c1);
	}
	public static void main(String[] args) 
	{
		class2 obj = new class2();
		int sub1=obj.sub(10, 2);
		int sum=obj.sum(sub1, 2);
		int sub2=obj.sub(sum, 2);
		int mul=obj.mul(sub2,2);
		obj.div(mul, 2);
	}

}
