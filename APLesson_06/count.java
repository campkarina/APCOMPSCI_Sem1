import java.util.Scanner;
public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Count up to what number? ");
		int number = kb.nextInt();
		System.out.println("Enter interval: ");
		int interval = kb.nextInt();

		for(int i = 0; i <= number; i+=interval)
		{
			System.out.print(i + "\t");
		}
	}
}