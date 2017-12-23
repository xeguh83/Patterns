package state;

/**
 * Created by например Андрей
 * on 23.10.2017.
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No need of quarters. There is no gumballs left");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the crank. But no gumballs or quarters left");
    }

    @Override
    public void dispense() {
        System.out.println("Nothing to dispense. There is no gumballs left");
    }
}
