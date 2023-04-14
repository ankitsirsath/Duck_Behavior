public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;
    abstract public void display();

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    public void setSwimBehavior(SwimBehavior sb){
        swimBehavior = sb;
    }
    public void performQuack(){
        flyBehavior.fly();
    }

    public void performFly(){
        quackBehavior.quack();
    }
    public void performSwim(){
        swimBehavior.swim();
    }



}
