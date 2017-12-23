package command.entities;

/**
 * Created by например Андрей
 * on 26.08.2017.
 */
public class Light {

    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }

}
