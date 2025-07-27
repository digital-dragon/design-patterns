public class StrategyPatternDemo {
    public static void main(String[] args) {
        Bomber bomber = new Bomber(new BomberBehavior());
        bomber.performOperation();
        Fighter fighter = new Fighter(new FighterBehavior());
        fighter.performOperation();
        Transporter transporter = new Transporter(new TransportBehavior());
        transporter.performOperation();
    }
}
