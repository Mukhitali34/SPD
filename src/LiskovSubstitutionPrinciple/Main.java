package LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        ((Flyable) sparrow).fly(); // Only sparrows and other flying birds can call fly()

        Bird penguin = new Penguin();
        penguin.eat(); // Penguins can eat, but they can't fly
    }
}
