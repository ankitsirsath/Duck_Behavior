public class RedHeadDuck extends Duck{
    RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }
    @Override
    public void display() {
        System.out.println("This is Red Head Duck");
    }
}
