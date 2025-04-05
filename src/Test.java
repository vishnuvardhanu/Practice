
public class Test {
	public static void main(String args[]) {
		
//		Plane p = new Plane() {//anonymous inner class
//			@Override
//			void fly() { 
//				System.out.print("Plane Flies");
//			}
//		};
//		p.fly();
		
		Circle c = new Circle();
		c.collectData();
		c.caluclateData();
		c.displayData();
		System.out.println(4*4*3.14);
		
		Triangle t = new Triangle();
		t.collectData();
		t.caluclateData();
		t.displayData();
		System.out.println(0.5*4*5);
		
		Rectangle r = new Rectangle();
		r.collectData();
		r.caluclateData();
		r.displayData();
		System.out.println(6*7);
	}
}