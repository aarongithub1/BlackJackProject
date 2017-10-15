package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> hand;

	public Hand() {
		hand = new ArrayList<>();
	}

	public Hand(List<Card> hand) {
		this.hand = hand;
	}

	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void showHand() {
		System.out.println(hand);
	}

	public List<Card> getHand() {
		return hand;
	}

	public int calculateHandValue() {
		int value = 0;
		for (int i = 0; i < hand.size(); i++) {
			value += hand.get(i).getRank().getValue();
		}
		return value;
	}

}
