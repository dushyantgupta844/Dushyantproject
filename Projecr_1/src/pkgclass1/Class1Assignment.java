package pkgclass1;

public class Class1Assignment 
{
  int rollno,age;
  public void display1()
  {
	  System.out.println("Welcome to Autometion");
  }
  public void display2()
  {
	  System.out.println("Welcome to Selenium");
  }
  public static void main(String[] args) 
  {
	Class1Assignment obj= new Class1Assignment();
	obj.display1();
	obj.display2();
	obj.rollno=12;
	System.out.println("Roll no is " + obj.rollno);
	obj.age=26;
	System.out.println("Age no is " + obj.age);
}
}
