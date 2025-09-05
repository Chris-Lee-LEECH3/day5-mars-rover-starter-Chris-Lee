package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    @Test
    public void should_return_y_plus_1_when_0_0_N_and_command_W() {
        // given
        String command = "W";
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedY = 1;
        assertEquals(expectedY, marsRover.getY());
    }

    @Test
    public void should_return_x_plus_1_when_0_0_E_and_command_W() {
        // given
        String command = "W";
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 1;
        assertEquals(expectedX, marsRover.getX());
    }

    @Test
    public void should_return_x_minus_1_when_0_0_S_and_command_W() {
        // given
        String command = "W";
        int x = 0;
        int y = 0;
        String direction = "S";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedY = -1;
        assertEquals(expectedY, marsRover.getY());
    }

    @Test
    public void should_return_x_minus_1_when_0_0_W_and_command_W() {
        // given
        String command = "W";
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = -1;
        assertEquals(expectedX, marsRover.getX());
    }


}
