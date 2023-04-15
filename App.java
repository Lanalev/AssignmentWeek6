package Assignment;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffle();
		deck.describe();
		System.out.println("------------------");

		Player player1 = new Player("Loki");
		Player player2 = new Player("Arti");

		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}

		}
		player1.describe();
		System.out.println("-----------------");
		player2.describe();
System.out.println("=============================");
		
for (int i = 1; i <=26; i++) {
	
	Card pOneFlippedCard = player1.flip();
	Card pTwoFlippedCard = player2.flip();
	System.out.println(player1.name + " drew");
	pOneFlippedCard.describe();
	System.out.println(player2.name + " drew");
	pTwoFlippedCard.describe();

	if (pOneFlippedCard.value > pTwoFlippedCard.value) {
		player1.incrementScore();
		
		System.out.println(player1.score);
		System.out.println(player2.score);
		System.out.println(player1.name + " wins");
		System.out.println("++++++++++++++++++++++++++++");
	} else if (pOneFlippedCard.value < pTwoFlippedCard.value){
		player2.incrementScore();
		
		System.out.println(player1.score);
		System.out.println(player2.score);
		System.out.println(player2.name + " wins");
		System.out.println("++++++++++++++++++++++++++++");
		
	} else {
		
		System.out.println(player1.score);
		System.out.println(player2.score);
		System.out.println("Draw");
		System.out.println("++++++++++++++++++++++++++++");
	
	}
	
}

System.out.println(player1.name + "'s final score = " + player1.score);
System.out.println(player2.name + "'s final score = " + player2.score);

System.out.println("++++++++++++++++++++++++++++");
if (player1.score > player2.score) {
	System.out.println(player1.name + " is the winner");
} else if (player1.score < player2.score) {
	System.out.println(player2.name + " is the winner");
} else {
	System.out.println("Draw");
}
}
}
	
