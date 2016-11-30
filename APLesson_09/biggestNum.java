import java.util.Scanner;
public class biggestNum
{
	static int Array;
	static int[] numbers = new int[10];
	
	public static void main(String[]args)
	{
		System.out.print("For the following numbers: "+"\n");
		fillArray();
		printArray();
		System.out.print("The biggest number is: " + "\n");
		System.out.println(getBiggest());
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
	
	public static int getBiggest()
	{
		int max =0;
		for(int Num : numbers)
		{
			if (Num > max)
			{
				max=Num;
			}
		}
		return max;
	}
}