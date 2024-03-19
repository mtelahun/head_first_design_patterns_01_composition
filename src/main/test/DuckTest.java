package main.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.app.MallardDuck;

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
}
