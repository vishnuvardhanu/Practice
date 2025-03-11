import java.util.*;
public class ArraysPractice {
	public static void array4d()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Countries");
		int c=sc.nextInt();
		System.out.println("Enter no of Organizations in each country");
		int o = sc.nextInt();
		System.out.println("Enter no of companies in each organization:");
		int m = sc.nextInt();
		System.out.println("Enter no of employees in each company:");
		int n = sc.nextInt();
		
		String arr[][][][] = new String[c][o][m][n];
		for(int l=0;l<c;l++)
		{
			for(int k=0;k<o;k++)
			{
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.println("Enter employee"+(j+1)+" of company "+(i+1)+" of Organization "+(k+1)+" of Country:"+(l+1));
						arr[l][k][i][j]=sc.next();
					}
				}
			}
		}
		for(String [][][] cnt: arr)
		{
			for(String[][] org:cnt)
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
		sc.close();
	}
	
	public static int min(int arr[])
	{
		int min=Integer.MAX_VALUE;
		for(int n:arr)
		{
			min=Math.min(n, min);
		}
		return min;
	}
	
	
	public static void maxmin(int arr[])
	{
		int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
		for(int n:arr)
		{
			max=Math.max(max, n);
			min=Math.min(min, n);
		}
		System.out.println("Max:"+max+" min:"+min);
	}
	
	public static void reverse(int arr[])
	{
		if(arr.length==0)
		{
			System.out.println(-1);
			return;
		}
		int l=0,r=arr.length-1;
		while(l<=r)
		{
			int temp = arr[l];
			arr[l++]=arr[r];
			arr[r--]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static int findDuplicate1ton(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int ind = Math.abs(arr[i]);
			if(arr[ind]<0)
				return ind;
			
			arr[ind]= -arr[ind];
		}
		return -1;
	}
	public static int Duplicates(int arr[])
	{
		HashMap<Integer,Integer>  hs = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hs.containsKey(arr[i]))
				return arr[i];
			
			hs.put(arr[i],1);
		}
		return -1;
	}
	
	public static int sumOfMatrix(int arr[][])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				sum+=arr[i][j];
			}
		}
		return sum;
	}
	
	public static void jaggedarrays()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of the companies");
		int m = sc.nextInt();
		String arr[][] = new String[m][];
		
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter no of employees in company "+(i+1));
			arr[i] = new String[sc.nextInt()];
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter name of the employee no: "+(j+1)+" of the company "+(i+1));
				arr[i][j]=sc.next();
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("The name of the employee of "+(j+1)+" of company "+(i+1)+": "+arr[i][j]);
			}
		}
		sc.close();
	}
	
	public static void jaggedarrays3d()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of the organizations");
		int m = sc.nextInt();
		System.out.println("Enter no of the companies in each organization");
		int n = sc.nextInt();
		
		String arr[][][] = new String[m][n][];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter no of employees in company "+(j+1)+" of organization "+(i+1));
				arr[i][j] = new String[sc.nextInt()];
			}
		}
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter name of the employee no: "+(k+1)+" of the company "+(j+1)+" of organization "+(i+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				System.out.println("The name of the employee of "+(k+1)+" of company "+(j+1)+" of organization "+(i+1)+": "+arr[i][j][k]);
			}
		}
		sc.close();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse(new int[]{1,2,3,4,5,6});
		//System.out.println(Duplicates(new int[]{4,3,1,2,4}));
		//System.out.println(sumOfMatrix(new int[][]{{1,2,3},{4,5,0}}));
		//maxmin(new int[]{1,2,3,4,5});
		jaggedarrays3d();
	}

}