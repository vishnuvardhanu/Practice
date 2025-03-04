import java.util.*;
public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no of employees");
//		int n = sc.nextInt();
//		sc.nextLine();
//		String[] arr = new String[n];
//		System.out.println("Enter employee names");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print((i+1)+":");
//			arr[i]=sc.nextLine();
//		}
//		System.out.println("The Employees are:");
//		for(String name:arr)
//		{
//			System.out.println(name);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Organizations");
		int o = sc.nextInt();
		System.out.println("Enter no of companies:");
		int m = sc.nextInt();
		System.out.println("Enter no of employees in each company:");
		int n = sc.nextInt();
		
		String arr[][][] = new String[o][m][n];
		for(int k=0;k<o;k++)
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.println("Enter employee"+(j+1)+" of company "+(i+1)+" of Organization "+(k+1));
					arr[k][i][j]=sc.next();
				}
			}
		}
		for(String[][] org:arr)
		{
			System.out.println("Organization:");
			System.out.println("Companies:");
			for(String[] comp:org)
			{	
				System.out.print(Arrays.toString(comp));
			}
			System.out.println();
		}
	}

}
