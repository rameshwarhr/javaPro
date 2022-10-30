package Number_Program_29_10;

public class palindrom_Number 
{
	public static void main(String[]args)
	{
		int num=1234;
		int temp=num;
		int rev=0;
		int rem=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(num+" -original number");
		System.out.println(rev+" - after reerse the number");
		if(num==rev)
		{
			System.out.println(" the given number is palindrom");
		}
		else {
			System.out.println(" the given number is not palindrom");
		}
	}

}
