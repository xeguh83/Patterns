package strategy;

/**
 * Created by например Андрей on 10.11.2016.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public <F extends FlyBehavior, Q extends QuackBehavior> Duck(F flyBehavior, Q quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    /**
     * Все утки уменют плавать
     */
    public void swim() {
        System.out.println("Утка плавает");
    }

    /**
     * Все утки выглядят по разному
     */
    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }


}
