import java.util.Scanner;
class pattern3{
	public static void main(String args[])
	{
	int x,i,j;
	System.out.println("enter no of rows");
	Scanner sc=new Scanner(System.in);
	 x=sc.nextInt();
	 for(i=1;i<=5;i++)
	 {
	 for(j=5;j>=i;j--)
	 {System.out.print(j);

	 }
	 System.out.print("\n");
	 }
	}
}