package command.entities;

/**
 * Created by например Андрей \
 * on 26.08.2017.
 */
public class GarageDoor {

    private final String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("Garage door moving up");
    }

    public void down() {
        System.out.println("Garage door moving down");
    }

    public void stop() {
        System.out.println("Garage door moving stop");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
