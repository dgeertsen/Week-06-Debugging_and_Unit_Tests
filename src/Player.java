import java.util.ArrayList;
import java.util.List;

public class Player {
		private int score;
		private String name;
		private List<Card> hand=new ArrayList<Card>();
		
		
		
		
		//Constructor
		public Player (String name) {
			this.name=name;
			score=0;
		}
		

		//Required Methods
	    public void incrementScore() {
	        score++;
	    }
	    
	    //prints out information about the player and calls the describe method for each card in the Hand List)
	    public void describe() {
	        System.out.println(name+": ");
	        for (Card card : hand) {
	            System.out.println(card.describe());
	        }
	    }
	    
	    
	    //Draw Card
	    public void draw(Deck deck) {
	    	hand.add(deck.draw());
	    }
	    
	    //Play first card in players deck
	    public Card flip() {
	    	return hand.remove(0);
	    }
	    
 
	 
	    
	    //Getters
	    public int getScore() {
	        return score;
	    }
	    public String getName() {
	        return name;
	    }
	    public String describeScore() {
	    	return name+": "+score;
	    }
		
	    //No Setters because we don't want to player to change score or name
}
