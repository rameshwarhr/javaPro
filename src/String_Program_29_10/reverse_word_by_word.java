package String_Program_29_10;

public class reverse_word_by_word 
{
	public static void main(String[]args)
	{
		String str="Rathod Rameshwar";
		String tem[]=str.split(" ");
		for(int i=tem.length-1; i>=0; i--)
		{
			System.out.println(tem[i]);
		}
		
	}

}
