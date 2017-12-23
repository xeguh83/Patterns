package state;

/**
 * Created by например Андрей
 * on 23.10.2017.
 */
public interface State {

    /**
     * Вставить монету
     */
    void insertQuarter();

    /**
     * Вернуть монету
     */
    void ejectQuarter();

    /**
     * Дернуть рычаг
     */
    void turnCrank();

    /**
     * Выдать шарик
     */
    void dispense();
}
