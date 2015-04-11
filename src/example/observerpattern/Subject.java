package example.observerpattern;

import java.util.ArrayList;

/**
 * Created by debnaths on 16/03/15.
 */
public class Subject implements Observable {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    int numChanged = 0;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservable(Observer o) {
        int i = observers.indexOf(o);
        if(i != -1) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i < observers.size(); i++)
        {
            observers.get(i).update(numChanged);
        }
    }

    public void updateChange(int i){
        numChanged = i;
        notifyObservers();
    }

    public int getNumberChanged(){
        return  numChanged;
    }

}
