class pattern15{
	public static void main(String args[])
	{
	int i,j,k,sp=3,c=1;
	for(i=1;i<=4;i++)
	{
	for(k=1;k<=sp;k++)
	{
		System.out.print(" ");

	}
	for(j=1;j<=i;j++)
	{
		System.out.print(c+" ");
		c++;
	}
	sp--;
	System.out.print("\n");
	}
	}
}