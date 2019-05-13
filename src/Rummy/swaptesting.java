package Rummy;

public class swaptesting {
	public static void show(Card card, String display){
		System.out.println(display + " " + card.getRank() + " of " 
				+ card.getShapes());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck1 = new Deck(); 	// get a new deck
		deck1.shuffle();			// shuffle the deck
		
		Discard discard1 = new Discard();
		Player player1 = new Player(deck1.getStartingHand());	// create new player with a starting hand from the deck
		player1.getPlayerName();// sets player name
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
			player1.swap();
			player1.printHand();
			player1.win();
		

	}

   }
}
