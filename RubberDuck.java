public class RubberDuck extends Duck {
    RubberDuck(){
        flyBehavior = new FlyNowWay();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }


    @Override
    public void display() {
        System.out.println("This is Rubber Duck");
    }
}
