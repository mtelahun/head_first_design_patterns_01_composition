package main.app;

public class MuteQuack implements QuakBehavior {

    @Override
    public String quack() {
        return "<< Silence >>";
    }
    
}
