package command.entities;

/**
 * Created by �������� ������
 * on 27.08.2017.
 */
public class CeilingFan {
    private final String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("���������� �������");
    }

    public void off() {
        System.out.println("���������� ��������");
    }
}
