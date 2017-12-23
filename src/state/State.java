package state;

/**
 * Created by �������� ������
 * on 23.10.2017.
 */
public interface State {

    /**
     * �������� ������
     */
    void insertQuarter();

    /**
     * ������� ������
     */
    void ejectQuarter();

    /**
     * ������� �����
     */
    void turnCrank();

    /**
     * ������ �����
     */
    void dispense();
}
