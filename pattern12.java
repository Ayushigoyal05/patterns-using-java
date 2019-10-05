class pattern12{
	public static void main(String args[])
	{
	int i,j,k,m,sp=5;
	for(i=1;i<=5;i++)
{for(m=1;m<sp;m++)
	{
		System.out.print(" ");
	}
	for(j=1;j<=i;j++)
	{
	System.out.print(j);
	}
	for(k=i-1;k>=1;k--){
	System.out.print(k);
	}
	System.out.print("\n");
	sp--;
}	int sp2=1;
for(i=4;i>=1;i--)
{
	for(m=1;m<=sp2;m++)
		System.out.print(" ");

	for(j=1;j<=i;j++)
	{
	System.out.print(j);
	}
	for(k=i-1;k>=1;k--){
	System.out.print(k);
	}
	System.out.print("\n");
sp2++;
}	
}}