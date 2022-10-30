package String_Program_29_10;

public class replace_Space_Special_char
{
	public static void main(String[]args)
	{
		String str="Rameshwar Rathod";
		String tem="";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				tem+='$';
			}
			else
			{
				tem+=str.charAt(i);
			}
		}
		System.out.println(tem);
	}

}
