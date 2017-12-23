package command;

import command.commands.Command;
import command.commands.NoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by например Андрей
 * on 27.08.2017.
 */
public class RemoteControl {
    private final List<Command> onCommands;
    private final List<Command> offCommands;

    public RemoteControl() {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);
    }

    public void onButtonWasPushed(int slot) {
        onCommands.get(slot).execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands.get(slot).execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n -----  Remote Control ----- \n");
        for (int i = 0; i < onCommands.size(); i++) {
            sb.append("[slot " + i + "] " + onCommands.get(i).getClass().getName()
                    + "   " + offCommands.get(i).getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
