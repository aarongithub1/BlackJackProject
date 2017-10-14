package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> deck;
	private int numberOfCardsDelt = 0;
	private Card card;
	private Rank rank;
	private Suit suit;
	
	public Deck() {
		deck = new ArrayList<>();
	}
	
	public Deck(List<Card> deck, int numberOfCardsDelt) {
		this.deck = deck;
		this.numberOfCardsDelt = numberOfCardsDelt;
	}

	public List<Card> getDeck() {
		return deck;
	}

	public int getNumberOfCardsDelt() {
		return numberOfCardsDelt;
	}
	
	public void createDeck() {
		for (int i = 0; i < Suit.values().length; i++) {
			for (int j = 0; j < Rank.values().length; j++) {
				card = new Card(Rank.values()[j], Suit.values()[i], j);
				System.out.println(card);
				deck.add(card);
			}
		}
	}
}
