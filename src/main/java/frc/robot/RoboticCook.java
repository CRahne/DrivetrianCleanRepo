package frc.robot;

import frc.robot.Robot1;

public class RoboticCook implements RobotCtrlState{

	private Robot1 robot = new Robot1();
	
	public RoboticCook(Robot1 robot){
		this.robot = robot;
	}
	 
	public void teleOp() {
		System.out.println("Walking...");
		robot.setRobotCtrlState(robot.getTeleOp());
	}

	public void Auto() {
		System.out.println("Cooking...");
	}
}
