import java.util.Scanner;
public class graphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		System.out.println("Please enter the size of the table: ");
		int size = kb.nextInt();

		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%5s | %1s\n",i,(i*number));
		}
	}
}