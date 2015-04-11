package example.observerpattern;

/**
 * Created by debnaths on 16/03/15.
 */
public interface Observable {

    public void addObserver(Observer observer);
    public void removeObservable(Observer observer);
    public void notifyObservers();

}
