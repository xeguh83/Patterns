package state;

/**
 * Состояние нет монеты
 * Created by например Андрей
 * on 23.10.2017.
 */
public class NoQuaterState implements State {

    private GumballMachine gumballMachine;

    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven`t insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there`s no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
