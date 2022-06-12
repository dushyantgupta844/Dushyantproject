package pkgclass1;

public class Class3Assignment 
{
public Class3Assignment() 
{
	this(1,1,1);
	System.out.println("Default Construtor");
}
public Class3Assignment(int a) 
{
	this(1,1);
	System.out.println("One Parameterized Construtor");
}
public Class3Assignment(int a,int b) 
{
   this();
	System.out.println("Two Parameterized Construtor");
}
public Class3Assignment(int a,int b,int c) 

{
	
	System.out.println("Three Parameterized Construtor");
}
public Class3Assignment(int a,int b,int c,int d) 

{
	this(1);
	System.out.println("Four Parameterized Construtor");
}
public static void main(String[] args) 
{
	Class3Assignment obj= new Class3Assignment(1,1,1,1);
}
}
