package strategy;

/**
 * Created by �������� ������
 * on 10.11.2016.
 */
public class RedHeadDuck extends Duck {
    public <F extends FlyBehavior, Q extends QuackBehavior> RedHeadDuck(F flyBehavior, Q quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        // ���������� ���������� ��� RedHeadDuck
    }
}
