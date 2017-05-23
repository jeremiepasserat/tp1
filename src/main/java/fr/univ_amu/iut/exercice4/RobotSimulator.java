package fr.univ_amu.iut.exercice4;

import java.util.ArrayList;
import java.util.List;

public class RobotSimulator {
    private Robot robot;
    private String instructions;

    public RobotSimulator(Robot robot, String instructions) {
        this.robot = robot;
        this.instructions = instructions;
    }

    public void simulate() {


        for (int i = 0; i < instructions.length(); ++i) {
            char c = instructions.charAt(i);
            if (c == 'R')
                robot.turnRight();
            else if (c == 'L')
                robot.turnLeft();
            else
                robot.advance();
        }
    }

    public List<Movement> getMovements() {
        ArrayList<Movement> var = new ArrayList<>();
        for (char c : instructions.toCharArray())
        {
            var.add(Movement.getMovement(c));
        }
        return var;
    }
}
