public class Example {
	int m,n,o;
	static int a,b,c;
	
	static {
		a=10;
		b=20;
		c=30;
//		m=40;
//		n=50;
//		o=60;
		System.out.print("Hello World");
	}
	
	{
		a=10;
		b=20;
		c=30;
		m=40;
		n=50;
		o=60;
	}
	
	static void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(m)
//		System.out.println(n);
//		System.out.println(o);
	}
	void display2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}
}
