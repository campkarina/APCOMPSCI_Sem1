import java.util.Scanner;
public class lucky
{
	static int number;
	
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a number: ");
	   number = kb.nextInt();
	   
	   System.out.println(luck(number));
	}

	public static int luck(int n)
	{
	   if (n > 0)
	   {
		   if(n%10 == 7)
		   {
			  return 1+ luck(n/10);
		   }
		   
		   else
		   {
			  return 0+ luck(n/10);
		   }
	   }
	   
	   else
	   {
		   return 0;
	   }
	}
}