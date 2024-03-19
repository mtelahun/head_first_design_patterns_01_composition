package main.app;
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuakBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}