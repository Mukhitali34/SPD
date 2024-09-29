package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        Switchable light = new Light();
        Button button = new Button(light);
        button.press();  // Turns the light on
    }
}
