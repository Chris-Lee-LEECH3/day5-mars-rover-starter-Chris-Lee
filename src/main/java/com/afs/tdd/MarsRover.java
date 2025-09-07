package com.afs.tdd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private String direction;
    private List<String> directions = new LinkedList<>(Arrays.asList("N", "E", "S", "W"));

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void executeCommand(String command) {
        char[] commands = command.toCharArray();
        for (char singleCommand : commands) {
            executeSingleCommand(String.valueOf(singleCommand));
        }
    }

    private void executeSingleCommand(String command) {
        if ("W".equals(command)) {
            executeMoveCommand(false);
        }

        if ("L".equals(command)) {
            executeTurnLeftCommand();
        }

        if ("R".equals(command)) {
            executeTurnRightCommand();
        }

        if ("B".equals(command)) {
            executeMoveCommand(true);
        }
    }

    public void executeTurnRightCommand() {
        turn(false);
    }

    public void executeTurnLeftCommand() {
        turn(true);
    }

    private void turn(boolean isTurnLeft) {
        int moveStep = isTurnLeft ? -1 : 1;
        int currentDirectionIndex = directions.indexOf(this.direction);
        int calculatedNextDirectionIndex = (currentDirectionIndex + moveStep) % directions.size();
        int newDirectionIndex = calculatedNextDirectionIndex < 0 ? directions.size() - 1: calculatedNextDirectionIndex;
        this.direction = directions.get(newDirectionIndex);
    }

    public void executeMoveCommand(boolean isMoveBackward) {
        int moveStep = isMoveBackward ? -1 : 1;

        if ("N".equals(this.direction)) {
            this.y += moveStep;
        }

        if ("E".equals(this.direction)) {
            this.x += moveStep;
        }

        if ("S".equals(this.direction)) {
            this.y -= moveStep;
        }

        if ("W".equals(this.direction)) {
            this.x -= moveStep;
        }
    }

}
