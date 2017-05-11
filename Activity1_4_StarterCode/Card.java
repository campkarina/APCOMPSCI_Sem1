/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card 
{

	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) 
	{
		this.rank = cardRank;
		this.suit = cardSuit;
        this.pointValue = cardPointValue;
	}

	public String rank() 
	{
		return this.rank;
	}
	
	public String suit() 
	{
		return this.suit;
	}

	public int pointValue() 
	{
		return this.pointValue;
	}

	public boolean matches(Card otherCard) 
	{
		if (this.rank.equals(otherCard.rank) && this.suit.equals(otherCard.suit) && this.pointValue == otherCard.pointValue) 
		{
           return true;
        }
        return false;
	}

	@Override
	public String toString() 
	{
		return this.suit + " of " + this.rank + " (point value = " + this.pointValue + ")";
	}
}
