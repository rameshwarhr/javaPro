package Number_Program_29_10;

public class prime_number 
{
	public static void main(String[]args)
	{
		int num=7;
		int temp=0;
		for(int i=2 ; i<num; i++)
		{
			if(num%i==0)
			{
				temp++;
			}
		}
		if(temp>0)
		{
			System.out.println(" number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}

}
