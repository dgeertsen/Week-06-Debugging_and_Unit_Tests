
public class App {

	public static void main(String[] args) {
		// a) Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
		Player player1 = new Player("Devon");
		Player player2 = new Player("Grader");

		// Ensure Deck is Complete
		// deck.describe();
		// System.out.println("--------------------------------------------------------------------");

		// shuffle deck
		deck.shuffle();

		// Show Deck is Still Complete
		// deck.describe();
		// System.out.println("--------------------------------------------------------------------");

		// b) Using a traditional for loop, iterate 52 times calling the Draw method on
		// the other player each iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}

		}
		// Show Player Hands
		// player1.describe();
		// player2.describe();
		// System.out.println("--------------------------------------------------------------------");
		// c) Using a traditional for loop, iterate 26 times and call the flip method
		// for each player.
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			// d) Compare the value of each card returned by the two player’s flip methods.
			// Call the incrementScore method on the player whose card has the higher value.
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println(gamePlay(player1, player2, player1Card, player2Card) + "\n" + winsRound(player1)
						+ "\nUpdated Score: " + gameScore(player1, player2));
				System.out.println("-----------------------------------------------------");
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				System.out.println(gamePlay(player1, player2, player1Card, player2Card) + "\n" + winsRound(player2)
						+ "\nUpdated Score: " + gameScore(player1, player2));
				System.out.println("-----------------------------------------------------");
			} else {
				System.out.println(gamePlay(player1, player2, player1Card, player2Card) + "\nDRAW \nUpdated Score: "
						+ gameScore(player1, player2));
				System.out.println("-----------------------------------------------------");
			}

		}

		// e) After the loop, compare the final score from each player.
		// f) Print the final score of each player and either “Player 1”, “Player 2”, or
		// “Draw” depending on which score is higher or if they are both the same.
		// Winners Circle
		if (player1.getScore() > player2.getScore())
			System.out.println(player1.getName() + " Wins Game!\nFinal Score    " + gameScore(player1, player2));
		else if (player2.getScore() > player1.getScore())
			System.out.println(player2.getName() + " Wins Game!\nFinal Score    " + gameScore(player1, player2));
		else
			System.out.println("DRAW!! \nFinal Score    " + gameScore(player1, player2));
	}

	public static String gamePlay(Player player1, Player player2, Card card1, Card card2) {
		return player1.getName() + " plays " + card1.describe() + "\n" + player2.getName() + " plays "
				+ card2.describe();
	}

	//Scoreboard
	public static String gameScore(Player player1, Player player2) {
		return player1.describeScore() + " | " + player2.describeScore();
	}

	//Method for winner of round
	public static String winsRound(Player player) {
		return player.getName() + " Wins Round";
	}

}
