import FlyBehaviour.FlyNoWay;
import FlyBehaviour.FlyRocketPowered;
import QuackBehaviour.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        mallard.setFlyBehaviour(new FlyNoWay());
        mallard.setQuackBehaviour(new MuteQuack());

        mallard.performFly();
        mallard.performQuack();

        Duck redHead = new ReadHeadDuck();
        redHead.display();
        redHead.performFly();
        redHead.performQuack();

        redHead.setFlyBehaviour(new FlyRocketPowered());
        redHead.performFly();
    }
}