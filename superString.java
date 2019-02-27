import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class superString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer();
		System.out.println("enter input");
		str.append(sc.nextLine());
		//str.toString().toLowerCase();
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
			System.out.println("Empty String");
		}
		else	
		{
		System.out.println(str);
		}
	}
}