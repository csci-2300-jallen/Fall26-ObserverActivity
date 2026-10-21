public class Person implements Observer {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String coffeeState) {
        // Use equals() to compare the contents of Java strings.
        if (coffeeState.equals("full")) {
            System.out.println(name + " says: Yay! The coffee pot is full!");
        } else if (coffeeState.equals("empty")) {
            System.out.println(name + " says: Oh no! The coffee pot is empty");
        }
    }
}
