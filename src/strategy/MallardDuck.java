package strategy;

/**
 * Created by �������� ������ on 10.11.2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        // ���������� ���������� ��� MallardDuck
    }
}
