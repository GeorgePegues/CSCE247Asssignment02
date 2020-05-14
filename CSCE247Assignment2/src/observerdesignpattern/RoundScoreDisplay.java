package observerdesignpattern;
//George Pegues
public class RoundScoreDisplay implements Observer {

	/**
	 * Similar to the HoleScoreDisplay,
	 * intializes variables then becomes a bit different
	 * Sets a unique variable name to the original 'strokes' variable
	 * then repeats those steps with the 'par' function
	 * by setting 'apar' equal to par 
	 * this will not directly effect the par or strokes variables by will allow for manipulation
	 */
	public Subject golfer;
	private int strokes;
	private int dstrokes = strokes;
	private int par;
	private int apar = par;
	
	
	public RoundScoreDisplay(Subject golfer)
	{
		this.golfer = golfer;
		golfer.registerObserver(this);
	}
	
	public void update(int strokes, int par)
	{
		/**
		 * Similiar to the HoleScoreDisplay update method 
		 * yet it is different in the sense that it utilizes the maniupulated variable 
		 * to act as a counter and keep track of previous integers
		 * then utilizes the displayRoundScore to show the information
		 */
		apar += par;
		dstrokes += strokes;
		strokes = this.strokes;
		par = this.par;
		displayRoundScore();
	}
	


	public void displayRoundScore()
	{
		/**
		 * Identical method to the ScoreDisplay in HoleScore, just with a bit of modified syntax to 
		 * assure the user that this is a sum value and not a miscalculation
		 */
		System.out.println("Round stats: \n Par: " + apar + "\n Strokes: " + dstrokes);
		if(dstrokes == apar)
		{
			System.out.println("Made Par");
		}
		else if(dstrokes > apar)
		{
			System.out.println((dstrokes - apar) + " over par");
		}
		else if(dstrokes < apar)
		{
			System.out.println((apar - dstrokes) + " under par");
		}
	}
}
