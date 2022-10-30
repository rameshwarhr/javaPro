package Number_Program_29_10;

public class gcd_lcm_of_NUmber 
{
	public static void main(String[]args)
	{
		int a=8;
		int b=12;
		int gcd=0;
		int lcm=1;
		
		for(int i=1; i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd+"-gcd");
		lcm=a*b/gcd;
		System.out.println(lcm+" -lcm");
				
	}

}
