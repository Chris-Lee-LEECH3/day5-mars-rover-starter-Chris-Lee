package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverController {
    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }

}
