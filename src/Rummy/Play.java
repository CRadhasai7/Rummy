package Rummy;


import java.io.*;

public class Play {
	
	public static int gameTurns = 0;
	
	
	public static void show(Card card, String display){
		System.out.println(display + " " + card.getRank() + " of " 
				+ card.getShapes());
	}
	
	
	public static void main(String[] args) {
		
		Deck deck1 = new Deck(); 	// get a new deck
		deck1.shuffle();			// shuffle the deck
		Deck deck2 = new Deck();
		deck2.shuffle();
		
		Discard discard1 = new Discard();
		Player player1 = new Player(deck1.getStartingHand());	// create new player with a starting hand from the deck
		player1.getPlayerName();// sets player name
		Player player2 = new Player(deck2.getStartingHand());
		player2.getPlayerName();
		discard1.setTop(deck1.getTopCard());
		for(int i=0; i<24;i++)
		{	
	//	player1.organizeHand();		// organize the player hand
		System.out.println(player1.getName());
		player1.printHand();		// show player hand
//		player1.findOfAKinds();
		player1.findStraights();
		
		  
			show(discard1.getTop(), "Top Of Discard:");
			if(player1.deckOrDiscard() == "Discard"){
				player1.addCard(discard1.takeTop());
			}
			else{
				player1.addCard(deck1.getTopCard());
			}
	//		player1.printHand();
			discard1.setTop(player1.dropCard());
	//		player1.organizeHand();
	//		player1.findOfAKinds();
			player1.findStraights();
			player1.win();
			if(player2.won_the_game == true) {
				break ;
			}
			player1.printHand();
			System.out.println("----------------------------------------------------------------------------------------");
	//		player2.organizeHand();		// organize the player hand
			System.out.println(player2.getName());
			player2.printHand();		// show player hand
			
			player2.findStraights();
	//		player2.findOfAKinds();
			player2.win();
			  
				show(discard1.getTop(), "Top Of Discard:");
				if(player2.deckOrDiscard() == "Discard"){
					player2.addCard(discard1.takeTop());
				}
				else{
					player2.addCard(deck2.getTopCard());
				}
	//			player2.printHand();
				discard1.setTop(player2.dropCard());
	//			player2.organizeHand();
				player2.findStraights();
			//	player2.findOfAKinds();
				player2.win();
				if(player2.won_the_game == true) {
					break ;
				}
				player2.printHand();
				System.out.println("----------------------------------------------------------------------------------------");
		}	
		System.out.println(player1.getName());
		System.out.println(player1.countPoints());	
		System.out.println(player2.getName());
		System.out.println(player2.countPoints());
		
		
		
		
		
	}
}