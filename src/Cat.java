public class Cat {
	private String name;
	private int age;
	
	Cat(){
		System.out.println("Meow");
	}
	
	{
		System.out.println("meow 2");
	}
//	
//	@SuppressWarnings("preview")
//	Cat(String name,int age)
//	{
//		nam=name;
//		this.age=age;
//		this(name);
//		
//	}
//	Cat(String name)
//	{
//		this();
//		System.out.println(this.nam);
//	}
	
	//shadowing problem
	Cat(String name,int age)
	{
//		name=name;
//		age=age;
		//The above does'nt work both Instance and local variables have same names which compiler cannot differ
		//so instance will have default values and local variables will stay same
		this.name=name;
		this.age=age;
	}
	
	public void getValues()
	{
		System.out.println(name);
		System.out.println(age);
	}
}
