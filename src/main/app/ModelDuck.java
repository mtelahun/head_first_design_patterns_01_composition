package main.app;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Sqeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
    
}
