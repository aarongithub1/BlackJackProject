package com.skilldistillery.cards.blackjack;

public class Card {
	private Rank rank;
	private Suit suit;
	private int value;
//	private char[] suitChar = {'\u2665', '\u2660', '\u2663', '\u2666'};
	
	public Card() {
		
	}
	
	public Card(Rank rank, Suit suit, int value) {
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}
	
	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(rank);
		builder.append(" of ");
		builder.append(suit);
		builder.append(" Card value is " + rank.getValue());
		return builder.toString();
	}
	
}
