//Encapsulation
public class Dog {
	private String name;
	private String color;
	private int age;
	private String breed;
	
	//Constructor
	Dog()
	{
		name="Tony";
		age=3;
		color="Brown";
		breed="Lab";		
	}
	
	Dog(String name,int age,String color,String breed)
	{
		this.name=name;
		this.age=age;
		this.color=color;
		this.breed=breed;
	}
	
	public void setName(String name)//setter - which sets or changes value
	{
		this.name=name;
	}
	public String getName()//getter - gets or fetches the value
	{
		return name;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setBreed(String breed)
	{
		this.breed=breed;
	}
	public String getBreed()
	{
		return breed;
	}
}
