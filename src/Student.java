public class Student {
	String name;
	int rollno;
	
	Student()
	{
		System.out.println("1st Student");
	}
	
	Student(String name)
	{
		this();
		System.out.println("2nd Student");
	}
	Student(String name,int roll)
	{
		this(name);
		System.out.println("3rd Student");
	}
}
