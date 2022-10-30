package Array_Program_29_10;

public class print_even_odd_number 
{
	public static void main(String[]args)
	{
		int ar[]= {1,4,2,6,7,9,4,8,5};
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]+" -even");
			}else {
				System.out.println(ar[i]+" -odd");
			}
		}
	}

}
