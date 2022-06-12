package pkgclass1;

public class Automationmethod extends seleniummethod
{
	public void a()
	{
		this.a2(1,1);
		System.out.println("Child Default Method");
	}
	public void a1(int a)
	{
		this.a();
		System.out.println("Child One Parameterise Method");
	}
	public void a2(int a,int b)
	{
		super.m2(1,1);
		System.out.println("Child Two Parameterise Method");
	}
	public void a3(int a,int b,int c)
	{
		this.a1(1);
		System.out.println("Child Three Parameterise Method");
	}
	public static void main(String[] args) 
	{
		Automationmethod a= new Automationmethod();
		a.a3(1,1,1);
	}
}
