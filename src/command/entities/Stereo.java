package command.entities;

/**
 * Created by �������� ������
 * on 27.08.2017.
 */
public class Stereo {

    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("��������� ��������");
    }

    public void off() {

    }

    public void setCD() {
        System.out.println("���� ��������");
    }

    public void setDVD() {

    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        System.out.println("��������� ����������� �� " + volume);
    }
}
