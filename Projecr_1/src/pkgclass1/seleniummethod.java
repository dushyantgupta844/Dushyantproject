package pkgclass1;

public class seleniummethod 
{
  public void m()
  {
	  this.m3(1,1,1);
	  System.out.println("Parent Default Method");
  }
  public void m1(int a)
  {
	  this.m();
	  System.out.println("Parent One Paramerterise Method");
  }
  public void m2(int a,int b)
  {
	  this.m1(1);
	  System.out.println("Parent Two Paramerterise Method ");
  }
  public void m3(int a,int b,int c)
  {
	  System.out.println("Parent Three Paramerterise Method");
  }
}
