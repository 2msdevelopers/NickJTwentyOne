import java.util.ArrayList;

public class TwentyOne {

	public TwentyOne() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck("Nick");
		//System.out.println ("New Crisp deck -->");
		//deck.displayDeck();
		
		deck.shuffle();
		System.out.println ("Shuffled deck -->");
		System.out.println ("");
		
		//deck.displayDeck();
		System.out.println ("(Cards left in deck = " + deck.cardsLeft()+")");
		System.out.println ("");
		// Deal cards 1 by 1 and play until bust -->
		
		int handTotal = 0;
		ArrayList<Card> hand = new ArrayList<Card>();
		Card newCard = null;
		System.out.println("Your Hand -->");
		
		do {
			newCard = deck.takeCard();
			hand.add(newCard);
			handTotal = handTotal + newCard.getValue().getCardValue();
			
			System.out.println("");
			
			hand.forEach(s -> System.out.println(s.getCardDisplay()));
			System.out.println(hand.toString());
			
			System.out.println("");
			
			System.out.println ("Hand Total = " + handTotal + " (Cards left in deck = " + deck.cardsLeft()+")");
			System.out.println("");
			if (handTotal > 21) {
				System.out.println("BUST !");
			} else if (handTotal == 21){
				System.out.println("BINGO - TWENTY ONE !");
			} else if (handTotal >18 ) {
				System.out.println("Sticking right here...");
			} else {
				System.out.println("Twist - draw card...");
			}
			
		} while (handTotal < 19); //stop if 18+ reached
		
	}

}
