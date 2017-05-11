public class DeckTester 
{
	public static void main(String[] args) 
	{
		String[] r1 = {"5", "King", "7"};
		String[] s1 = {"Clubs", "Spades", "Hearts"};
		int[] v1 = {5, 13, 7};
	    Deck deck1 = new Deck(r1, s1, v1);
	    System.out.println("The size of deck 1 is: " + deck1.size());
	    
	    String[] r2 = {"6", "Jack", "Queen"};
	    String[] s2 = {"Spades", "Clubs", "Diamonds"};
	    int[] v2 = {6, 11, 12};
	    Deck deck2 = new Deck(r2, s2, v2);
	    System.out.println("Deck 2 is not empty: " + !deck2.isEmpty());
	    
	    String[] r3 = {"10", "4", "Queen"};
	    String[] s3 = {"Hearts", "Diamonds", "Clubs"};
	    int[] v3 = {10, 4, 12};
	    Deck deck3 = new Deck(r3, s3, v3);
	    System.out.println("Dealt card from Deck 3: " + deck3.deal());

        System.out.println("\nShuffled Cards:");
    
        String[] R2 = new String[52];
        String[] S2 = new String[52];
        int[] pointValues2 = new int[52];
		
        for (int i = 0; i < 52; i++) 
		{
            String rank = "";
            String suit = "";
            
			if ( (i+1) % 13 == 11 ) 
			{
                rank = "Jack";
            }
            else if ( (i+1) % 13 == 12 ) 
			{
                rank = "Queen";
            }
            else if ( (i+1) % 13 == 0 ) 
			{
                rank = "King";
            }
            else if ( (i+1) % 13 == 1 ) 
			{
                rank = "Ace";
            }
            else 
			{
                rank = Integer.toString((i + 1) % 13);
            }
            
            if (i < 13) 
			{
                suit = "Hearts";
            }
            else if (i < 26) 
			{
                suit = "Diamonds";
            }
            else if (i < 39) 
			{ 
                suit = "Clubs";
            }
            else 
			{
                suit = "Spades";
            }
            
            R2[i] = rank;
            S2[i] = suit;
            pointValues2[i] = ((i+1) % 13);
        }
        
        Deck e = new Deck(R2, S2, pointValues2);
        System.out.println(e);
    }
}