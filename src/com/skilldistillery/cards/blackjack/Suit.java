package com.skilldistillery.cards.blackjack;

public enum Suit {
	HEARTS('\u2665'),
	SPADES('\u2660'),
	CLUBS('\u2663'),
	DIAMONDS('\u2666');
	
	private int suitsInUnicode;

	private Suit(int suitsInUnicode) {
		this.suitsInUnicode = suitsInUnicode;
	}

	public int getSuitsInUnicode() {
		return suitsInUnicode;
	}
	

}
