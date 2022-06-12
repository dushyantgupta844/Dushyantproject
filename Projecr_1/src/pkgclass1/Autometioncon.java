package pkgclass1;

public class Autometioncon extends seleniumcon
{
  public Autometioncon() 
  {
	  super(2,1);
	  System.out.println("Child Default constructor");
}
  public Autometioncon(int a) 
  {
	  this(1,2);
	  System.out.println("Child One Parameterise constructor");
}
  public Autometioncon(int a,int b) 
  {
	  this(1,1,1);
	  System.out.println("Child Two Parameterise constructor");
}
  public Autometioncon(int a,int b,int c) 
  {
	  this();
	  System.out.println("Child Three Parameterise constructor");
}
  public static void main(String[] args) 
  {
	Autometioncon a= new Autometioncon(1);
}
}
