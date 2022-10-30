package String_Program_29_10;

public class reverse_String_char_by_char 
{
	public static void main(String[]args)
	{
		String str="Rameshwar";
		String nw="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			nw=nw+str.charAt(i);
		}
		System.out.println(nw);
	}

}
