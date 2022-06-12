package pkg3;

public class class2 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}
      public int sub(int x, int y)
      {
    	  int z;
    	  z=x-y;
    	  System.out.println("sub result is"+z);
    	  return z;
      }
      public void mul(int x1, int y1)
      {
    	  int z1;
    	  z1=x1*y1;
    	  System.out.println("mul result is"+z1);
      }
      public static void main(String[] args) 
      {
    	  class2 ob= new class2();
    	  int sumresult=ob.sum(10,2);
    	  int subresult=ob.sub(10, 2);
    	  ob.mul(sumresult , subresult);
    	  }
}
