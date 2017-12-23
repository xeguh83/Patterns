package command;

import command.commands.Command;
import command.entities.Stereo;

/**
 * Created by например Андрей
 * on 27.08.2017.
 */
public class StereoOffCommand implements Command{

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
