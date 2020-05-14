package observerdesignpattern;
//George Pegues
/**
 * Purpose of this class is to calculate current score for each hole
 * wipes memory after each play to only retain current data unlike RoundScoreDisplay
 * @author Georg
 *
 */
public class HoleScoreDisplay implements Observer{

	/**
	 * Intializing variables below
	 * Subject in reference to the subject interface
	 */
	public int strokes;
	public int par;
	private Subject golfer;
	
	public HoleScoreDisplay(Subject golfer)
	{
		/**
		 * By updating the golfer with the current this.golfer information 
		 * it maintains an updated data collection
		 */
		this.golfer = golfer;
		golfer.registerObserver(this);
	}
	
	public void update(int strokes, int par)
	{
		/**
		 * Accurately updates variables 'par' and 'strokes' by setting both variables to their
		 * concurrent subsequent variables but with updated data
		 * then enacts the displayCurrentScore
		 */
		this.par = par;
		this.strokes = strokes;
		displayCurrentScore();
	}
	
	public void displayCurrentScore()
	{
		/**
		 * Simple if-else loop to compute if the player made or went above or below par
		 * This method could have implemented with a while-loop, but retained its simplicity 
		 * with this loop.
		 */
		System.out.println("Current Hole stats: \n Par: " + par + "\n Strokes: " + strokes);
		if(strokes == par)
		{
			System.out.println("Made Par");
		}
		else if(strokes > par)
		{
			System.out.println((strokes - par) + " over par");
		}
		else if(strokes < par)
		{
			System.out.println((par - strokes) + " under par");
		}
	}

}
