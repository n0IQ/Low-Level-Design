import FlyBehaviour.FlyWithWings;
import QuackBehaviour.FakeQuack;
import QuackBehaviour.Quack;
import QuackBehaviour.Squeak;

public class ReadHeadDuck extends Duck {
    public ReadHeadDuck() {
        flyBehaviour= new FlyWithWings();
        quackBehaviour = new FakeQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
