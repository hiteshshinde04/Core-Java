class alaphbetpatt
{
	public static void main(String[]args)
	{
	int i,j,k=65;
	double l=34.90;
		
	System.out.println((char)k+" ");
	System.out.println((double)k+" ");
	System.out.println((int)l+" ");
	
	for(i=65;i<=90;i++)
		System.out.print((char)i+" ");
	
	for(i=65;i<=69;i++)
	{
		for(j=65;j<=i;j++)
			System.out.print((char)j+" ");
	System.out.println();
	}
	}
}
	