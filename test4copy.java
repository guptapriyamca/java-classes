import java.io.*;
import java.util.Scanner;
import java.lang.*;
class test4copy
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=999;i>=0;i--)
		{
			for(j=999;j>=0;j--)
			{
				int prod;
				prod=i*j;
				String s=Integer.toString(prod);
				StringBuffer sb=new StringBuffer(s);
				String s1=sb.reverse().toString();
				
				if(s.equals(s1))
				{		
				System.out.print(prod+" is palindrome"+" of product "+i+"and "+j);
					return;
				}
	
		
			}
		}
	}
}
			










		