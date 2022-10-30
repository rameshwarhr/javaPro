package Pattarn_29_10;

public class ex_6_from_sheet 
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
			for(int l=1; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=6; i>=0; i--)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
