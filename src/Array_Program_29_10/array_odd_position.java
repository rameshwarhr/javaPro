package Array_Program_29_10;

public class array_odd_position 
{
	public static void main(String[]args)
	{
		int ar[]= {1,4,2,6,7,9,4,8,5};
		System.out.println(" odd position number");
		for(int i=1; i<ar.length; i=i+2)
		{
			System.out.println(ar[i] );
		}
	}

}
