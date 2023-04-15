package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	Player(String name) {
		this.name = name;
	}
	public void describe() {
		System.out.println(name + " has ");
		for (Card card : hand) {
			card.describe();
		}
	}
		public Card flip() {
			Card flippedCard = hand.remove(0);
			return flippedCard;
		}
		public void draw(Deck deck) {
			hand.add(deck.draw());
		}
		public void incrementScore() {
			score += 1;
		}
	}

