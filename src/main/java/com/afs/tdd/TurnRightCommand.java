package com.afs.tdd;

public class TurnRightCommand implements Command {
    private final MarsRover marsRover;

    public TurnRightCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.executeTurnRightCommand();
    }

}
