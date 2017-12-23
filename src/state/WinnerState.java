package state;

/**
 * Состояние выигрыша 2 шаров по цене 1
 * Created by например Андрей
 * on 23.10.2017.
 */
public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait wa`re already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesnt get you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("You are a winner! You get two gumballs for you quarter!!!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops out of gumballs!!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
