public class Bomber extends Warplane {

    public Bomber(OperationalBehavior ob) {
        operationalBehavior = ob;
    }

    @Override
    public void performOperation() {
        operationalBehavior.operate();
    }
}
