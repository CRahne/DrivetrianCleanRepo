package frc.robot;

import frc.robot.Robot1;

public class TestStatePattern {

	public static void main(String[] args) {
		Robot1 robot = new Robot1();
		robot.walk();
		robot.cook();
		robot.walk();
		robot.off();
		
		robot.walk();
		robot.off();
		robot.cook();

	}

}
