package frc.robot;

import frc.robot.Robot1;

public class RoboticStandby implements RobotCtrlState{

private Robot1 robot = new Robot1();
	
	public RoboticStandby(Robot1 robot){
		this.robot = robot;
	}
	 
	public void teleOp() {
		System.out.println("In standby state...");
		robot.setRobotCtrlState(robot.getTeleOp());
		System.out.println("Walking...");
	}

	public void Auto() {
		System.out.println("In standby state...");
		robot.setRobotCtrlState(robot.getAuto());
		System.out.println("Cooking...");
	}
}
