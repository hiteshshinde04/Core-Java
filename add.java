class add
{
	public static void main(String[]args)
	{
	int [][]a={
			{1,2,3,4},
			{2,3,4,5},
			{3,4,5,6}
		  };
	int [][]b={
			{3,4,5,6},
			{1,4,6,8},
			{1,2,5,4}
            	   };
	int [][]c=new int[a.length][a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
		c[i][j]=a[i][j]-b[i][j];
		System.out.print(c[i][j]+" ");
		}
	System.out.println();
	}
	}
}