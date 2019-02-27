import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
class xxx
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1="hello goodbye hello";
		String str2="hello";
		int count=0;
		String str[]=str1.split(" ");
		for(String str3 : str)
		{
			if(str3.equals(str2))
			{
				count++;
			}
		}
		System.out.println(str2+" is coming "+count+" times");
	}
}