package main.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.app.FlyWithRocket;
import main.app.MallardDuck;
import main.app.ModelDuck;
import main.app.Quack;

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

    @Test
    public void givenModelDuckAndSetFlyBehaviorRocketPoweredWhenPerformFlyBehaviorReturnImFlyingWithRocket() {
        // Arrange
        ModelDuck duck = new ModelDuck();
        FlyWithRocket fb = new FlyWithRocket();
        duck.setFlyBehavior(fb);

        // Act
        String behavior = duck.performFly();

        // Assert
        assertEquals("I'm flying with a rocket!", behavior);
    }

    @Test
    public void givenModelDuckWhenPerformQuackBehaviorThenReturnSqeak() {
        // Arrange
        ModelDuck duck = new ModelDuck();

        // Act
        String behavior = duck.performQuack();

        // Assert
        assertEquals("Squeak", behavior);
    }

    @Test
    public void givenModelDuckandSetQuakBehaviorQuackWhenPerformQuackBehaviorReturnQuack() {
        // Arrange
        ModelDuck duck = new ModelDuck();
        Quack qb = new Quack();
        duck.setQuackBehavior(qb);

        // Act
        String behavior = duck.performFly();

        // Assert
        assertEquals("Quack", behavior);
    }
}
