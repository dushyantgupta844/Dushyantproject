package pkgclass1;

public class seleniumcon 
{ 
	public seleniumcon() 
	{
		this(1,5,2);
		System.out.println("Parent Default constructor");
    }
	public seleniumcon(int a) 
	{
		super();
		System.out.println("Parent One Parameterise constructor");
    }
	public seleniumcon(int a,int b) 
	{
		this(1);
		System.out.println("Parent two Parameterise constructor");
    }
	public seleniumcon(int a,int b,int c) 
	{
		System.out.println("Parent three Parameterise constructor");
    }

}
