package Pattarn_29_10;

public class ex_4_from_sheet 
{
	public static void main(String[]args)
	{
		for(int i=0; i<=7; i++)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=6; l>=0; l--)
		{
			for(int m=6; m>=l; m--)
			{
				System.out.print(" ");
			}
			for(int n=0; n<=l; n++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
