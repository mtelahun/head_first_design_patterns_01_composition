package main.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.app.MallardDuck;
import main.app.ModelDuck;

public class DuckTest {
    @Test
    public void givenMallardDuckWhenInvokeFlyThenReturnImFlying() {
        // Arrange
        MallardDuck duck = new MallardDuck();

        // Act
        String behavior = duck.performFly();

        // Assert
        assertEquals(
            "I'm flying!!",
            behavior
        );
    }

    @Test
    public void givenMallardDuckWhenInvokeQuakBehaviorThenReturnQuack() {
        // Arrange
        MallardDuck duck = new MallardDuck();

        // Act
        String behavior = duck.performQuack();

        // Assert
        assertEquals("Quack", behavior);
    }

    @Test
    public void givenModelDuckWhenPerformFlyBehaviorThenReturnNoWay() {
        // Arrange
        ModelDuck duck = new ModelDuck();

        // Act
        String behavior = duck.performFly();

        // Assert
        assertEquals("I can't fly", behavior);
    }
}
