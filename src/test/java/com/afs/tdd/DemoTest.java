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
        MarsRover marsRover = new MarsRover(x, y, "N");

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
        MarsRover marsRover = new MarsRover(x, y, "E");

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 1;
        assertEquals(expectedX, marsRover.getX());
    }

}
