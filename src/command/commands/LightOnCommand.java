package command.commands;

import command.entities.Light;

/**
 * Created by например Андрей
 * on 26.08.2017.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
