package pkgclass1;

public class Class4 
{
public void m1()
{
	this.m4(1, 2, 3);
	System.out.println("Default Method");
}
public void m2(int a)
{
	this.m1();
	System.out.println("One Parameterized Method");
	
}
public void m3(int a,int b)
{
	this.m2(1);
	System.out.println("Two Parameterized Method");
}
public void m4(int a, int b, int c)
{
	System.out.println("Three Parameterized Method");
}
public void m5(int a,int b ,int c,int d)
{
	this.m3(1, 2);
	System.out.println("Four Parameterized Method");
}
public static void main(String[] args) 
{
	Class4 Obj= new Class4();
	Obj.m5(1,1,1,1);
	}
}