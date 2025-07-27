public class Fighter extends Warplane {
    public Fighter(OperationalBehavior ob) {
        operationalBehavior = ob;
    }

    @Override
    public void performOperation() {
        operationalBehavior.operate();
    }
}
