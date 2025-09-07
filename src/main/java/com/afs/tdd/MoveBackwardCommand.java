package com.afs.tdd;

public class MoveBackwardCommand implements Command {
    private final MarsRover marsRover;

    public MoveBackwardCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.executeMoveCommand(true);
    }

}
