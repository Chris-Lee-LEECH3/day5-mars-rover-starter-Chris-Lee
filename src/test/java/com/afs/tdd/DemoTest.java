package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    @Test
    public void should_return_y_plus_1_when_0_0_N_and_command_W() {
        // given
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveForwardCommand = new MoveForwardCommand(marsRover);
        marsRoverController.addCommand(moveForwardCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveForwardCommand = new MoveForwardCommand(marsRover);
        marsRoverController.addCommand(moveForwardCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "S";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveForwardCommand = new MoveForwardCommand(marsRover);
        marsRoverController.addCommand(moveForwardCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveForwardCommand = new MoveForwardCommand(marsRover);
        marsRoverController.addCommand(moveForwardCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command turnLeftCommand = new TurnLeftCommand(marsRover);
        marsRoverController.addCommand(turnLeftCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command turnLeftCommand = new TurnLeftCommand(marsRover);
        marsRoverController.addCommand(turnLeftCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "S";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command turnLeftCommand = new TurnLeftCommand(marsRover);
        marsRoverController.addCommand(turnLeftCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command turnLeftCommand = new TurnLeftCommand(marsRover);
        marsRoverController.addCommand(turnLeftCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command turnRightCommand = new TurnRightCommand(marsRover);
        marsRoverController.addCommand(turnRightCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command turnRightCommand = new TurnRightCommand(marsRover);
        marsRoverController.addCommand(turnRightCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "S";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command turnRightCommand = new TurnRightCommand(marsRover);
        marsRoverController.addCommand(turnRightCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command turnRightCommand = new TurnRightCommand(marsRover);
        marsRoverController.addCommand(turnRightCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveBackwardCommand = new MoveBackwardCommand(marsRover);
        marsRoverController.addCommand(moveBackwardCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveBackwardCommand = new MoveBackwardCommand(marsRover);
        marsRoverController.addCommand(moveBackwardCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "S";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveBackwardCommand = new MoveBackwardCommand(marsRover);
        marsRoverController.addCommand(moveBackwardCommand);

        // when
        marsRoverController.executeCommand();

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
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveBackwardCommand = new MoveBackwardCommand(marsRover);
        marsRoverController.addCommand(moveBackwardCommand);

        // when
        marsRoverController.executeCommand();

        // then
        int expectedX = 1;
        int expectedY = 0;
        String expectedDirection = "W";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_y_plus_2_when_0_0_N_and_command_WW() {
        // given
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveFowardCommand = new MoveForwardCommand(marsRover);
        marsRoverController.addCommand(moveFowardCommand);
        marsRoverController.addCommand(moveFowardCommand);

        // when
        marsRoverController.executeCommand();

        // then
        int expectedX = 0;
        int expectedY = 2;
        String expectedDirection = "N";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_2_when_0_0_N_and_command_BB() {
        // given
        int x = 0;
        int y = 0;
        String direction = "N";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveBackwardCommand = new MoveBackwardCommand(marsRover);
        marsRoverController.addCommand(moveBackwardCommand);
        marsRoverController.addCommand(moveBackwardCommand);

        // when
        marsRoverController.executeCommand();

        // then
        int expectedX = 0;
        int expectedY = -2;
        String expectedDirection = "N";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_2_when_0_0_E_and_command_WW() {
        // given
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveFowardCommand = new MoveForwardCommand(marsRover);
        marsRoverController.addCommand(moveFowardCommand);
        marsRoverController.addCommand(moveFowardCommand);

        // when
        marsRoverController.executeCommand();

        // then
        int expectedX = 2;
        int expectedY = 0;
        String expectedDirection = "E";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_1_y_plus_3_direction_N_when_0_0_E_and_command_WLWWW() {
        // given
        int x = 0;
        int y = 0;
        String direction = "E";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveFowardCommand = new MoveForwardCommand(marsRover);
        Command turnLeftCommand = new TurnLeftCommand(marsRover);
        marsRoverController.addCommand(moveFowardCommand);
        marsRoverController.addCommand(turnLeftCommand);
        marsRoverController.addCommand(moveFowardCommand);
        marsRoverController.addCommand(moveFowardCommand);
        marsRoverController.addCommand(moveFowardCommand);

        // when
        marsRoverController.executeCommand();

        // then
        int expectedX = 1;
        int expectedY = 3;
        String expectedDirection = "N";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_3_direction_N_when_0_0_W_and_command_WWWLL() {
        // given
        int x = 0;
        int y = 0;
        String direction = "W";
        MarsRover marsRover = new MarsRover(x, y, direction);

        MarsRoverController marsRoverController = new MarsRoverController();
        Command moveFowardCommand = new MoveForwardCommand(marsRover);
        Command turnLeftCommand = new TurnLeftCommand(marsRover);
        marsRoverController.addCommand(moveFowardCommand);
        marsRoverController.addCommand(moveFowardCommand);
        marsRoverController.addCommand(moveFowardCommand);
        marsRoverController.addCommand(turnLeftCommand);
        marsRoverController.addCommand(turnLeftCommand);

        // when
        marsRoverController.executeCommand();

        // then
        int expectedX = -3;
        int expectedY = 0;
        String expectedDirection = "E";

        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

}
