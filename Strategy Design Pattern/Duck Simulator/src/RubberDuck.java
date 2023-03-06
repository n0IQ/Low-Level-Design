import FlyBehaviour.FlyNoWay;
import QuackBehaviour.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie.");
    }
}
