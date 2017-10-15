package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class GameEngine2 {
	static Scanner kb;
	static String selection = "";
	static Dealer dealer;
	static Player player;

	public GameEngine2() {
		dealer = new Dealer();
		player = new Player();
		System.out.println("Welcome to my BlackJack game!\n\n");
		dealer.createDeck();
		dealer.shuffleDeck();
		kb = new Scanner(System.in);

	}

	public void newGame() {
		System.out.println();
		System.out.println("Dealt new hand");
		// player gets card 1
		player.getHand(dealer.dealCard());
		// dealer gets card 2
		dealer.addCardToHand(dealer.dealCard());

		// player gets card 3
		player.getHand(dealer.dealCard());
		// dealer gets card 4
		dealer.addCardToHand(dealer.dealCard());

		// player cards are shown
		System.out.print("Player was dealt a : ");
		player.showHand();
		// dealer TOP CARD is shown
		System.out.print("Dealer was dealt a : ");
		dealer.showTopCard();
		// Prints out the Players Calculated total
		System.out.println("Players card total is: " + player.getHand().calculateHandValue());

		if (player.getHand().calculateHandValue() == 21) {
			System.out.println("Player has 21!!");
			System.out.println("Player Wins!!");
			resetHand();
		}
		
		//player Hit loop
		do {
			System.out.print("\nPres 'h' for \"Hit\" or 's' for \"Stick\": ");
			selection = kb.next();

			if (player.getHand().calculateHandValue() <= 21 && selection.equals("h")) {

				player.getHand(dealer.dealCard());
				player.showHand();
				System.out.println("Players card total is: " + player.getHand().calculateHandValue());

			}
			if (player.getHand().calculateHandValue() > 21) {
				System.out.println("Player Busted!");
				break;
			}

		} while (selection.equals("h"));
		
		if (player.getHand().calculateHandValue() > 21) {
			resetHand();
		}
		else {
			System.out.println("Dealer flips card: ");
			dealer.showHand();
			
		}
		
		
		// Dealer Hit loop
		do {
			if (dealer.getHand().calculateHandValue() > player.getHand().calculateHandValue() 
					&& dealer.getHand().calculateHandValue() <= 21) {
				System.out.println("Dealer Wins!");
				resetHand();
				break;
			}
			
			else if (dealer.getHand().calculateHandValue() == player.getHand().calculateHandValue()
					&& dealer.getHand().calculateHandValue() <= 21) {
				System.out.println("This is a Draw.");
				resetHand();
				break;
			}
			
			
			else if (dealer.getHand().calculateHandValue() > 21) {
				System.out.println("Dealer Busted!");
				resetHand();
				break;
			}
			
			else if (dealer.getHand().calculateHandValue() <= 21) {
				dealer.addCardToHand(dealer.dealCard());
				dealer.showHand();
				System.out.println("Dealers card total is: " + dealer.getHand().calculateHandValue());
			}

		} while (selection.equals("s"));
		
		resetHand();
	}

	public void endGame() {

	}

	public void resetHand() {
		dealer.makeNewHand();
		player.makeNewHand();
		newGame();
	}

}
