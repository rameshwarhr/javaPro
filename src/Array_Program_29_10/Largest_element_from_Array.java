package Array_Program_29_10;

public class Largest_element_from_Array 
{
	public static void main(String[]args)
	{
		int ar[]= {1,4,2,6,7,9,4,8,5};
		int temp=ar[1];
		
		System.out.println("Largest number from array");
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]>temp)
			{
				temp=ar[i];
			}
		}
		System.out.println(temp);
	}

}
