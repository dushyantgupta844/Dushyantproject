package pkg2;

public class Student 
{
	int rollno,age;
	
	public void display1()
	{
		System.out.println("Roll no of the student");
	}
	public void display2()
	{
		System.out.println("Age of the student");
	}
	public static void main(String[] args) 
	{
		Student abc = new Student();
		abc.display1();
		abc.rollno=1234;
		System.out.println(abc.rollno);
		abc.display2();
		abc.age=26;
		System.out.println(abc.age);
		
	}

}
