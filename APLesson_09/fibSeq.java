import java.util.Scanner;
public class fibSeq
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting value:");
		int Start = kb.nextInt();
		System.out.println("Please enter your sequence size:");
		int Sequence = kb.nextInt();
		int[] seq = new int[Sequence];
		
		System.out.println("Sequence: ");
		for(int i=0; i< seq.length; i++)
		{
			if(i==0 || i==1)
			{
				seq[i] = Start;
			}
			else
				seq[i] = seq[i-1] + seq[i-2];
			System.out.println(seq[i] + " ");
		}
	}
}