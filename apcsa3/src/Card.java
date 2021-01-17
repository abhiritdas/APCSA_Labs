//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
	String suit;
	int face;

	//constructors
	public Card(String suit, int face) {
		this.suit = suit;
		this.face = face;


	}
	public void suit() {
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	}
	public void face() {
		int[] face = {};

	}

	public String getSuit() {

		return this.suit;

	}
	public int getFace() {
		return this.face;
	}
	public void setFace(int tFace) {
		this.face = tFace;
	}
	public String toString() {
		return FACES[this.face] + " of " + suit;
	}

}