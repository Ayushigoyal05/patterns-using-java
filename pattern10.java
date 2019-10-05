class pattern10{
	public static void main(String args[])
	{
	int i,sp=1,j,k,m;
	for(i=5;i>=1;i--)
{if(i<5){
	for(m=1;m<sp;m++)
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
sp++;
}	
}}