package main.app;

public class MuteQuack implements QuackBehavior {

    @Override
    public String quack() {
        return "<< Silence >>";
    }
    
}
