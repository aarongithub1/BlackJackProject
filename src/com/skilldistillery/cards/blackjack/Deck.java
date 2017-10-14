package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck;
	private int numberOfCardsDelt = 0;
	private Card card;
//	private Rank rank;
//	private Suit suit;
	
	
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
				deck.add(card);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card removeCardFromDeck() {
		return deck.remove(0);
	}
}



//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		for (int i = 0; i < deck.size(); i++) {
//				builder.append(deck.get(i).getRank());
//				builder.append(" of ");
//				builder.append(deck.get(i).getSuit());
//				builder.append(" is in slot " + deck.get(i).getValue() + " of the ENUM\n");
//			}
//		return builder.toString();
//	}