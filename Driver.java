public class Driver {
    public static void main(String[] args) {
        CoffeePot pot = new CoffeePot();

        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        pot.addObserver(alice);
        pot.addObserver(bob);

        pot.fill();
        pot.empty();
    }
}
