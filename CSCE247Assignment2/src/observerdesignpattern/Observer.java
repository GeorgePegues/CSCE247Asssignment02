package observerdesignpattern;
//George Pegues
public interface Observer {
	/**
	 * Utilizes the parameters accessed in child classes
	 * Renamed strokes for accurate roundScoreDisplay updating
	 * @param astrokes
	 * @param par
	 */
	public void update(int astrokes, int par);
}
