import java.util.Scanner;
class pattern2{
	public static void main(String args[])
	{
	int x,i,j;
	System.out.println("enter no of rows");
	Scanner sc=new Scanner(System.in);
	 x=sc.nextInt();
	 for(i=5;i>=1;i--)
	 {
	 for(j=1;j<=i;j++)
	 {System.out.print(j);

	 }
	 System.out.print("\n");
	 }
	}
}