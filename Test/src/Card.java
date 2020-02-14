public class Card {
	
	private Deck.CardValues value;
	private Deck.Suit suit;
	
	public Card (Deck.Suit suit, Deck.CardValues value) {
		this.value = value;
		this.suit = suit;
	}
	
	public Deck.Suit getSuit() {
		return suit;
	}
	public void setSuit(Deck.Suit suit) {
		this.suit = suit;
	}
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Deck.CardValues getValue() {
		return value;
	}
	public void setValue(Deck.CardValues value) {
		this.value = value;
	}
	public String getCardDisplay () {
		return this.getValue() + " of " + this.getSuit();
	}

}
