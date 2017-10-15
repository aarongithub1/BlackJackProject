package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Game {
	static Scanner kb = new Scanner(System.in);
	static String selection = "";
	static Boolean winner = false;

	public static void main(String[] args) {
		welcome();
	}

	public static void welcome() {
		Dealer dealer = new Dealer();
		Player player = new Player();

		dealer.createDeck();
		dealer.shuffleDeck();

		System.out.println("Welcome to my BlackJack game!\n\n");

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

		if (player.getHand().calculateHandValue() == 21) {
			System.out.println("Player wins!");
			winner = true;
		}

		System.out.print("Dealer was dealt a : ");
		dealer.showTopCard();

		System.out.println("Players card total is: " + player.getHand().calculateHandValue());

		while (winner != true) {

			System.out.print("Pres 'h' for \"Hit\" or 's' for \"Stick\": ");
			selection = kb.next();

			while (!(selection.equals("h") || (selection.equals("s")))) {

				// checks to see if the player is pressing an h or an s (continues to ask until
				System.out.print("Pres 'h' for \"Hit\" or 's' for \"Stick\": ");
				selection = kb.next();
			}

			if (selection == "h") {
				if (player.getHand().calculateHandValue() == 21) {
					System.out.println("Player wins!");
					winner = true;
					break;
				} else {
					// h will hit and add another card
					player.getHand(dealer.dealCard());
					player.showHand();
					System.out.println("Players card total is: " + player.getHand().calculateHandValue());
				}

			}

			else if (dealer.getHand().calculateHandValue() == 21) {
				System.out.println("Dealer wins!");
				winner = true;
			} else if (selection == "s") {
				dealer.showHand();
				dealer.addCardToHand(dealer.dealCard());
				System.out.println("Dealers card total is: " + dealer.getHand().calculateHandValue());
				break;
			}
		}
	}

}
