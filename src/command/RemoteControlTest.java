package command;

import command.commands.GarageDoorOpenCommand;
import command.commands.LightOnCommand;
import command.entities.GarageDoor;
import command.entities.Light;

/**
 * Created by например Андрей
 * on 26.08.2017.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor door = new GarageDoor("");
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(door);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(doorOpenCommand);
        remote.buttonWasPressed();
    }
}