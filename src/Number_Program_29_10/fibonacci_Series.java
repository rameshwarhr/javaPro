package Number_Program_29_10;

public class fibonacci_Series 
{
	public static void main(String[]args)
	{
		int a=0;
		int b=1;
		int c;
		for(int i=0; i<=8; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
