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
        int expectedX = 0;
        int expectedY = 1;
        String expectedDirection = "N";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
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
        int expectedY = 0;
        String expectedDirection = "E";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
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
        int expectedX = 0;
        int expectedY = -1;
        String expectedDirection = "S";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
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
        int expectedY = 0;
        String expectedDirection = "W";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_0_0_N_and_command_L() {
        // given
        String command = "L";
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = "W";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_0_0_W_and_command_L() {
        // given
        String command = "L";
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = "S";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_0_0_S_and_command_L() {
        // given
        String command = "L";
        int x = 0;
        int y = 0;
        String direction = "S";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = "E";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_0_0_E_and_command_L() {
        // given
        String command = "L";
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = "N";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_0_0_N_and_command_R() {
        // given
        String command = "R";
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = "E";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_0_0_W_and_command_R() {
        // given
        String command = "R";
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = "N";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_0_0_S_and_command_R() {
        // given
        String command = "R";
        int x = 0;
        int y = 0;
        String direction = "S";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = "W";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_0_0_E_and_command_R() {
        // given
        String command = "R";
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = "S";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_1_when_0_0_N_and_command_B() {
        // given
        String command = "B";
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = -1;
        String expectedDirection = "N";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_1_when_0_0_E_and_command_B() {
        // given
        String command = "B";
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = -1;
        int expectedY = 0;
        String expectedDirection = "E";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_y_plus_1_when_0_0_S_and_command_B() {
        // given
        String command = "B";
        int x = 0;
        int y = 0;
        String direction = "S";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 0;
        int expectedY = 1;
        String expectedDirection = "S";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_1_when_0_0_W_and_command_B() {
        // given
        String command = "B";
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        // when
        marsRover.executeCommand(command);

        // then
        int expectedX = 1;
        int expectedY = 0;
        String expectedDirection = "W";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

}
