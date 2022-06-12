package pkg2;

public class class3 
{
	 public class3() 
	 {
		this(1,2,3);
		System.out.println("Default constructor");
	}

	 public class3(int a)
	 
	 {
		 this(1,2);
		System.out.println("One Parameterized constructor");
	}
	 public class3(int a,int b)
	 
	 {
		 this();
		 System.out.println("two Parameterized constructor");
	}
	 public class3(int a, int b, int c) 
	 
	 {
		
		System.out.println("three Parameterized constructor");
	}
	 public class3(int a,int b, int c, int d) 
	 
	 {
		this(1);
		System.out.println("four Parameterized constructor");
	}
	 public static void main(String[] args) 
	 {
		 class3 ref= new class3(1,1,1,1);
		
	}

}
