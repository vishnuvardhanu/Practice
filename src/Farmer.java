import java.util.*;
public class Farmer {	public double simpleinterest;	public double principal;	public double time;	public static double rate;		static{		rate=9.7;	}		void collectData()	{		Scanner sc = new Scanner(System.in);		System.out.println("Enter Principal");		principal=sc.nextDouble();		System.out.println("Enter Time");		time=sc.nextDouble();		sc.close();	}		void caluclateData()	{		simpleinterest=principal*time*rate/100;	}	void dispalyData()	{		System.out.println(simpleinterest);	}	
}
