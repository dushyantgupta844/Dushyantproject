package pkg1;

public class Class1Assignment 
{
	int rollno,age;
	public void display1()
	{
		System.out.println("Welcome to Automation ");
	}
	public void display2()
	{
		System.out.println("Welcome to Mannula testing");
	}
	public static void main(String[] args) 
	{
		Class1Assignment abc= new Class1Assignment();
		abc.display1();
		abc.display2();
		abc.rollno=21;
		System.out.println("Roll no is " + abc.rollno);
		abc.age=26;
		System.out.println("Agge is "  + abc.age);
	}

}
