import java.util.Scanner;

public class Rectangle extends Shapes {
	
	public double length;
	public double height;
	
	@Override
	void collectData() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of Rectangle");
		length=sc.nextDouble();
		System.out.println("Enter Height of Rectangle");
		height=sc.nextDouble();
	}

	@Override
	void caluclateData() {
		// TODO Auto-generated method stub
		area=length*height;
	}

	@Override
	void displayData() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle: "+area);
	}
}
