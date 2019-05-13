package Rummy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck1 = new Deck(); 	// get a new deck
		deck1.shuffle();			// shuffle the deck
		int i;
		int t,u;
		Discard discard1 = new Discard();
		Player player1 = new Player(deck1.getStartingHand());	// create new player with a starting hand from the deck
		player1.getPlayerName();// sets player name
		Player player2 = new Player(deck1.getStartingHand());
		player2.getPlayerName();
		discard1.setTop(deck1.getTopCard());
		player1.organizeHand();		// organize the player hand
		player1.getName();
	//	player1.printHand();		// show player hand
		for(i=0; i<9; i++) {
		t = player1.myHand[i].getRank().ordinal() + 1; u =player1.myHand[i+1].getRank().ordinal(); 
		
			System.out.println(t);
			System.out.println(u);
			if(t == u) {
				System.out.println("true");
			}
			
		}
		}

}
	
