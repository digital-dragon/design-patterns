public abstract class Warplane {
    OperationalBehavior operationalBehavior;

    public void fly() {
        System.out.println("Flying");
    }

    public abstract void performOperation();
}
