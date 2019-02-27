import java.io.*;
import java.util.Scanner;
import java.lang.*;
class xxxx
{
	public static void main(String[] args)
	{
		String[] str1="hello goodbye hello";
		int i,j;
		int count=0;
		for(i=0;i<str1.length();i++)
		{
			for(j=i+1;j<=str1.length();j++)
			{
				if(str1[i]==str1[j])
				{
					count++;
				}
			}
		}
		System.out.println(str1+" is coming "+count+" times");
	}
}