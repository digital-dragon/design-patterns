public class Transporter extends Warplane {
    public Transporter(OperationalBehavior ob) {
        operationalBehavior = ob;
    }

    @Override
    public void performOperation() {
        operationalBehavior.operate();
    }

}
