package Rummy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck c = new Deck();
		
		c.shuffle();
		c.getStartingHand();
		Player r = new Player() ;
		Player s = new Player();
		r.myHand = c.getStartingHand();
		r.printHand();

	}

}
