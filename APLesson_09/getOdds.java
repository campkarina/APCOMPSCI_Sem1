import java.util.Scanner;
public class getOdds
{
	static int Array;
	static int[] numbers = new int[10];
	
	public static void main(String[]args)
	{
		System.out.print("For the following numbers: "+"\n");
		fillArray();
		printArray();
		System.out.print("The odd numbers are: " + "\n");
		getOdds();
	}
		
	public static void fillArray()
	{
		for(int i = 0; i < 10; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int n : numbers)
		{
			System.out.println(n + " ");
		}
	}
	
	public static void getOdds()
	{
		String odds;
		for(int Num : numbers)
		{
			if (Num % 2 != 0)
			{
				System.out.print(Num + " ");
			}
		}
	}
}