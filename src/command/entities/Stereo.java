package command.entities;

/**
 * Created by например Андрей
 * on 27.08.2017.
 */
public class Stereo {

    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Магнитола включена");
    }

    public void off() {

    }

    public void setCD() {
        System.out.println("Диск вставлен");
    }

    public void setDVD() {

    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        System.out.println("Громкость установлена на " + volume);
    }
}
