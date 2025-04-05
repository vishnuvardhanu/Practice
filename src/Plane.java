import java.util.*;
abstract class Plane {
	
	void takeOff()
	{
		System.out.println("Plaen TakeOffs");
	}
	
	abstract void fly();
	
	void land() {
		System.out.println("Plane Lands");
	}
	
}
