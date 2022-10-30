package Array_Program_29_10;

public class duplicate_element_from_Array 
{
	public static void main(String[]args)
	{
		int ar[]= {1,4,2,6,7,9,4,8,5};
		int temp=ar[1];
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j] && i!=j)
				{
					System.out.println(ar[j]);
				}
			}
		}
	}

}
