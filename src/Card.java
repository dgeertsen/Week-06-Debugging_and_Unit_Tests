
public class Card {

	//Encapsulate 
	private int value;
	private String name;

	
	// Constructor
	public Card(int value, String suit) {
		setValue(value);
		setName(value, suit);
	}

	// Getters
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	// Setters but make private using encaspulation. Only call in constructor
	private void setName(int value, String suit) {
		switch (value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;
		}

		name += " of " + suit;
	}
	private void setValue(int value) {
		this.value=value;
	}

	// Special Return for my game
	public String describe() {
		return getName() + " - " + getValue();
	}


}
