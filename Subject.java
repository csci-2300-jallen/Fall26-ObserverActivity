import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        // Remove every occurrence, just like the C++ version.
        while (observers.remove(observer)) {
            // Keep removing until no matching observer remains.
        }
    }

    public void notifyObservers(String state) {
        for (Observer observer : observers) {
            if (observer != null) {
                observer.update(state);
            }
        }
    }
}
