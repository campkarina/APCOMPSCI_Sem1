import java.util.Scanner;
public class center
{
	static String word1;
	static String word2;
	static String word3;
	
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter word 1: ");
	   word1 = kb.next();
	   System.out.println("Please enter word 2: ");
	   word2 = kb.next();
	   System.out.println("Please enter word 3: ");
	   word3 = kb.next();
	   
	   System.out.println(makeCenter(word1));
	   System.out.println(makeCenter(word2));
	   System.out.println(makeCenter(word3));
	}

	public static String makeCenter(String word)
	{
	   if (word.length() >= 20)
		   return word;
	   else
	   {
		   word = " " + word + " ";
		   return makeCenter(word);
	   }
	}
}