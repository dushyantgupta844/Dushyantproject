package pkgclass1;

public class Class3 
{
public Class3() 
{
	System.out.println("Default construtor" );
}
public Class3(int a) 
{
	System.out.println("One paramerized construtor" );
}
public Class3(int a,int b) 
{
	System.out.println("two paramerized construtor" );
}
public static void main(String[] args) 
{
	Class3 ref=new Class3(12);
	Class3 ref2=new Class3();
	Class3 ref3=new Class3(2,2);
}
}
