package String_Program_29_10;

public class duplicate_char_from_String 
{
	public static void main(String[]args)
	{
		String str="Rameshwar Rathod From Yavatmal";
		int count;
		char strin[]=str.toCharArray();
		
		for(int i=0; i<strin.length; i++)
		{
			count=1;
			for(int j=i+1; j<strin.length;j++)
			{
				if(strin[i]==strin[j] && strin[i]!='0')
				{
					count++;
					strin[j]='0';
				}
			}
			if(count>1 && strin[i]!='0')
			{
				System.out.println(strin[i]);
			}
		}
	}

}
