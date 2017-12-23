package command.commands;

import command.entities.GarageDoor;

/**
 * Created by �������� ������
 * on 27.08.2017.
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
