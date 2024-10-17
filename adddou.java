class adddou
{
	public static void main(String[]args)
	{
	int [][]a={
			{1,2,3},
			{2,3,4},
			{3,4,5}
		   };
	int [][]b={
			{1,2,7},
			{1,1,9},
			{1,2,1}
		   };
	int [][]c=new int[a.length][a.length];
	System.out.println("add of matrix:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");	
			
		}
	System.out.println();
	}
	System.out.println("add of matrix:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
			System.out.print(c[i][j]+" ");
			System.out.println("sub of matrix:");
		}
	System.out.println();
	}
	
	}
}