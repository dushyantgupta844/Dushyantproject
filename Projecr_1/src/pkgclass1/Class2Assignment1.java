package pkgclass1;

public class Class2Assignment1 
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
	Class2Assignment1 abc=new Class2Assignment1();
	int sumresult=abc.sum(10, 2);
	int sum1=abc.sum(sumresult, 2);
	int subresult=abc.sub(sum1, 2);
    int mulresult=abc.mul(subresult, 2);
    abc.div(mulresult, 2);
}

}
