package String_Program_29_10;

public class total_vowels_consonent 
{
	public static void main(String[]args)
	{
		String str="Rameshwar Rathod From Yavatmal";
		int vowel=0;
		int conso=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='u'|| str.charAt(i)=='i'|| str.charAt(i)=='o')
			{
				vowel++;
			}
			else if(str.charAt(i)>'a' && str.charAt(i)<'z')
			{
				conso++;
			}
		}
		System.out.println(conso+"- conso");
		System.out.println(vowel+"- vowel");
	}

}
