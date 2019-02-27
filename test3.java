import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class test3
{
	public static void main(String[] args)
	{
		int i;
		
		long no,k;
		k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		no=sc.nextLong();
		i=2;
		while(no%i==0)
		{
			System.out.println(2+ " ");
			no=no/i;
		}
		for(i=3;i<=Math.sqrt(no);i+=2)
		{
			while(no%i==0)
			{
				System.out.println(i+ " ");
				no=no/i;
				k=i;
			}
			
		}
		
		if(no>2)
		{
			System.out.println(no+ " ");
			k=no;
			
		}
		System.out.println(k+" is largest prime factor");
		
	}
}
			
		