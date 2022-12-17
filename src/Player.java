import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Encapsulate 
	private int score;
	private String name;
	private List<Card> hand = new ArrayList<Card>();

	// Constructor
	public Player(String name) {
		this.name = name;
		score = 0;
	}

	// Required Methods
	public void incrementScore() {
		score++;
	}

	// prints out information about the player and calls the describe method for
	// each card in the Hand List)
	public void describe() {
		System.out.println(name + ": ");
		for (Card card : hand) {
			System.out.println(card.describe());
		}
	}

	// Draw Card
	// Adds a card from the Deck to our hand ArrayList
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	// Play first card in players deck
	public Card flip() {
		return hand.remove(0);
	}

	// Getters
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public String describeScore() {
		return name + ": " + score;
	}

	
}
