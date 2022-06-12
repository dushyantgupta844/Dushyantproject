package pkgclass1;

public class Class2 
{
public int sum (int a, int b)
{
	int  c;
	c=a+b;
	return c;
}
public int sub (int x, int y)
{
	int z;
	z=x-y;
	return z;
}
public void mul(int x1, int y1)
{
	int z1;
	z1=x1*y1;
	System.out.println("Final result is " + z1);
}
public static void main(String[] args) 
{
 Class2 abc=new Class2();
 int sumresult =abc.sum(10, 2);
 int sub=abc.sub(10,2);
 abc.mul(sumresult, sub);
 
}
}
