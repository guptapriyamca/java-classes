import java.io.*;
import java.lang.*;
import java.util.Scanner;
class super1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer();
		System.out.println("enter a string");
		str.append(sc.nextLine());
		int i;
		for(i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				str.delete(i-1,i+1);
				i=0;
			}
		}
	
		if(str.length()==0)
		{
		System.out.print("Empty String");
		}
		else
		{
		System.out.print(str);
		}
	}
}


