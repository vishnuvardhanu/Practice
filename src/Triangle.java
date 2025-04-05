import java.util.Scanner;

public class Triangle extends Shapes {
	public double base;
	public double height;
	@Override
	void collectData() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Base of triangle");
		base=sc.nextDouble();
		System.out.println("Enter Height of Triangle");
		height=sc.nextDouble();
	}

	@Override
	void caluclateData() {
		// TODO Auto-generated method stub
		area=0.5*base*height;
	}

	@Override
	void displayData() {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle: "+area);
	}
}
