import java.util.Scanner;
class test1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3");
		int no1=sc.nextInt();
		System.out.println("enter 5");
		int no2=sc.nextInt();
		int i;
		int sum=0;
		for(i=1;i<1000;i++)
		{
			if((i%no1==0) || (i%no2==0))
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}
}