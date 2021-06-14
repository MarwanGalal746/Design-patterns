import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer>allObservers;

    public Observable() {
        allObservers = new ArrayList<Observer>();
    }

    public ArrayList<Observer> getAllObservers() {
        return allObservers;
    }

    public void attach(Observer obj){
        allObservers.add(obj);
    }

    public void deattach(Observer obj){
        allObservers.remove(obj);
    }

    abstract public void notifyAllObservers();
}
