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

		// welcome message
		System.out.println("Welcome to my BlackJack game!\n\n");

		Dealer dealer = new Dealer();
		Player player = new Player();

		// create deck
		dealer.createDeck();
		// shuffle deck
		dealer.shuffleDeck();

		// BEGINNING OF DO/WHILE LOOP
		do {

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
			
			// checks player cards for 21
			if (player.getHand().calculateHandValue() == 21) {
				System.out.println("Player has 21!!");
				System.out.println("Player must stick.");
				
				// Dealer FLIPS card
				System.out.println("\nDealer flips cards over to reviel: ");
				
				// Dealer draws until 21 or goes bust
				do {

//					// Deal will SHOW hand and HIT while CALCULATE < 17
//					while(dealer.getHand().calculateHandValue() <= 21) {
						
						// Dealer shows both cards
						dealer.showHand();
						
						// Dealer CALCULATES hand total
						System.out.println("Dealers card total is: " + dealer.getHand().calculateHandValue());
						
						// Dealer breaks out of first while loop @ 21
						if(dealer.getHand().calculateHandValue() == 21) {
							System.out.println("This is a DRAW!");
							break;
						}
						else if (dealer.getHand().calculateHandValue() > 21) {
							System.out.println("Dealer goes bust! Player Wins this hand!!\n");
						}
						
						// Dealer ADDS card to hand
						dealer.addCardToHand(dealer.dealCard());
					
				// END of do/while loop
				} while (dealer.getHand().calculateHandValue() <= 21);
				
				
				
				
//				winner = true;
			}
			
			// ELSE if player HAS < 21
			else if (player.getHand().calculateHandValue() < 21){
				
				// ask to hit or stick
				System.out.print("\nPres 'h' for \"Hit\" or 's' for \"Stick\": ");
				selection = kb.next();
				
				// checks if the player pressed H or S
				while (!(selection.equals("h") || (selection.equals("s")))) {
					
					//ask to hit or stick
					System.out.print("\nPres 'h' for \"Hit\" or 's' for \"Stick\": ");
					selection = kb.next();
					
				}
				
				
			} // End of if/else for checking player 21 value
			
			// if Player selects HIT
			if (selection == "h") {
				
				// Player ADDS CARD TO HAND
				player.getHand(dealer.dealCard());
				// Player SHOWS HAND
				player.showHand();
				// Player Calculates total
				System.out.println("Players card total is: " + player.getHand().calculateHandValue());
				
				if (player.getHand().calculateHandValue() == 21) {
					System.out.println("Player wins!");
					winner = true;
					break;
				} else if (selection == "s") {
					// Message to Player - Player stick @ calc total
					System.out.println("Player Sticks at: " + player.getHand().calculateHandValue());
					
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
			// Prints out the Dealers Calculated total
			System.out.println("Dealers card total is: " + dealer.getHand().calculateHandValue());
			
		} while (winner != true); // END of do/while loop

	} // End of Welcome Method
	
} // End of CLASS

//					// h will hit and add another card
//					player.getHand(dealer.dealCard());
//					player.showHand();
//					System.out.println("Players card total is: " + player.getHand().calculateHandValue());