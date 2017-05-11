public class CardTester 
{
	public static void main(String[] args) 
	{
		Card c1 = new Card("Clubs", "3", 3);
		Card c2 = new Card("Clubs", "3", 3);
		Card c3 = new Card("Hearts", "Queen", 11);
		
		System.out.println(c3.toString());
		
		System.out.println("Cards 1 and 2 match: " + c2.matches(c1));
		System.out.println("Card 2 and 3 don't match: " + !c2.matches(c3));
	}
}