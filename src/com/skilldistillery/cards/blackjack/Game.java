package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Game {
	static Scanner kb = new Scanner(System.in);
	static String selection = "";

	public static void main(String[] args) {
		welcome();
	}
	
	public static void welcome() {
		Dealer dealer = new Dealer();
		Player player = new Player();
		
		System.out.println("Welcome to my BlackJack game!");
		dealer.createDeck();
		dealer.shuffleDeck();
		
		player.getHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());
		
		player.getHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());
		
		System.out.print("Player was delt a : " );
		player.showHand();
		
		System.out.print("Dealer was delt a : " );
		dealer.showTopCard();
		
		System.out.println("Players card total is: " + player.getHand().calculateHandValue());
		do {
			System.out.print("Pres 'h' for \"Hit\" or 's' for \"Strick\": ");
			selection = kb.next();
			if(! (selection.equals("s") || selection.equals("h"))) {
				System.out.print("Pres 'h' for \"Hit\" or 's' for \"Strick\": ");
				selection = kb.next();
			}
			else {
				break;
			}
		} while (! (selection.equals("h") || selection.equals("s")));
		
		
		System.out.println("Dealers card total is: " + dealer.getHand().calculateHandValue());
		
	}

}
