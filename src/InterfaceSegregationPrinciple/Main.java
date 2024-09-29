package InterfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();

        humanWorker.work();
        ((Eatable) humanWorker).eat(); // Only humanWorker can eat

        robotWorker.work();
        // robotWorker does not implement Eatable, so no eat() method here
    }
}
