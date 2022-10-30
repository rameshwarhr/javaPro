package Number_Program_29_10;

public class Amstrong_Number 
{
	public static void main(String[]args)
	{
		int num=123;
		int temp=num;
		int amt=0;
		int rem=0;
		while(temp!=0)
		{
			rem=temp%10;
			amt=amt+rem*rem*rem;
			temp=temp/10;
		}
		System.out.println(amt);
	}

}
