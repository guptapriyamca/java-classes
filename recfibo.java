import java.util.Scanner;
class recfibo
{ 
	public static void main(String args[])
	{
		int pos;
		
		for(pos=1;pos<=10;pos++)
		{
		int res=fibo(pos);
		System.out.println(res);
		}
	}
	static int fibo(int pos)
	{
		if((pos==1)||(pos==2))
			return 1;
		else
		{
			return(fibo(pos-1)+fibo(pos-2));
		}
	}
}
		
		
		
	