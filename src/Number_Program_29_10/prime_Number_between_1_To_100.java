package Number_Program_29_10;

public class prime_Number_between_1_To_100 
{
public static void main(String[]args)
{
	 int i, j, isPrime, n;
     System.out.println("All Prime Numbers");

     for (i = 1; i <= 100; i++) 
     {
         isPrime = 0;
      
         for (j = 2; j <= i/2; j++) 
         {
             
             if (i % j == 0) 
             {
                 isPrime = 1;
               //  break;
             }
         }

         if (isPrime == 0)
             System.out.println(i + " ");
     }
}
	
}
