import java.util.List;
import java.util.ArrayList;

public class Deck 
{
    private List<Card> cards;
    private int size;

    public Deck(String[] ranks, String[] suits, int[] values) 
	{
        this.cards = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++) 
		{
            Card C = new Card(suits[i], ranks[i], values[i]);
            this.cards.add(C);
        }
        this.size = this.cards.size();
        shuffle();
    }

    public boolean isEmpty() 
	{
        if (this.cards.size() == 0) 
		{
            return true;
        }
        return false;
    }

    public int size() 
	{
        return this.cards.size();
    }

    public void shuffle() 
	{
		for(int s = size - 1; s >= 0; s--) 
		{
            int r = (int)(Math.random() * s);
            Card t = cards.get(r);
            cards.set(r, cards.get(s));
            cards.set(s,t);
        }
    }

    public Card deal() 
	{
        this.size = this.size - 1;
        if (this.size > 0) 
		{
            return this.cards.get(this.size);
        }
        return null;
    }

    @Override
    public String toString() 
	{
        String rtn = "Size = " + size + "\n\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) 
		{
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) 
			{
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) 
		{
            rtn = rtn + cards.get(k);
            if (k != size) 
			{
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) 
{
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    } 
}