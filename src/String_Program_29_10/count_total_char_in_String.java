package String_Program_29_10;

public class count_total_char_in_String 
{
	public static void main(String[]args)
	{
		String str="rameshwar rathod from yavatmal";
		int count=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
