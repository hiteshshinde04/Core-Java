class addsub_dou_dim
{
	public static void main(String[]args)
	{
	int [][]a={
			{1,2,5},
			{2,8,4},
			{9,4,2}
		   };
	int [][]b={
			{4,7,3},	
			{5,1,7},
			{5,7,8}
	   };
	int [][]c=new int[a.length][a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
		}
	System.out.println();
	}
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