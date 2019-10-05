class pattern16{
	public static void main(String args[])
	{
	int i,j,k,c=1,sp=3;
	for(i=1;i<=4;i++)
	{
	for(k=1;k<=sp;k++)
	{
	System.out.print(" ");
	}
	for(j=1;j<=i;j++){
	System.out.print(c+" ");
	c++;
	}
	System.out.print("\n");
	sp--;
	}
	}
}