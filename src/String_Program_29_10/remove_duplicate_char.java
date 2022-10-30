package String_Program_29_10;

public class remove_duplicate_char 
{
	public static void main(String[]args)
	{
		String str="raaaaaaaammmmmmmaaammmmammmamamamamamamam";
		String tem="";
		
		for(int i=0; i<str.length(); i++)
		{
			char charPosition=str.charAt(i);
			if(tem.indexOf(charPosition)<0)
			{
				tem+=charPosition;
			}
					
		}
		System.out.println(tem);		
				
	}

}
