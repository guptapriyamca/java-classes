import java.lang.String;
class quest1
{
	public static void main(String[] args)
	{
		String str1="position 1 no @ Durga is this";
		String[] s2=str1.split("\\s");
		int i;
		int n=s2.length;
		System.out.println(n);
		int left=0;
		int right=n-1;
		for(;left<=right;left++,right--)
		{
			String temp=s2[left];
			s2[left]=s2[right];
			s2[right]=temp;
		}
		for(i=0;i<n;i++)
		{
		System.out.print(s2[i]+" ");
		}

			
	}
}