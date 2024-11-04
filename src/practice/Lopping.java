package practice;

public class Lopping 
{
	public static void main(String[] args)
	{
		int i=1255621;
		int b=i;
		int rev=0;
		while(i>0)
		{
			rev=rev*10+i%10;//1
			i=i/10;
		}
		if(rev==b)
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not");
		}
		
	}
	}

