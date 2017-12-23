package command.entities;

/**
 * Created by например Андрей
 * on 27.08.2017.
 */
public class CeilingFan {
    private final String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Вентилятор включен");
    }

    public void off() {
        System.out.println("Вентилятор выключен");
    }
}
