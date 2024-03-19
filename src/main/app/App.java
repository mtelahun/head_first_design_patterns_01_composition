package main.app;
public class App {
    public static void main(String[] args) throws Exception {
        Duck mallard = new MallardDuck();
        String quack = mallard.performQuack();
        System.out.println(String.format("%s", quack));

        String fly = mallard.performFly();
        System.out.println(String.format("%s", fly));
    }
}
