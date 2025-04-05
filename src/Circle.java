import java.util.*;
public class Circle extends Shapes{
	
	public static double pi;
	public double r;
	static {
		pi=3.14;
	}
	@Override
	void collectData() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		r=sc.nextDouble();
	}

	@Override
	void caluclateData() {
		// TODO Auto-generated method stub
		area=pi*r*r;
	}

	@Override
	void displayData() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle: "+area);
	}

}
