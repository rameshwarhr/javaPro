package Number_Program_29_10;

public class swap_two_Number_withoutThird_Number 
{
	public static void main(String[]args)
	{
		int a=100;
		int b=50;
		System.out.println(a+" original a");
		System.out.println(b+" original b");
		
		a=a+b;
		
		b=a-b;
		System.out.println(b+" after swap b");
		a=a-b;
		System.out.println(a+" after swap a");
	}

}
