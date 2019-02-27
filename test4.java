import java.io.*;
import java.util.Scanner;
import java.lang.*;
class test4
{
	public static void main(String[] args)
	{
		int i,j;
		j=0;
		int max=0;
		int maxi=0;
		int maxj=0;
		for(i=999;i>=100;i--)
		{
			for(j=999;j>=100;j--)
			{
				int prod,k;
				prod=i*j;
				String s=String.valueOf(prod);
				int n=s.length();
				char[] c=s.toCharArray();
				n=n-1;
				for(k=0;k<=n;k++,n--)
				{
					char temp;
					temp=c[k];
					c[k]=c[n];
					c[n]=temp;
				}
				String s1=new String(c);
				if(s.equals(s1))
				{	
					if(prod>max)
					{
						max=prod;
						maxi=i;
						maxj=j;
					}
				}
			}
		}	


System.out.print(max+" is palindrome"+" of product "+maxi+"and "+ maxj);
					
				
	}
}
			










		