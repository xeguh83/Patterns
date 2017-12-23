package command.commands;

import command.entities.Light;

/**
 * Created by �������� ������
 * on 27.08.2017.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
