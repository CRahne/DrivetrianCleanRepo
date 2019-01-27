package frc.robot;

import frc.robot.Robot1;

public class RoboticOff implements RobotCtrlState{

	private Robot1 robot;
	
	public RoboticOff(Robot1 robot){
		this.robot = robot;
	}
	 
	public void teleOp() {
		System.out.println("Walking...");
		robot.setRobotCtrlState(robot.getTeleOp());
	}

	public void Auto() {
		System.out.println("Cannot cook at Off state.");
	}
}
