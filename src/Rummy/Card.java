package Rummy;

public class Card {
	
	private Rank rank;
	private Shapes Shapes;
	private boolean inPlay = false;
	private boolean inStraight = false;
	private boolean inOfAKind = false;
	private boolean inDiscard = false; 
	
	Card(){}
	
	Card(Rank rank, Shapes Shapes){
		//need to check that rank and Shapes given are valid
		this.rank = rank;
		this.Shapes = Shapes;
	}
	
	Card(int rankNum, int ShapesNum){
		//need to check that rankNum is between 0-12 & ShapesNum is between 0-3
		for (Rank r : Rank.values()){
			if(r.ordinal() == rankNum)
				this.rank = r;
		}
		for (Shapes s : Shapes.values()){
			if(s.ordinal() == ShapesNum)
				this.Shapes = s;
		}
	}

	public int getPoints(){
		return this.rank.points;
	}
	
	public int getOrder(){
		return this.Shapes.order;
	}
	
	public Rank getRank(){
		return this.rank;
	}
	
	public Shapes getShapes(){
		return this.Shapes;
	}
	
	public boolean getInPlay(){
		return inPlay;
	}
	
	public void setInPlay(boolean inPlay){
		this.inPlay = inPlay;
	}
	
	public boolean getInStraight(){
		return this.inStraight;
	}
	
	public void setInStraight(boolean inStraight){
		this.inStraight = inStraight;
	}
	
	public boolean getInOfAKind(){
		return this.inOfAKind;
	}
	
	public void setInOfAKind(boolean inOfAKind){
		this.inOfAKind = inOfAKind;
	}
}
