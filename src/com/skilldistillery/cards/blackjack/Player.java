package com.skilldistillery.cards.blackjack;

public class Player {
	private Hand hand;
	
	public Player() {
		hand = new Hand();
	}
	
	public Player(Hand hand) {
		this.hand = hand;
	}
	
	public void getHand(Card card) {
		hand.addCard(card);
	}
	
	public void showHand() {
		hand.showHand();
	}
	
	public Hand getHand(){
		return hand;
	}

}
