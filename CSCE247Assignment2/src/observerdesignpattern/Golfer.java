package observerdesignpattern;
import java.util.ArrayList;
//George Pegues III
public class Golfer implements Subject {
	
	/**
	 * Creates a private array list for observers, allocating space for more observers
	 * Intializing integer variables for later use
	 * Code that is commented out was used to get me here
	 */
	private ArrayList<Observer> observers;
	private int strokes;
	private int par;
	String name = "";
	
	
	public Golfer(String string) 
	{
		observers = new ArrayList<Observer>();
		this.name = string;
		/**
		 * Assigns 'observers' to a new ArrayList
		 */
	}
	

	public void registerObserver(Observer observer) 
	{
		observers.add(observer);
		/**
		 * Add method, used to add observers
		 */
	}

	public void removeObserver(Observer observer) 
	{
		observers.remove(observer);
		/**
		 * Remove method
		 * not used in this implementation but would be used to remove 
		 * an observer.
		 */
		
	}

	public void notifyObservers() 
	{
		for(Observer observer : observers) 
		{
			observer.update(strokes,par);
		}
		/**
		 * Sets observer update frequency with required variables
		 */
	}
	
	public void enterScore(int strokes, int par) 
	{
		this.strokes = strokes;
		this.par = par;
		notifyObservers();
		/**
		 * Sets instance variable to current variable that have real data
		 * then implements notifyObserver method
		 * more on that within
		 */
	}

	
	public String getName() 
	{
		// TODO Auto-generated method stub
		return name;
		/**
		 * Used to set player name
		 */
	}

}
