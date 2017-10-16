# BlackJack Project

Blackjack

Classes used:

Card,
Deck,
Hand,
Suit,
Rank,
Dealer,
Player,
BlackJackMain,
GameEngine.




Application Overview

Use classes to create a functional command line blackjack game. Leave the game's functionality until the end, first get the class structure figured out. From here you can implement methods and fields to store data you think you would need during a blackjack game. 

You'll push your project to a Github repo named BlackJackProject. Be sure to include a README.md.

User Story #1

Create a class structure that mimics a deck of cards. Remember decks as well as a hand of cards are made up of cards. Feel free to create the structure in any way you see fit. hint We did a lab in Chapter 6 of this week that dealt with a deck of cards.

Your card and deck implementations should NOT be coupled to Blackjack; you should be able to reuse them to implement a poker or bridge game application.

User Story #2

Add methods and fields to your classes that mimic the functionality of shuffling and dealing a deck of cards. Remember that when a card is dealt you have to remove it from the current deck! You should be able to print out a shuffled deck to the terminal.

User Story #3

Deal two hands of cards - one to a Dealer and another to a Player. Allow the players to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance to the rules of blackjack shown in the wiki. Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 to start.

User Story #4

Implement the remaining rules of blackjack so you can determine a winner of each round.

Stretch Goals

Try as many of these as you like, but ONLY after you've completed, tested, and COMMITTED your working game that meets the requirements.

Allow multiple players in the game.

Implement a monetary system so players can place bets on their hands.

Allow players to split hands.

Allow players to double down.

Deal from a multi-deck shoe.

Keep going! How about implementing in-game suggestions based on the player's current hand? Maybe a card-counting player?

Grading

This is a graded project. You are expected to have your project completed by the start of class on Monday morning.

You will be given either a pass or fail based on whether your code works given all of the following test conditions:

Your program must NOT be contained in one procedural main(). You MUST design a OO class structure.

When the game begins both the player and dealer are dealt two cards.

If a player or dealer is dealt 21 the game is over. Otherwise the player can choose to hit or stay.

Once the player has completed their turn the dealer will begin their turn.

The game is immediately over if either player gets above 21.

If the project does work with all of the above test conditions, you will be given a 1 for this week's project.

If the project does not work with the above test conditions, you will be given a 0 for this week's project.

If you get a zero on the project, you can upgrade to a score of .5 if you turn in a working project by the start of class on the following Monday morning AND notify an instructor that you wish to get partial credit.

To turn in a project, you must push it to GitHub. You must include a README.md that describes how to run your program. Include an overview of the class structure you chose to use.