public class CoffeePot extends Subject {
    private String state;

    public CoffeePot() {
        state = "empty";
    }

    public void fill() {
        state = "full";
        notifyObservers(state);
    }

    public void empty() {
        state = "empty";
        notifyObservers(state);
    }
}
