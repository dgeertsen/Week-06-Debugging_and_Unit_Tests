import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	//Encapsulate 
	private List<Card> cards = new ArrayList<Card>();
	private List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");

	// Constructor
	public Deck() {
		for (int i = 2; i < 15; i++) {
			for (String suit : suits) {
				cards.add(new Card(i, suit));
			}
		}

	}

	// Shuffle our Deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Removes card from ArrayList and returns it
	public Card draw() {
		return cards.remove(0);
	}
	
	
	// Prints out deck, to show we arent palying tricks
	public void describe() {
		for (Card card : cards) {
			System.out.println(card.describe());
		}
	}

}
