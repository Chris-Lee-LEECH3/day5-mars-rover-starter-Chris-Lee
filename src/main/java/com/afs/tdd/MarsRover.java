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
            if ("N".equals(this.direction)) {
                this.setY(this.getY() + 1);
            }

            if ("E".equals(this.direction)) {
                this.setX(this.getX() + 1);
            }

            if ("S".equals(this.direction)) {
                this.setY(this.getY() - 1);
            }

            if ("W".equals(this.direction)) {
                this.setX(this.getX() - 1);
            }
        }
    }
}
