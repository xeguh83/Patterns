package compoundpatterns;

/**
 * Created by например Андрей
 * on 06.11.2017.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);

    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(goose);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);


        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();

        System.out.println("\nDuck Simulator");

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);

        flockOfDucks.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("Whole flok simulator");
        simulate(flockOfDucks);

//        System.out.println("FlockOfMallards");
//        simulate(flockOfMallards);

        System.out.println("Ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
