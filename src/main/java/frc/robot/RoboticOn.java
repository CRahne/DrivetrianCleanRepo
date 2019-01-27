package frc.robot;

import frc.robot.Robot1;

public class RoboticOn implements RobotCtrlState{

	private Robot1 robot = new Robot1();
	
	public RoboticOn(Robot1 robot){
		this.robot = robot;
	}
	 
	public void teleOp() {
		System.out.println("Walking...");
	}

	public void Auto() {
		System.out.println("Cooking...");
		robot.setRobotCtrlState(robot.getAuto());
	}
}
