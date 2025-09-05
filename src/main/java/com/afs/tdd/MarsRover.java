package com.afs.tdd;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

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

        if ("W".equals(command)) {
            executeMoveCommand();
        }

        if ("L".equals(command)) {
            executeTurnLeftCommand();
        }

        if ("R".equals(command)) {
            executeTurnRightCommand();
        }

    }

    private void executeTurnRightCommand() {
        switch (this.direction) {
            case "N":
                this.setDirection("E");
                return;
            case "E":
                this.setDirection("S");
                return;
            case "S":
                this.setDirection("W");
                return;
            case "W":
                this.setDirection("N");
                return;
            default:
                return;
        }
    }

    private void executeTurnLeftCommand() {
        switch (this.direction) {
            case "N":
                this.setDirection("W");
                return;
            case "E":
                this.setDirection("N");
                return;
            case "S":
                this.setDirection("E");
                return;
            case "W":
                this.setDirection("S");
                return;
            default:
                return;
        }
    }

    private void executeMoveCommand() {
        if ("N".equals(this.direction)) {
            this.y++;
        }

        if ("E".equals(this.direction)) {
            this.x++;
        }

        if ("S".equals(this.direction)) {
            this.y--;
        }

        if ("W".equals(this.direction)) {
            this.x--;
        }
    }
}
