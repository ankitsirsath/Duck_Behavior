public class MallardDuck extends Duck{

    MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }
    @Override
    public void display() {
        System.out.println("This is Mallard Duck");
    }
}
