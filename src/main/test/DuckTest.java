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
            behavior, 
            "I'm flying!!", 
            "Mallard duck returns string: 'I'm flying!!'");
    }
}
