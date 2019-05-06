package Rummy;


import java.io.*;

public class Play {
	
	public static int gameTurns = 0;
	public static boolean knock = false;
	
	public static void show(Card card, String display){
		System.out.println(display + " " + card.getRank() + " of " 
				+ card.getShapes());
	}
	
	
	public static void main(String[] args) {
		
		Deck deck1 = new Deck(); 	// get a new deck
		deck1.shuffle();			// shuffle the deck
		
		Discard discard1 = new Discard();
		Player player1 = new Player(deck1.getStartingHand());	// create new player with a starting hand from the deck
		player1.getPlayerName();// sets player name
		discard1.setTop(deck1.getTopCard());
		for(int i=0; i<24;i++)
		{	
		player1.organizeHand();		// organize the player hand
		player1.getName();
	//	player1.printHand();		// show player hand
		
		
		  
			show(discard1.getTop(), "Top Of Discard:");
			if(player1.deckOrDiscard() == "Discard"){
				player1.addCard(discard1.takeTop());
			}
			else{
				player1.addCard(deck1.getTopCard());
			}
			discard1.setTop(player1.dropCard());
			player1.organizeHand();
		//	player1.printHand();
			System.out.println("----------------------------------------------------------------------------------------");
		}	
			
		
		//deck1.printDeck();
		
		
		
		
	}
}