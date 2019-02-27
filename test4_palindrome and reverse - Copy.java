import java.io.*;
import java.util.Scanner;
import java.lang.*;
class test4
{
	public static void main(String[] args)
	{
		String str1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		str1=sc.nextLine();
		int i,n,j;
		n=str1.length();
		j=n-1;
		char c[]=str1.toCharArray();
		char temp;
		for(i=0;i<=j;i++,j--)
		{
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		}
		String str2=new String(c);
		if(str1.equals(str2))
		{		
			System.out.print(str2+" is palindrome");
		}
		else
		{
			System.out.print(str2+" is not palindrome");
		}
			
		/*for(char ch:c)
		{
			System.out.print(ch);
		}*/
	}
}
			










		