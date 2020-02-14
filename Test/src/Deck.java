import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	

	private String name;
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	enum Suit {HEARTS, DIAMONDS, SPADES, CLUBS};
	
	enum CardValues {ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9),
		TEN(10), JACK(10), QUEEN(10), KING(10);

	private int cardValue;
	CardValues(int i) {
		// TODO Auto-generated constructor stub
		setCardValue(i);
	}
	public int getCardValue() {
		return cardValue;
	}
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}};
	
	Deck (String name) {
		this.name = name;
		this.initDeck();
	}
	
	public void initDeck () {
		for (Suit suit : Suit.values()) {
			for (CardValues cardValues : CardValues.values()) {
				deck.add(new Card(suit,cardValues));
			}
		}
	}
	
	public void displayDeck() {
		deck.forEach(s -> System.out.println(s.getCardDisplay()));
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
		
	}
	
	public Card takeCard() {
		Card cardToDeal = deck.get(0);
		deck.remove(cardToDeal);
		return cardToDeal;
	}
	
	// Getters & Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}

	public int cardsLeft () {
		return this.deck.size();
	}

}
