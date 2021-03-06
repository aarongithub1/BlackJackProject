package com.skilldistillery.cards.blackjack;

public class Dealer {
	private Deck deck;
	private Hand hand;

	public Dealer() {
		deck = new Deck(); 
		hand = new Hand();
	}
	
	public void createDeck() {
		deck.createDeck();
	}
	
	public void shuffleDeck() {
		deck.shuffle();
	}
	
	public Card dealCard() {
		return deck.removeCardFromDeck();
	}
	
	public void addCardToHand(Card card) {
		hand.addCard(card);
	}
	
	public void showHand() {
		hand.showHand();
	}
	
	public void showTopCard() {
		System.out.println(hand.getHand().get(1));
	}
	
	public void makeNewHand() {
		hand = new Hand();
	}
	
	public int checkDeckSize() {
		return deck.getDeck().size();
	}

//	public int currentCardValue() {
//		return hand.calculateHandValue();
//	}
	
	public Hand getHand(){
		return hand;
	}
	
}
