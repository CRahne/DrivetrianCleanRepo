package frc.robot;

import frc.robot.Robot1;

public class RoboticStandby implements RoboticState{

private Robot1 robot = new Robot1();
	
	public RoboticStandby(Robot1 robot){
		this.robot = robot;
	}
	 
	@Override
	public void walk() {
		System.out.println("In standby state...");
		robot.setState(robot.getRoboticOn());
		System.out.println("Walking...");
	}

	@Override
	public void cook() {
		System.out.println("In standby state...");
		robot.setRoboticState(robot.getRoboticCook());
		System.out.println("Cooking...");
	}

	@Override
	public void off() {
		System.out.println("In standby state...");
		robot.setState(robot.getRoboticOff());
		System.out.println("Robot is switched off");
		
	}

}
