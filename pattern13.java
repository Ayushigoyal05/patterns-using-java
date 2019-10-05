class pattern13{
	public static void main(String args[])
	{
	int i,j,m,sp=1,k;
	 for(i=5;i>=1;i--)
	 {
	 for(j=1;j<=i;j++)
	 {System.out.print(j);

	 } if(i<5) {if(i==4){
	 	for(m=1;m<sp;m++)
	 		System.out.print(" ");
	 } 
	 else{
	 for(m=1;m<=(sp*2)-3;m++)
	 	System.out.print(" ");}}
	 if(i==5){
	 	for(k=i-1;k>=1;k--){
	 		System.out.print(k);
	 	}
	 }
	 else{
	 	for(k=i;k>=1;k--){
	 		System.out.print(k);
	 	}
	 }
	 System.out.print("\n");
	 sp++;
	 }

	}
}