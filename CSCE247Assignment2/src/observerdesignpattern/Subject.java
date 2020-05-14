package observerdesignpattern;
//George Pegues
public interface Subject  {
	/**
	 * Interface to set the following methods for later use in class extensions
	 * @param observer
	 */
	
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
