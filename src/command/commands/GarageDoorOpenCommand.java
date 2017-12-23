package command.commands;

import command.entities.GarageDoor;

/**
 * Created by �������� ������
 * on 26.08.2017.
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
