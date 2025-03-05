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
	
	
	public static int maxmin(int arr[])
	{
		return 0;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse(new int[]{1,2,3,4,5,6});
		//System.out.println(findDuplicate1ton(new int[]{1,3,1,2,4}));
		System.out.println(sumOfMatrix(new int[][]{{1,2,3},{4,5,0}}));
	}

}