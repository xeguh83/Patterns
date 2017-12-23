package command.commands;

import command.entities.CeilingFan;

/**
 * Created by например Андрей
 * on 27.08.2017.
 */
public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}
