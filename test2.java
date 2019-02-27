import java.io.*;
class test2
{
	public static void main(String[] args)
	{
		int old=1;
		int current=2;
		int i,new1;
		int sum=2;
		new1=old+current;
		while(new1<4000000)
		{
			old=current;
			current=new1;
			new1=old+current;
			if(new1%2==0)
			{
				sum=sum+new1;
			}
		}
		System.out.println(sum);
	}
}