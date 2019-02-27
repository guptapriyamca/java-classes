import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
class regtest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Pattern p=Pattern.compile("([0-255][.]){3}");
		Matcher m=p.matcher("IP address is a string in the form (000.12.12.034) is");
		System.out.println(m.group());
	}
}