public class DecoyDuck extends Duck{
    DecoyDuck(){
        flyBehavior = new FlyNowWay();
        quackBehavior = new MuteQuack();
        swimBehavior = new Drown();
    }
    @Override
    public void display() {
        System.out.println("This is Decoy Duck");
    }
}
