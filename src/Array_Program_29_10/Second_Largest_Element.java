package Array_Program_29_10;

public class Second_Largest_Element 
{
	public static void main(String[]args)
	{
		int ar[]= {1,4,2,6,7,9,4,8,5};
		int temp=ar[1];
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			//System.out.println(ar[1]);
		}
		System.out.println(ar[1]);
	}

}
